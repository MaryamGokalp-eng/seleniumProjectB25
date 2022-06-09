package com.cydeo.Pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);  //<--CreateANewSessionID
        //SessionIDIsRundanGenerateEachTimeWeRunOurSession whenIUseJavaQuit SessionEnds&WeDoThatUsing()-->PageFactory
        //ComesFromSeleniumPageFactoryClassBasicallyWeSaying-->This<-KeywordRep[resentsClassElements SoISayGetMe
        //TheCurrentDriverSession-->(Driver.getDriver() &PassIntoThisObject-->this);
        //Then ThisObjectCanExecutingMySeleniumCodeCOZThisObjectCaringMySessionID-->this);
    }



    //DisadvantageOfDataObjet model? Say initially itTake a littleBitLongerToCreate thePageRepositories toBut
    // ImmediateWeCanConvertInto AdvantageIsGoingToBeOneTimeEffect and inThe LongRunIsGoingToSaveALotOfTime CompareTo
    //WhereWeRundleLocateWebElementInDifferentTest

    //#2- use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;


}

//As developer whenIAmCreatingThiIUseTheTstAsWebElement-->Please enter a valid email address.
//IfIsIncorrectMyLocatorNotEvenWork it willFail-->'Sorry, Wrong Email or Password']