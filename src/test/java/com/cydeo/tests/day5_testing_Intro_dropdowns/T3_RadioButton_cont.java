package com.cydeo.tests.day5_testing_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //NameAttributeIsSportTheCodeItWasWriteInSuchWayThat theyAreConnectedWithEachOtherByUseTheSameName-->Sport
        //GroupIsDefineByName&AttributeValue IndividualValueIsDefinedBy-->Id value for eachExample
        //TheWayTheClassIsCreatedIsToLocate allTheGroup intoOneBigGroup toHaveAName and attributeValue
        //IsBetterToUse-->setupMethod(){ <--ToSet TheGroup Together to return Multiple results
        //DriverGoFindAllTheListIfBoxes & StoreInsideTheElement Sports & LookThroughThe ListOfElementsIn line44
        //Locate name='sports' radio buttons and store them in a List of Web Element below
        //INeed toPass 3 Argument-->driver, 2rd nameAttribute-->"sport", andThird IPass--> "hockey"
        //WhenIRunMyCode ItShouldClickTo--hockey verify printout then Chick to-->Football verify&PrintOut thenGoTo-->Color

        clickAndVerifyRadioButton(driver, "sport", "hockey" );

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");
    }

    //IShouldMakeTheCode UniversalLogicRegardlessWhichGroupBoxes I shouldJustPasse TheNameAttributeValueOnWeb-->Color
    // to Pass As Argument To Store All In One Box & Put Then Together Also To Use For Other Radio & Input as well
    //FirstPass(WebDriver driver, String nameAttribute, String idValue), IcaGroupThemTogether&ICanVerifyByCallingThe()
    //To Generalised I Can Find The Info Box & Click In One Of Them I Can Say--> String idValue
    //To Generate The List Attribute I Need To Make Dynamic To Pass Outside method So What Ever I pass AsAString...
    // IShouldLAddInsideMy()-->(nameAttribute));, ThenDirectMyDriverToStateWhichGroupShouldBeLocated onTheWeb
    //instore MyId & I can Get From The Outside The() SoWhenI passInside the() passToMy EachId & ICanClickToIt

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) { //InsteadOfSportRadioButtonsChange2RadioButtons
            String eachId = each.getAttribute(idValue); //<--Use each.getAttribute(idValue);toUtilizeTheOutside()

            if (eachId.equals(idValue)) {  //<--NowCreateMyIfCondition & Click TryToClick, Basketball,Football,Hockey
                each.click(); //Apply TheBreak OnceYouClick OtherwiseTheLoop WillContinue print

                System.out.println(eachId + " is selected : " + each.isSelected()); //PrintTheValue
                break; //ApplyBreak To break the loop afterPrintHockey
            }
        }
    }

}
