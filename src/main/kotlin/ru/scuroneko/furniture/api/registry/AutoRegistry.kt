package ru.scuroneko.furniture.api.registry

import com.google.common.base.CaseFormat
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.registry.annotations.NameCase
import ru.scuroneko.furniture.api.registry.annotations.NoRegistry
import ru.scuroneko.furniture.api.registry.annotations.RegistryName
import ru.scuroneko.furniture.api.registry.annotations.RegistryNamespace
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotations
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.starProjectedType

open class AutoRegistry<T : Any> {
    inline fun <reified T : Any> processField(
        field: KProperty1<out IRegistryContainer<T>, *>,
        container: IRegistryContainer<T>,
        modId: String
    ): RegistryInfo<T>? {
        val noRegistryAnnotation = field.findAnnotations(NoRegistry::class)
        if (noRegistryAnnotation.isNotEmpty()) return null
        if (!field.getter.returnType.isSubtypeOf(T::class.starProjectedType)) return null

        val obj = field.getter.call(container) as T
        val caseFormatAnnotation = field.findAnnotations(NameCase::class)
        val case = if (caseFormatAnnotation.isNotEmpty()) caseFormatAnnotation[0].case else CaseFormat.UPPER_UNDERSCORE

        val registryNameAnnotation = field.findAnnotations(RegistryName::class)
        val name = if (registryNameAnnotation.isNotEmpty()) registryNameAnnotation[0].name
        else case.converterTo(CaseFormat.LOWER_UNDERSCORE).convert(field.name)

        val namespaceAnnotation = field.findAnnotations(RegistryNamespace::class)
        val customNamespace = namespaceAnnotation.isNotEmpty()
        val namespace = if (customNamespace) namespaceAnnotation[0].namespace else modId
        container.beforeEach(obj)
        Registry.register(container.getRegistry(), Identifier(namespace, name), obj)
        container.afterEach(obj)
        return RegistryInfo(obj, name!!, namespace)
    }

    inline fun <reified T : Any> processContainer(container: IRegistryContainer<T>, modId: String) {
        val cls = container::class

        var counter = 0
        container.beforeRegistry()
        cls.memberProperties.forEach { field ->
            this.processField(field, container, modId)
            counter++
        }
        container.afterRegistry()
        ScuroFurniture.LOGGER.info("Registered $counter objects in ${container::class.simpleName}")
    }
}