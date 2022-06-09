package com.cydeo.tests.tests.tests.day12_pom_design_explicit_wait;

import com.cydeo.Pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    //CreateObjectOnClassLevel
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();                //<--instantiateMyObjectB4EveryTestOnceTerminate

        //MyDriveSingletonWillGenerateAnotherSession to beAbleToContinueWithTheExecution&WillPassIntoTheNewObject
        //regardless which package I am calling willBeMovingAround IsThat's whyWe create an Object before each test
     //SoLibraryLoginPageITestPackage-->(Driver.getDriver<--MustPassThisSessionInsideThisNewObject-->libraryLoginPage
      //SoOnLibraryLoginPage-->This<-KeywordRep[resentsClassElements SoISayGetMe
        //TheCurrentDriverSession-->(Driver.getDriver() &PassIntoThisObject-->this);
        //Then ThisObjectCanExecutingMySeleniumCodeCOZThisObjectCaringMySessionID-->this);
        //WhenWeUseCloseDriverObjectIsKillingMySessionIDThenWeHaveToCallTheLineBelowOneMoreTime
        //PageFactory.initElements(Driver.getDriver(), this); COZ This line isTerminate & Re Executed Again
        //ToCallTheLineIUse-->   libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Do not enter any information
        //4- Click to “Sign in” button

        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter invalid email format
        libraryLoginPage.inputUsername.sendKeys("somethingwrong");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        //This() call the driverQuite to terminate the whole session
        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }


}

//When we implement POM Design pattern we solve StaleElementReferenceException byDefault
//How?
//Everytime we want to use webElement located using @FindBy annotation, itWill be re-located in the line
//we are using it. It Will automatically do 1 "fressness check" to eliminate the StaleElementReferenceException

//ThenIHave toCallMyClassObject POMPractice ObjectClass isLibraryLogin Package Pages to initiate the class instance toRefresh&Locate
//The WebElement Reference form.

//SoInsteadOfCreate ObjectOneTime ICreateObject inTheClassLevel-->LibraryLoginPage libraryLoginPage
//&I