package com.cydeo.tests.day8_Properties_config_reader;


import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

//    public WebDriver driver;
//    @BeforeMethod
//    public void setupMethod(){
//
//        //We are getting the browserType dynamically from our configuration.properties file
//        //So we copy and paste browser from configuration property and paste on my line below, so my class
//        //browser will Be Read From my Configuration Property file & return us the value
//        // not to get confuse change browserName for-->browserType

//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//         //DoTask normal way then configure on the configuration.properties.
           //AbyString you can pass from your configuration property On this class we want to go to google type
           //Apply to test my browser from outside my code We Located our search box below!
           //WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
          //We send Keys Using-->searchValue Configuration Reader on the code below!
          // googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);
          //B4UPassAnyProperty&String AnalyseUrCodeFirst ifMakeSense don't put a string that will damage your code
    @Test
    public void google_search_test(){
        //Driver.getDriver() --> driver

        Driver.getDriver().get("https://www.google.com");

        //3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}