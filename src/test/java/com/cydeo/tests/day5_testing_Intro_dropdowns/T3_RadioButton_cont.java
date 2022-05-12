package com.cydeo.tests.day5_testing_Intro_dropdowns;

import com.cydeo.reviewWithOscar.week2.WebDriverFactory;
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
        //Locate name='sports' radio buttons and store them in a List of Web Element below
        //DriverGoFindAllTheListIfBoxes & StoreInsideTheElement Sports & LookThroughThe ListOfElementsIn line44
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        clickAndVerifyRadioButton(driver, "sport", "hockey" );

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) { //Add sport--->radioButtons &then Each WebElement each
            String eachId = each.getAttribute("id"); //<--Use each.getAttribute("id");toUtilizeTheIdValue&StoreEachID

            if (eachId.equals(idValue)) {  //<--NowCreateMyIfCondition & Click TryToClick, Basketball,Football,Hockey
                each.click(); //Apply TheBreak OnceYouClick OtherwiseTheLoop WillContinue print

                System.out.println(eachId + " is selected : " + each.isSelected()); //PrintTheValue
                break; //ApplyBreak To break the loop afterPrintHockey
            }
        }
    }

}
        //WhenU printOutIsGoingToPrintEveryThings so its lookThrough,Then ICreate1IfCondition