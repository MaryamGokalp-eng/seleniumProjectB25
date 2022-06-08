package com.cydeo.tests.tests.tests.day3_CssSellector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
      //WebElement signInButton=driver.findElement(By.className("login-btn"));//oldWay.InsteadOfClasName use cssSelector
        //LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
        //	REMEMBER                   tagName[attribute='value']
        //	REMEMBER                   input[class='login-btn']
        // Above statement CustomGenerator tagName toGive moreWay to locate the webElement
        // LOCATED USING CLASS ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        // LOCATED USING TYPE ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        // LOCATED USING VALUE ATTRIBUTE
        //lineBelowDifference is InsteadOfClasName use cssSelector & insteadOf passTestDirect weFollowsThe CSS syntest
        //B4 Run my code I canPaste This input[class='login-btn'] to see ifLocate on myWeb to see if Can find anything
        //If is not find on the WebPage inspect finding search Bar is not going to work on selenium
        //this version we can locate whateverWe want to locate getInput fromWeb &
      WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));//cssSelector & CSS syntest

        String expectedButtonText = "Log In";

        //Getting the name value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed!");
        }
    }
}