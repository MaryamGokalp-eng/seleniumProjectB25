package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(1000);

        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        //WhenTypeAlertChooseTheOneStartFromSeleniumTheUCanSay-->Alert alert = driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        //DisplayThisMessageOnlyIfThereIsAnyFailures-->"Result text is NOT displayed.");
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

        //AnotherVerificationBelow
        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");


        @Test
        class TC2_ConfirmationAlertPractice {
            public void setDriver(WebDriver driver) throws InterruptedException {

                // TC #2: Confirmation alert practice
                //1. Open browser
                driver = WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                //2. Go to website: http://practice.cydeo.com/javascript_alerts
                driver.get("http://practice.cydeo.com/javascript_alerts");

                // 3. Click to “Click for JS Confirm” button
                WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

                informationAlertButton.click();
                Thread.sleep(1000);

                //4. Click to OK button from the alert
                alert.accept();

                //5. Verify “You clicked: Ok” text is displayed.
                //OnWebType-->//p[@id='result'] <--LocateCopy&PastCodeBelow
                WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

                //VerificationBelow
                String expectedText = "You successfully clicked an alert";
                String actualText = resultText.getText();

                Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");

            }

            WebDriver driver;

            @Test
            class TC3_InformationAlertPractice {
                public void setDriver(WebDriver driver) throws InterruptedException {
                    //TC #3: Information alert practice
                    //1. Open browser
                    driver = WebDriverFactory.getDriver("chrome");
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    //2. Go to website: http://practice.cydeo.com/javascript_alerts
                    driver.get("http://practice.cydeo.com/javascript_alerts");

                    //3. Click to “Click for JS Prompt” button
                    WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
                    informationAlertButton.click();
                    Thread.sleep(1000);

                    //4. Send “hello” text to alert
                    alert.accept();

                    //5. Click to OK button from the alert
                    //OnWebType-->//p[@id='Result Alert'] <--LocateCopy&PastCodeBelow

                    WebElement resultText = driver.findElement(By.xpath("//p[@id='Result Alert']"));

                    //6. Verify “You entered:  hello” text is displayed.
                    String expectedText = "You successfully clicked an alert";
                    String actualText = resultText.getText();                                                                                                          
                    Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");

                }

            }

        }

    }

}