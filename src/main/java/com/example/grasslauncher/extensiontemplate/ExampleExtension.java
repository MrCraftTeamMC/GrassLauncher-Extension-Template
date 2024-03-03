package com.example.grasslauncher.extensiontemplate;

import org.slf4j.Logger;
import xyz.mrcraftteammc.grasslauncher.extension.Extension;
import xyz.mrcraftteammc.grasslauncher.extension.annotations.ExtensionInstance;
import xyz.mrcraftteammc.grasslauncher.extension.exception.ExtensionException;

import java.util.Random;

@ExtensionInstance
public class ExampleExtension extends Extension {
    private final Logger logger = super.getLogger();
    private final Random random = new Random();

    public ExampleExtension() {
        super("example");
    }

    @Override
    public void onLoad() throws ExtensionException {
        logger.info("Hello ExampleExtension!");
        logger.info("Your lucky number today: {}", random.nextInt(100));
    }
}
