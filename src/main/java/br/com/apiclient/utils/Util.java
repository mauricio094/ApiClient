package br.com.apiclient.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by macau on 10/07/17.
 */
public class Util {

    public static FileInputStream getFile() {
        FileInputStream file = null;
        try {
            file = new FileInputStream("/home/macau/Documentos/desenvolvimento/ApiClient/src/main/resources/product.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return file;
    }
    public static String readProperties(String name) {
        Properties props = new Properties();
        try {
            props.load(getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(name);
    }

    public static void writeProperties(String name, String value) {
        Properties props = new Properties();
        try {
            props.load(getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        props.setProperty(name, value);
    }
}