package ru.scuroneko.furniture.config

import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import ru.scuroneko.furniture.ScuroFurniture

@Config(name = ScuroFurniture.MOD_ID)
class ScuroFurnitureConfig : ConfigData {
    var isRoadModuleEnabled = true
    var isCarpenterModuleEnabled = true
}