package com.cydeo.tests.tests.tests.day12_pom_design_explicit_wait;

import com.cydeo.Pages.DynamicLoad1Page;
import com.cydeo.Pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    @Test
    public void dynamic_load_7_test(){
        //1. Go to ThisPage https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title” ToCreate WebDriver Object & Assigning 10sec
        //creating the wait object to be able to create certain condition to wait until title is dynamicTitle
        //ToReade forCertainCondition Use-->WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //use the "wait" object to create our expected condition is to-->"Dynamic title")
        //UseThe WebDriver Object&IWantTimeToSetUp For10Sec theIdeaIsToSaveTime&makeOurCode ToWaitLess
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //Create object of DynamicLoad7Page to reach and assert web elements
        //Then I am calling my objectSoThat I amAbleToReachAll myWebElement
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //4. Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
    }

    @Test
    public void dynamic_load_1_test(){
        //Task5 practice
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //2. Click to start
        dynamicLoad1Page.startButton.click();

        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("somethingwrong");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());
    }
}