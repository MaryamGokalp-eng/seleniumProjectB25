package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1-Setting up the web driver manager once u typing to import type & press enter to import
        // 4 class purpose use chromedriver & web browser line bellow
        // We create our "Browser Driver".

        WebDriverManager.chromedriver().setup();

        //2-Create instance of the chrome driver object in line bellow
        WebDriver driver = new ChromeDriver();

        //3-Test if driver is working as expected, once you run the class it open the Google browser
        // on the computer & go straight to the web now ur programme is all set and ready to go
        // if you see the red message even see failed it is normal its just selenium default line that is print on the console
        //driver.get("https://www.facebook.com");

    }
}
