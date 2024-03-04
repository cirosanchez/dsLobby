package me.cirosanchez.blaze.configuration

import org.bukkit.plugin.Plugin

class ConfigurationProvider(val plugin: Plugin) {
    fun init(): ConfigurationProvider {
        plugin.saveDefaultConfig()
        return this
    }
}