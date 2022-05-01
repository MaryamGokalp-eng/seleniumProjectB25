package com.cydeo.tests.utilities;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //static method IDon't need clas object we say methodName WebDriver returnType getDriver pass BrowserType String
    public static WebDriver getDriver(String browserType) {

        //If the String is Chrome I must set up and open ChromeBrowser below is how U setUp WebBrowser
        // Plus use equalsIgnoreCase coz accepts all the matching keywords
        if (browserType.equalsIgnoreCase("chrome")) {//

            WebDriverManager.chromedriver().setup(); // do Chrome browser Setup
            return new ChromeDriver();//Just pass return a Chrome driver

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            //U can give 1 more supporting argument inside the statement below
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");// means variable does not refer to any object or array
            return null;
        }


    }

}