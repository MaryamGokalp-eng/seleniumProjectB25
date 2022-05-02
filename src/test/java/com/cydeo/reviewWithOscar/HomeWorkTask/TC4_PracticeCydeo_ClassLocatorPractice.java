package com.cydeo.reviewWithOscar.HomeWorkTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_PracticeCydeo_ClassLocatorPractice {

    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //2- Go to: https://practice.cydeo.com/inputs
        //driver.navigate().to("https://practice.cydeo.com/inputs"),ifTheLink cannotFind theRest ofTheCode won't execute
        driver.get(" https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        //PS:Locate “Home” link using “className” locator
        //driver.findElement(By.linkText(HomeLinkClassNameLocator )).click();
        //Below We located this WebElement--->driver.findElement(By.linkText("By.linkText(HomeLinkClassNameLocator" ));
        //We stored inside this webElement Type come from selenium HomeLinkClassNameLocator (storeInsideItOwnContainer)
        //short and clean code below
        WebElement HomeLinkClassNameLocator = driver.findElement(By.linkText("By.linkText(HomeLinkClassNameLocator"));
        HomeLinkClassNameLocator.click();

        //4- Verify title is as expected:
        //Expected: Practice
        //Next create two string
        String expectedTitle = "HomeLinkClassNameLocator";
        String actualTitle = driver.getTitle();// we have getTitle() method in Selenium WebDriver library

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("titled: passed");
        } else {
            System.out.println("titled: Fail");
            System.out.println("actualTitle = " + actualTitle);

        }

    }
}

/*
  //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        //3- Click to “Home” link
        //4- Verify title is as expected:
        //Expected: Practice
        //
        //PS: Locate “Home” link using “className” locator
 */
