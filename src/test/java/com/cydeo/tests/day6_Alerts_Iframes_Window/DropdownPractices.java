package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result 1. Open Chrome browse

        //we located the dropdown and it is ready to use
        //MyArgumentICouldSay-->driver.findElement(By.xpath("//select[@id='state']")));
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(1000); //isNotRecomendedToUseThread.sleepToSee1SecondWait
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA"); //<--FindTheValueFromMyWeb&Past

        //5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5); //<--CountTheDropDownStateSelectionNumberFromWeb5

        //6. Verify final selected option is California.
        String expectedOptionText = "California"; //<--AnotherVerification &MyString-->String actualOptionText below
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();//<--ReturnAStringUse

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    @Test
    public void dropdown_task6(){
      //Select “December 1 , 1923” & verify it is selected.ThisCase(ByGetThEText&VerifyIfIsMatchingToTheExpectedResult)
        //VerifyIsSelectedByGettingTheTextOfIt & verifyIfTheTextIsCorrect
        //IfWasAnInputTheOnlyWayToVerifyIfItWasSelected
        //SelectYearDropdownToLocateTheYear-->findElement(By.xpath&pass//
        //DoTheSameToTheMonth&Year
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']"))); //LocateTheYear
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']"))); //LocateMonth
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));  //locateTheDay

        //Select year using : visible text
        yearDropdown.selectByVisibleText("1923");

        //Select month using : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        //StarWith->Assert.assertTrue thenPassOurCondition->(actualYear.equals(expectedYear));
        Assert.assertTrue(actualYear.equals(expectedYear));  //<--ApplySomethingReturnUsABooleanValue
        Assert.assertEquals(actualMonth, expectedMonth); //<--Equals,Actual&ExpectedMonth
        Assert.assertEquals(actualDay, expectedDay); //<--HereUSay-->Equals(actualDay, expectedDay

    }
    @AfterMethod
    public void teardownMethod(){ //BelowWeCreteAnAfter()&WeCanSayDriverClose

        driver.close();

    }

}
