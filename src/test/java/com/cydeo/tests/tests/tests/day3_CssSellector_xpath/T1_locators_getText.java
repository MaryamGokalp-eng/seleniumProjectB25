package com.cydeo.tests.tests.tests.day3_CssSellector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();//Set up browser
        WebDriver driver = new ChromeDriver();//get ChromeBrowser
        driver.manage().window().maximize();//maximize browser

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Next 2 locate WebElement we can say driver findElement 4 the 1st we can say className below
        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        inputUsername.sendKeys("incorrect"); //U can say inputUsername.sendKeys "incorrect"

        //4- Enter incorrect password: “incorrect”
        //To auto generate local variable, once U get "USER_PASSWORD" from our Chrome WebPage, I want 2 use my name
        //once U get userPassword U can say river.findElement get the name & pass USER_PASSWORD 2 create variableBelow
        //When U use ShortCut will automaticGenerate WebElement & guess WhateverLine & type of variable U try 2 return.
        //Mac: option + enter
        //Windows: alt + enter
        WebElement inputPassword= driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));//locateLoginButton on WebPage
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        //Need to locate ErrorMessage on my workingChromeWebPage inspect & locate the errortext
        //The LineBelow I need to use errorMessage coz I got my actualValueFromTheBrowser & errorMessage is WebElement
        //We store errorMessageInsideWebElement so I create a string & try 2 store string inside the WebElement
        //I can say getText  2 GetWebElement&ReturnAs a String
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();//create a string try 2 store WebElementInsideTheString

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else{
            System.out.println("Error message verification FAILED!!!");
        }

    }

}
