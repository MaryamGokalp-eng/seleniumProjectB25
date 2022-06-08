package com.cydeo.tests.tests.tests.day5_testing_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) throws InterruptedException {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        //button[@onclick='addElement()']
        //GoalIsToLocateTheWebElementClickOnAddElement+InspectTo LocateTheWebElementThatReturnsMe
        //UseXPart e um Button & returns meTheWebElement-->AddElement of the GivenText below so my Txt Extend to
        //thenAdd-->button & MyText or xpath stands for text =2AddElement-->By.xpath("//button[.='Add Element']"));
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));

        Thread.sleep(2000);  //Don'tNeedToAddThread.sleep <--OnlyAddToSeeSleepFor2Seconds
        addElementBtn.click();

        //4. Verify “Delete” button is displayed after clicking.
        //NextLocateTheWQebElement EfalaMeDarOBotaoOnde whereTheClassValueIsThis-->"//button[@class='added-manually']"));
        //IfTheDeleteButtonWasRemovedOnTheWeb MeansItWasThereButThenOnceDeleted and sinceThereIsNotElement
        //NoteOnIntellij saysStaleElementReferenceException, So SinceThereIsNotElementTheOnlyOption isToSolveWith
        //Try Catch Go To Line--->52, whereThrough theException
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        //OnceIRunTheCodeWaitFor2secondOnceI click andGoBackToMyIntellij IShouldSeeTrue
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        //IfIsNotDisplayItShouldReturnFalse
        //HowToSolveTheException,
        try {     //ICanSayTryThisCode below

            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        }catch (StaleElementReferenceException e){ // CatchMe-->}catch (StaleElementReferenceException e){

            //ThenYouCanWriteSomething ToExplainToYourSelf onYour First PrintStatementBelow
            //Then YouCanGive explanation on your 2rd print statement
            //Third YouCanWrite false coz If is comeToThis block & if is deleted from the page is not display anymore
            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");

        }

        //U Can Close
        driver.close();
    }
}

