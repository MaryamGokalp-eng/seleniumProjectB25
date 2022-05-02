package com.cydeo.reviewWithOscar.HomeWorkTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_EtsyTitleVerification {

    public static void main(String[] args) {


        //TC #1: Etsy Title Verification
        //Set up Chrome browser
        WebDriverManager.chromedriver().setup();//1ST SetUpWebDriverManagerUsing WebDriverManager.chromedriver().setup()
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver(); //2rd Create instance ChromeDriver

        //2. Go to https://www.etsy.com
        //For me to get the drive I need to add driver.get then I need to pass WebAddress: ("https://www.etsy.com ");
        //When ever you want to navigate on the internet you must add driver apply get() then add the specify link
        driver.get("https://www.etsy.com ");// To navigate into the webPage U need to use driver and Get method

        //3. Search for “wooden spoon”
        //I must apply string 4 me 2 be able 2 search 4 WoodSpoon on my WorkChromeBrowser
        //Expected: “Wooden spoon | Etsy” comes from the browser
        //ExpectedTitle comes from our documentation provide as a string
        String expectedTitle = "“Wooden spoon | Etsy” comes from the browser";//create expectedTitle&VerifyTitle

        // We create an if condition 2 do the verification to check if actual title is as its suppose 2.
        //After Create Expected Title. I created actual Title comes from the browser getTitle check returnBack to us
        String actualTitle = driver.getTitle();//To create actual Title is coming from the browser I say Drive.getTitle

        //Our verification title below
        //4. Verify title: then print out
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title: Verification PASSED");
        } else {
            System.out.println("Title: Verification FAILED!");


        }

    }

}