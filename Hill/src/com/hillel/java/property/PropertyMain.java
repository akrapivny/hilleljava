package com.hillel.java.property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by AKRAPIVNY on 04.06.2015.
 */
public class PropertyMain {
    public static void main(String[] args) {
        Properties mainProperties = loadPropeties("hill/main_config.properties");

        String file =mainProperties.getProperty("file_to_use");
        Properties properties=  loadPropeties("hill/" + file);

        String police = properties.getProperty("police");
        String ambulence = properties.getProperty("ambulence");
        String firestation = properties.getProperty("firestation");
        String noExisted = properties.getProperty(" ");
        System.out.println("not exist value: " +noExisted);
        System.out.println("emergenct numbers: "+police+", "+ambulence+", "+ firestation);
    }

    private static Properties loadPropeties(String filename) {
        Properties properties = new Properties();

        try (FileReader reader = new FileReader(filename)) {
            properties.load(reader);
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return properties;
    }
}
