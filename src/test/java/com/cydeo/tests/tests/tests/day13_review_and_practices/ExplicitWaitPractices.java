package com.cydeo.tests.tests.tests.day13_review_and_practices;

import com.cydeo.Pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();

    }

    @Test
    public void remove_button_test(){
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        //  Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //LINE BELOW TO REMEMBER WEB DRIVER WAIT
        //CreateObject-->WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //CreateExpectedCondition-->wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        //LineBelow Create for the Utility method
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Checkbox is not displayed is going to through no such element exception
        //ToInspectAnExceptionWeCanSayTryThisLineBelow and CatchMe-->}catch (NoSuchElementException n){
        //ToVerifyIfCatchMyExceptionICanSay--> Assert.assertTrue(true);
        //Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());  //<--HereIReverseTheValue
        try {
            //assertFalse method will pass the test if the boolean value returned is: false
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());      //HereIReverseTheValue
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
    }

    //AnotherClass Below
    @Test
    public void enable_button_test(){
        //3- Click to “Enable” button

        //System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
        //        + dynamicControlsPage.inputBox.isEnabled());

        dynamicControlsPage.enableButton.click();

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());

        //4- Wait until “loading bar disappears”
        //Calling our ExplicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        //Check the String value is matching as expected: “It’s enabled!”
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));

    }

}
