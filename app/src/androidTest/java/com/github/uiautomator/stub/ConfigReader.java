package com.github.uiautomator.stub;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static int getPortFromConfig() throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("/sdcard/Android/data/com.github.uiautomator/files/config.properties");
        properties.load(inputStream);
        int port = Integer.parseInt(properties.getProperty("port"));
        inputStream.close();
        return port;
    }
}
