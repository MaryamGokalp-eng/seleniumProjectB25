package com.cydeo.tests.tests.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

      //TC #3: Back and forth navigation
      // 1- Open a Chrome browser, doing setUp & Maximizing my page
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      //2- Go to: https://practice.cydeo.com
      driver.get("https://practice.cydeo.com");

      //3- Click to A/B Testing from top of the list.
      //Next we need 2 use findElement method code below doNot select elements() coz U getDifferent result
      // The By.linkText() then go 2 ur code & click on ur link 2 inspect select A/BTesting, inspect doubleClick A/BTesting text
      //We use findElement(),then apply linkText() 2 findLocation 2 GetText on the TestAutomation webPage
      // the line below go to the HTML code find the link & return 2 us, so when I run create a string
      //Thread.sleep(2000);
      //driver.findElement(By.linkText("A/B Testing")).click();
       WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
       abTestLink.click();

        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!!!");
            // on the above block we getTitle & reassigned to the user
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Practice
        expectedTitle= "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //BREAK UNTIL 1.01PM CST
        //BREAK UNTIL 2.01PM EST


    }

}