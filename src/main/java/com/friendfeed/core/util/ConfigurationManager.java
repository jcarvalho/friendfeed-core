package com.friendfeed.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {

    private static final Properties properties = new Properties();

    static {
        try {
            InputStream stream = ConfigurationManager.class.getClassLoader().getResourceAsStream("/configuration.properties");
            properties.load(stream);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static String getConsumerKey() {
        return properties.getProperty("oauth.consumerkey");
    }

    public static String getConsumerSecret() {
        return properties.getProperty("oauth.consumersecret");
    }

    public static String getProperty(String string) {
        return properties.getProperty(string);
    }

}
