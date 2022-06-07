package com.cydeo.reviewWithOscar.avengerHours;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBaseForAvengers {

    @BeforeMethod
    public void setUpTestEnvironment(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlExercise"));
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        //     Driver.closeDriver();
    }


}