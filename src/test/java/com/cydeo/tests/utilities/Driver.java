package com.cydeo.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//WhyCreate DriverClassInUtility? Coz WebDriverClass CanNot Handle,WriteALotOfLine, toBeAbleToInitiate our WebDriver
//Have hardTime to pass the same driver instance around ourProject, WhenWeAreUsingUtility() WeHaveToPass
//WebDriver driver as the argument in each utility method. Is that's wht we created a Driver logic to guarantee
// the same exact instance every time we call the method

public class Driver {

    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */
    private Driver(){}

    /*
    We make WebDriver private, because we want to close access from outside the class.
    We make it static because we will use it in a static method.
     */
    private static WebDriver driver;

    /*
    Create a re-usable utility method which will return same driver instance when we call it
     */

    public static WebDriver getDriver(){

        if (driver == null) {

            /*
            FIRST APPROACH
        //The if condition below means that if our driver is not created it will create one for us & if is
        // created it will return me the existing one and U can use in whatEver U need to use.
        //Only thing is you need to be precise in what you are doing then you can apply the logic

        //We read our browserType from configuration.properties.
        //This way, we can control which browser is opened from outside our code, from configuration.properties.

                    String browserType = ConfigurationReader.getProperty("browser");
                      }
                        return driver;
                      }
                   }
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
                Depending on the browserType that will be return from configuration.properties file
                switch statement will determine the case, and open the matching browser
            */

            //IfTheCompanyYouWorkingFor don't Allow youToUse <dependency> bonigarcia<. You CanDownload WebDriver
            //Manually from Google & adding into the project.
            //BELOW SHOW YOU HOW TO ADD CODE MANUALLY FROM TheWebDriver
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            // AGAIN BELOW ARE DIFFERENT METHOD ON HOW TO ADD DIFFERENT () MANUALLY U CanCopy&Paste&ChangeTheName
            //From chrome to FireFox
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }

        return driver;

    }
}