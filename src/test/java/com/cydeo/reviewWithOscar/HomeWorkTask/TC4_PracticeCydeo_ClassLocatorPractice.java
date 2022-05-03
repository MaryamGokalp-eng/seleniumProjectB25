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
        //When I go to my chrome webpage controlled by automated test software
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Titled is as expected: Verification Passed");
        } else {
            System.out.println("Titled is NOT as expected: Verification Failed");
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
