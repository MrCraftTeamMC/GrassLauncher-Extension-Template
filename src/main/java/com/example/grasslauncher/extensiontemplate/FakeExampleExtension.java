package com.example.grasslauncher.extensiontemplate;

import xyz.mrcraftteammc.grasslauncher.extension.Extension;
import xyz.mrcraftteammc.grasslauncher.extension.ExtensionManifest;
import xyz.mrcraftteammc.grasslauncher.extension.exception.ExtensionException;

public class FakeExampleExtension extends Extension {
    public FakeExampleExtension() {
        super(ExtensionManifest.defaultManifest());
    }

    @Override
    public void onLoad() throws ExtensionException {
        this.getLogger().info("Fake!");
    }
}
