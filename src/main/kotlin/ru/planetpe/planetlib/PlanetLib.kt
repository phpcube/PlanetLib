package ru.planetpe.planetlib

import cn.nukkit.plugin.PluginBase

class PlanetLib : PluginBase() {

    companion object {
        private lateinit var instance: PlanetLib
        fun setInstance(instance: PlanetLib) {
            Companion.instance = instance
        }
        fun getInstance(): PlanetLib {
            return instance
        }
    }
    private val prefix = "§8[§bPlanetLib§8]§f "

    override fun onEnable() {
        setInstance(this)
        logger.info("$prefix Плагин загружен, версия: ${this.description.version}")
    }

    override fun onDisable() {
        logger.info("$prefix Плагин выгружен, версия: ${this.description.version}")
    }

}