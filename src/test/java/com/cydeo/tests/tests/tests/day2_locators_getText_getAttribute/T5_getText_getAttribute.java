package com.cydeo.tests.tests.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser.
        WebDriverManager.chromedriver().setup(); //set browser driver
        WebDriver driver = new ChromeDriver(); //get new browser
        driver.manage().window().maximize(); //maximizing
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form"); //get ourPage

        //3- Verify header text is as expected:
        //If U don't C any attribute,use the TAG name locator ("h2")) to locate our header add (By.tagName("h2"))
        //Since return the webElement ("h2")) I need to  store inside the WebElement not a String
        //First We need to locate the WebElement more details on the 1st link below
        WebElement headerText = driver.findElement(By.tagName("h2"));//located ourHeader & storedInside HeaderText below
        //Expected: Registration form from the Google test WebSite. Once U click on your "Registration form" header
        //Once locate U can add String to your header
        String expectedHeaderText = "Registration form"; //Create Expected HeaderText
        String actualHeaderText = headerText.getText(); //We use getText, 2 find & return "Registration form" as String

        if (actualHeaderText.equals(expectedHeaderText)){ //Do verification & print
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!!!");
        }

        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value
        //WebElement firstNameInput = driver.findElement I use className to find the attribute to locate WebElement
        WebElement firstNameInput = driver.findElement(By.className("form-control")); //Located the webElement

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name from our GoogleWebPage Registration form 2 verify placeholder attribute value below
        //GetPlaceHolder store insideNewString
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");//Get the Attribute Value

        if (actualPlaceHolder.equals(expectedPlaceHolder)){//Do verification & Print
            System.out.println("Placeholder text verification PASSED!");
        }else{
            System.out.println("Placeholder text verification FAILED!!!");
        }

        driver.close();

    }

}