package com.cydeo.tests.day7;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//thisIsHowToHandleFourTestCaseScenarioBelow
//JavaScript Selenium Library Help YouTpRunYourTestCases at Once

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){
        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy-paste the lines from below into your class
        //HereBelow We are downCasting Casting-->driver Type To The-->(JavascriptExecutor)
        //OtherWiseWeWontBeAbleToReachThis-->executeScript<--topic
        //FunctionWeUseJavaScript()-->window.open inside-->
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        //CreateSetOfString1st&ISayDriverGetWindowHandle--> Set<String> allWindowHandles = driver.getWindowHandles();
       //Iter+Enter4ForEachLoop.INeed2LookThroughIsWidowHandle-->for(String windowHandle :driver.getWindowHandles()){
        //then I Can Say Driver Switch To Window Each-->driver.switchTo().window(each);
        //-->GetCurrentURLICanSay-->CurrentURL:"+ driver.getCurrentUrl
        // PrintToGet&SeeWhereIsTheCurrentURL-->System.out.println("Current URL: " + driver.getCurrentUrl());
        //ToStopSwitchWeCanSayIsDriverGetTheCurrent URL-->if ( (driver.getCurrentUrl().contains("etsy"))){
        //BreakALoopForContinues I stay on This pageApplyBreak-->break;

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles){

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if ( (driver.getCurrentUrl().contains("etsy"))){
                break;
            }


        }

        //5. Assert.Title contains "Etsy"
        //Lines to be posted

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");
    }
}