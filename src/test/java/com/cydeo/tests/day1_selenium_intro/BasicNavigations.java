package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the "Selenium WebDriver" Implementation will appear on the below note
        //The line below it will open an empty browser
        WebDriver driver = new ChromeDriver();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds that's how we are going to be able to slow the selenium down
        // by using Thread.sleep so when is get compiler error on sleep u need to handle on the lazy way for no
        // To handle exception click on add exception to the method signature
        // Java run the code top 2 bottom & left 2 right so when it comes to ChromeDrive line it will open an empty browser
        // so every time when u run specific code it generate specific id for that specific run time, it open a new browser.

        //Stop code for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

       // use selenium to navigate forward
        //selenium session is create everytime when u run a selenium code
        driver.navigate().forward();


    }
}
