package com.cydeo.tests.day8_Properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//ToGetOurPath2OurClassRightClick File->(CONFIGURATION.PROPERTIES) thatYouWantToGetThePathSelect->CopyPath/Reference
//Then select-->Path from Content Root --> FileInputStream file = new FileInputStream("configuration.properties");
//

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object
        //IfCompileWhenRight-->properties.load(file); through-->throws IOException toHandle theSuperClass+HandleChild
        properties.load(file);



       //TheObjectIsReadsOurDataJustPrintTheValueWeHave-->System.out.println("properties.getProperty(\"browser\") = "
        //Once you print is just make sure you print the right data-->+ properties.getProperty("browser"));

        //4- Use "properties" object to read value
        System.out.println("properties.getProperty(\"browser\") = "
                + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = "
                + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = "
                + properties.getProperty("username"));

    }

}
