package com.cydeo.tests.tests.tests.day5_testing_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class T4_SimpleDropdowns {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        //OnceSelectUNeedToPassTheArgumentOneMy ()BELOW-->(driver.findElement(By.xpath("//select[@id='dropdown']")));
       Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));//SelectFromSelenium

        //WeCanSaySimpleDropdownTextStoreInsideWebElement textBelow, its returns me what is current selected
        //NextINeedToGetText inLine40 OutOfThis-->CurrentlySelectedOption<--FromMyWebElement inLine38
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

       String actualSimpleDropdownText = currentlySelectedOption.getText();

        //InsteadOfIfConditionGenerateAnotherString and IGetTheValue fromMyWebElement-->"Please select an option"
        String expectedSimpleDropdownText = "Please select an option";

        //Expected: “Please select an option”
        //WhatTheAssertDo ItWill compare the FirstToStringAbove &CompareWithEachOther
        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText); //<--AssertWhatEverYouLikeUCanTypeIt

        //4. Verify “State selection” default selected value is correct
        //WriteUrLineBelow SelectFromMyWebDriver-->"//select[@id='state']")));
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Expected: “Select a State”
        String expectedStateDropdownText = "Select a State";

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);

        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a State");

    }

}