package com.cydeo.Pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {
    // Set My class constructor for page object modelForMyDynamicClassDay12--> public void dynamic_load_1_test
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")          //Locator
    public WebElement startButton;                  //1st LocateStartButtonOnWebElement & DecideWhichWebElement2Use

    @FindBy(css = "div#loading")                    //GetMeTheDivWhereMyIDIsLoading-->(css = "div#loading")
    public WebElement loadingBar;

    //@FindBy(id = "username")
    @FindBy(css = "#username")
    public WebElement inputUsername;

    @FindBy(css = "#pwd")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement errorMessage;


}
