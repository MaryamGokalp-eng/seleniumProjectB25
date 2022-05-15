package com.cydeo.tests.day6;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){

        //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        //PrintOutToSeeWhatTheMainHandeLookLike&ToSeeThatTheTwoMainHandleCanNotBeTheSameAsEachOther
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        //ApplyAssertEquals
        //ToGetTheExpectedResult
        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click: " + actualTitle); //FromHereToWindowTestIInsertedCurrentTitleAsExpected

        //5. Click to: “Click Here” link
        //ThenWeClickToTheLinkOnMyWebThenANewWindowOpen. ThenSwitchSeleniumFocusFromTheLeftToTheRight
        //SoWeCanGetTheTittleFromTheNewWindow. ToBeAbleToSwitchINeedToGet--->driver.switchTo().window(each); &Line66
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        //ClickToTheLink & RunTheCode
        clickHereLink.click();

        //6. Switch to new Window.
        //ThenForUsToGetTheWindowHandle()INeedToUse-->getWindowHandles(); below!
        //nceUUseWindowHandleYouGetSetOfString Below

        Set<String> allWindowHandles = driver.getWindowHandles();

        // window handle 1 - main window -->(SeleniumMainWindow)
        // window handle 2 - 2nd window  -->(ThenMySeleniumLookFrTheSecondWindow)
        //This()-->for(String each: allWindowHandles){ returns the setOfString &MopThrough
        //AfterIPrintOutMyTitleIsGoingToSayNewWindow
        //UseLookGetThroughTheCode&ReturnBackToUs

        for(String each: allWindowHandles){

            driver.switchTo().window(each);   //<-- toSwitchToDifferentWindow
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }
        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        //BelowWeCan-->Assert2String(actualTitle,expectedTitleAfterClick
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        //PrintNotToChangeTheValue
        System.out.println("Title after click: " + actualTitle);

        //If we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

