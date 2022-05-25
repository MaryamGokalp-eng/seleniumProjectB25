package com.cydeo.tests.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//ConfigurationReader we created to b able to read from configuration property
public class ConfigurationReader {

    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    //USE THE() BELOW TO GET ANY PROPERTY AND KEY FROM CONFIGURATION PROPERTIES
    //Below Simple static method help us to read all the above logic and return us the value
    //For that we call getProperty & say string keyword--> public static String getProperty(String keyword){
    //CreateAllLogic NowWeSayReturnMeProperty.GetProperty()keywordReturn value-->return properties.getProperty(keyword);

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}