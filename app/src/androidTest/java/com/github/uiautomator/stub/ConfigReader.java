package com.github.uiautomator.stub;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static int getPortFromConfig() {
        Properties properties = new Properties();
        int port = 9008;
        try {
            FileInputStream inputStream = new FileInputStream("/sdcard/config.properties");
            properties.load(inputStream);
            port = Integer.parseInt(properties.getProperty("port", "9008"));
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return port;
    }
}
