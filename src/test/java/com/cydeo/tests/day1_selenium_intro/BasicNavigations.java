package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the "Selenium WebDriver" Implementation will appear on the below note
        //The line below it will open my browser
        WebDriver driver = new ChromeDriver();

        // place driver line after my ChromeDriver & it will maximize the browser size
        driver.manage().window().maximize();

        // this () below is almost the same to maximize but sometime don't work in windows
        // driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds that's how we are going to be able to slow the selenium down
        // by using Thread.sleep so when is get compiler error on sleep u need to handle the exception by click on add exception to the method signature
        // Java run the code top 2 bottom & left 2 right so when it comes to ChromeDrive line it will open an empty browser
        // so every time when u run specific code it generate specific id for that specific run time, it opened a new browser.
        // get the title of the page & print URL after the titled
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentUrl);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        //selenium session is created everytime when u run a selenium code
        driver.navigate().forward();

        // stop code execution for 3seconds in each step
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 3seconds in each step
        Thread.sleep(3000);

        // use navigate().to(); I need to call my title again by rea-signed currentTitle equal diver.getTitle
        //the Selenium check the title & return the value, if I am in GooglePage GetGoogleTitle, return & print
        driver.navigate().to("https://www.google.com");

        // To get the two title I should print 2x the currentTitle after getting the Google page
        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium 4 me 2 get 2 different URL Tesla & Google URL
        //Summary try to get title & URL from 2 different pages  & You can inspect the web page to see the changes
        // create one string call one method 2 print one value
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentUrl);

        // To avoid get Google driver on my computer Dock after write ur code add driver.close(); 2 close current window
        driver.close();

        // this will close all of the opened windows
        driver.quit();





    }
}