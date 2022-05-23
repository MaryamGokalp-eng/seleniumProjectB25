package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    // Locator&IControlFromMy method from theOutsideWhatWeDidWas The()belowICreateADynamicWeDivideOur LocatorIntoGroup&
    // WePutOurOwnString Custom()->String locator="//td[.='"+customerName+"']/following-sibling::td[3]";
    //FromThe()ArgumentIntoStringLocator--> String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
    //LocateWebElementIntoCustomerDateCell-->  WebElement customerDateCell = driver.findElement(By.xpath(locator));
    //WhenYouWorkInaMewMethodYouCanChangeOneProjectNumber goToYour()InsteadofGoTo-->sibling::td[3].GoTo-->sibling::td[4]

    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

//    public static String returnOrderDate2(WebDriver driver, String customerName){
//        return driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]")).getText();
//    }

    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String customerName
    //• Arg3: String expectedOrderDate
    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    //ToDoVerificationWeNeedToPass expectedData-->expectedOrderDataFromBrowserCompare&DoSearch on the first code below
    //-->public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
    //My Customer Name Pass HereInsideLocator-->String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
    //And store inside webElement--> WebElement customerDateCell = driver.findElement(By.xpath(locator));
    //IUseGetText CustomerDateCell to getCustomerCell&StoreAsTxt-->String actualOrderDate = customerDateCell.getText();
    //ThenSayAssertEqualsMyActualOrderDate&MyExpectedOrderDate->Assert.assertEquals(actualOrderDate,expectedOrderDate);
    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();

        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }

}