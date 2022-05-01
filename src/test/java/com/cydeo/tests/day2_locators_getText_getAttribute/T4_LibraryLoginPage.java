package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        // The webElement on your inspect from the web that accept input from the user are? INPUT TAG
        //From the WebElement inspect page that accept value from the user both email & password
        //They both have type,ID & class attribute & to log in on libraryWebpage, using "form-control"input 4 the email
        //It's find & return 2 me the 1st matching one result,I need to add (By.className plus ("form-control"));
        // to locate the username. Next type usernameInput.sendKeys("incorrect@email.com");
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        //Use "inputPassword" for the password
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed.
    }

}