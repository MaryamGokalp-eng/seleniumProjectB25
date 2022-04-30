package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        // TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        // method we need to use to open our page is on the sentence below
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains, and we use our driver and getCurrent URL &  create a simple if condition bellow
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL Verification FAILED");

        }
         //4. Verify title:
         //Expected: Practice
         // To get my  actual title driver getTitle & driver will locate & find the specific element
         String expectedTitle = "Practice";
         String actualTitle = driver.getTitle();

          // next check is the actual titled is match expected title practice say equals(expectedTitle
          if (actualTitle.equals(expectedTitle)){
              System.out.println("Title verification PASSED");
          }else {
              System.out.println("Title Verification FAILED");

          }
           // I am comparing two different strings on this project
           // is very important to comment & explain what you are doing with the codes to understand
          driver.close();

          // break 15mins: 10. 10am cst
          //break 15mins: 11.10 EST

           // To do any action on webElement we need to locate webElement 2 work on, then learn some methods
           // from selenium livraria 1st findElement(), locator methods, so once u decide which action
           // U need 2 find & apply the method on your located webElement.


    }
}
