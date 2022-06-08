package com.cydeo.tests.tests.tests.day8_Properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //This Class allow us to get value from the property to get the userName of yu computer
        //This argument below you give the key & provide you the value.
        // You pass the Key is -->: os.name and returns you the value-->Mac OS X
        //key = value
        //os.name = Mac OS X
        //user.name = CyberTekChicago-1
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }

}