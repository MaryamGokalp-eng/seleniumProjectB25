package com.cydeo.tests.utilities;

  /*
   In this class only general utility methods that are not related to some specific page
   If you need it you call it.
   */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    Don't mention thread.sleep =() to handle 1or2second pause but u can still use at work
    AlwaysExplainWhatThe()isDoing whenEverUCreateAClass
    This method below will accept int (in seconds) and execute Thread.sleep
    for given duration
     */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    //Method below
    //WhenEver I passMy Inpected title It will be passed from the public class name variable-->String expectedInUrl
    // into the I Created 3 argument first argument I pass my driver second argument I pass my actual title coming
    // from the dynamic getTitle();
    //3ArgumentCreated 1st argument pass my driver-->WebDriver driver. Second argument passURLCondition
    //trying expectedInUrl and 3rd argument pass my-->String expectedInTitle){
    //MY FOR EACH LOOP STEPS
    //CreateSetOfString1st&ISayDriverGetWindowHandle--> Set<String> allWindowHandles = driver.getWindowHandles();
    //Iter+Enter4ForEachLoop.INeed2LookThroughIsWidowHandle-->for(String windowHandle :driver.getWindowHandles()){
    //then I Can Say Driver Switch To Window Each-->driver.switchTo().window(each);
    //-->GetCurrentURLICanSay-->CurrentURL:"+ driver.getCurrentUrl
    // PrintToGet&SeeWhereIsTheCurrentURL-->System.out.println("Current URL: " + driver.getCurrentUrl());
    //ToStopSwitchWeCanSayIsDriverGetTheCurrent URL-->if ( (driver.getCurrentUrl().contains("etsy"))){
    //BreakALoopForContinues I stay on This pageApplyBreak-->break;
    //Our GoalIsTo2understand4UsToBeAbleToSwitchWeCreateForLoop-- driver.switchTo().window(each);
    //WindowHandleWeCan'tUseToDetermineWhichBrowserShouldBeStopping
    //IsThat'sWhyWeAreUsingURL4That--> System.out.println("Current URL: " + driver.getCurrentUrl());
    // WeSayIfMyURLContainSomethingJustBreakTheLoopCozThisIsMyURL&IamOnMyexpectedPag------>break;

     /*
    This method below accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    /*
     TheMore Utility we create the less content we have on the test itself coz the plan is to remove
    as much lime From the test itself to make as simple and controlled from the outside
    Why create a method Static? Because I want to make as simple as possible coz I want to say driver.util & verify
     */
    //Create a new method name called switching window and verify
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
        //ToGetActual Title we say-->  Assert.assertTrue(actualTitle.contains(expectedInTitle));
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true

     To get the title we could say
     Assert.assertEquals(driver.getTitle(), expectedTitle);
     */
    //WeCouldSayThis--> Assert.assertEquals(driver.getTitle(), expectedTitle);<--InsideTheMethod
    public static void verifyTitle(WebDriver driver ,String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
}

