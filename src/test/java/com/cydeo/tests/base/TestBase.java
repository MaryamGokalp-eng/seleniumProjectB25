package com.cydeo.tests.base;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

//The class below weStoreALot of reusable methods/annotation&objects and variable if we extend then whenWeNeeded
//MakeSureWhat youAreGoingTo putInsideYourTestBase doubleCheck ifIsGoodFor yourScenario WillBeGoodForEveryThing
//IsNotMandatory butWeCanMake abstract class asWell from-->public class TetBase to-->public abstract class TetBase
//Then we can add method below:
// @AfterMethod
// public void tearDown(){
// driver.close();

//Then I need to  inherit by using extend keyword from TetBase to my T3_CRM_LOGIN class
//-->extends TestBase or any other class name

public abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //if UHave testThat isDependable toEachOther & TheySuppose toRunInTheSameBrowser ifYou write-->driver.close();
    //After yourTestIsRunning driver close isExecuted & yourBrowserIsClose so and the rest of the testFail coz
    //They are depends on the first test as developer U mustSelect theBest way & apply whatEverSuit the codeBetter

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
