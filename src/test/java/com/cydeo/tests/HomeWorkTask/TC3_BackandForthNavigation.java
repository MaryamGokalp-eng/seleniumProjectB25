package com.cydeo.tests.HomeWorkTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_BackandForthNavigation {

    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser.
        WebDriverManager.chromedriver().setup(); // I am setting up my ChromeDriver
        WebDriver driver = new ChromeDriver(); //This line opens an empty Chrome webPage

        //driver.navigate().to("https://google.com"),if cannot find theLink the rest of the code won't execute
        driver.get("https://google.com");

        // 3- Click to Gmail from top right.
        //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();// we have getTitle() method in Selenium WebDriver library
        System.out.println("actualTitle = " + actualTitle);
        // As a tester, without verification/validation what is your VALUE to the Company

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("titled: passed");
        } else {
            System.out.println("titled: Fail");

        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google

        String expectedTitle2 = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle2)) {
            System.out.println("titled: passed");
        } else {
            System.out.println("titled: Fail");
        }

    }

}


/*
//TC #3: Back and forth navigation
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Click to Gmail from top right.
    //4- Verify title contains:
    //  Expected: Gmail
    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //  Expected: Google
 */