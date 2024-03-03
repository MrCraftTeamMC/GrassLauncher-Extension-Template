package com.example.grasslauncher.extensiontemplate;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class ExampleExtensionTest {
    private final Logger logger = LoggerFactory.getLogger(ExampleExtensionTest.class);

    @Test
    public void getRes() {
        ClassLoader loader = ExampleExtension.class.getClassLoader();
        InputStream is = loader.getResourceAsStream("grasslauncher.extension.yml");
    }
}
