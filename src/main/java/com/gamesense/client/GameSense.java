package com.gamesense.client;

import me.zero.alpine.EventBus;
import me.zero.alpine.EventManager;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameSense implements ModInitializer {

    public static final String MODNAME = "GameSense";
    public static final String MODID = "gamesense";
    public static final String MODVER = "fd2.3.0";
    /**
     * For Fabric only:
     * Official release starts with a "f", dev versions start with a "fd" to bypass version check
     */

    public static final Logger LOGGER = LogManager.getLogger(MODNAME);
    public static final EventBus EVENTBUS = new EventManager();

    public static GameSense INSTANCE;

    public GameSense() {
        INSTANCE = this;
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Starting up " + MODNAME + " " + MODVER + "!");
        startClient();
        LOGGER.info("Finished initialization for " + MODNAME + " " + MODVER + "!");
    }

    private void startClient() {

    }
}