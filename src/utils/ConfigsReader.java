package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// NOTE: THIS CLASS READS FROM THE PROPERTIES FILE. Alternative name, to this class, could be "ReadFromProperties"

public class ConfigsReader {
        static Properties properties;

    public static void loadProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }

}
