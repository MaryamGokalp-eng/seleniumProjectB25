package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser.
        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verification title:
        // Expected: Yahoo | Mail,Search,Politics,News,Finance,Sport & Videos
        String expectedTitle = "Yahoo | Mail,Search,Politics,News,Finance,Sport & Videos";

        //Expected: Yahoo actual title comes from the browser
        // We are going 2 create a simple if condition 2 do the verification2 check if actualTitle.equals(expectedTitle
        // if passes
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            // then print out
            System.out.println("Title is as expected. Verification PASSED");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");


        }


    }
}
