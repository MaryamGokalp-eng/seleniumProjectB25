package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        // to get our page we need to use the method
        driver.navigate().to("https://practice.cydeo.com");


        //3. Verify URL contains
        //Expected: cydeo.
        String expectedURL ="cydeo";
       // to get our actual URL We need to get the driver, then get current URL
        //Next I get to get my equals condition
        String actualURL = driver.getCurrentUrl();
        if (actualURL.equals(expectedURL)) {
            //to see if URL work once u print add something inside the ()
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        //4. Verify title:
        //Expected: Practice
        // for me to get the actual title driver.getTitle
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();





    }
}
