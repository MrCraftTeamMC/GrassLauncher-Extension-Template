package com.example.grasslauncher.extensiontemplate;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.slf4j.Logger;
import xyz.mrcraftteammc.grasslauncher.extension.Extension;
import xyz.mrcraftteammc.grasslauncher.extension.ExtensionManifest;
import xyz.mrcraftteammc.grasslauncher.extension.annotations.ExtensionInstance;
import xyz.mrcraftteammc.grasslauncher.extension.exception.ExtensionException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@ExtensionInstance
public class ExampleExtension extends Extension {
    private final Logger logger = super.getLogger();
    private final Random random = new Random();

    public ExampleExtension() throws IOException {
        super(getExtensionManifest());
    }

    @Override
    public void onLoad() throws ExtensionException {
        logger.info("Hello ExampleExtension!");
        logger.info("Your lucky number today: {}", random.nextInt(100));
    }

    public static ExtensionManifest getExtensionManifest() throws IOException {
        YAMLMapper mapper = new YAMLMapper();
        InputStream stream = ExampleExtension.class.getResourceAsStream("/grasslauncher.extension.yml");
        return mapper.readValue(stream, ExtensionManifest.class);
    }
}
