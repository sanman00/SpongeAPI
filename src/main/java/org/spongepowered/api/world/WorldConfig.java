package org.spongepowered.api.world;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;

public interface WorldConfig {

    /**
     * Reloads the configuration for this world.
     */
    void reload();

    /**
     * Saves all changes to the configuration.
     */
    void save();

    /**
     * Gets the section of the configuration that belongs to this plugin.
     * 
     * @param plugin The plugin whose section is to be retrieved
     * @return A node that represents the configuration section that belongs to
     *     this plugin
     */
    CommentedConfigurationNode getPluginSection(Object plugin);

    /**
     * Gets the specified setting from the configuration.
     * 
     * @param key The key of the setting
     * @return A node that represents the setting
     */
    CommentedConfigurationNode getSetting(String key);

    /**
     * Gets the world that this configuration belongs to.
     * 
     * @return The world that this configuration belongs to
     */
    World getWorld();

}
