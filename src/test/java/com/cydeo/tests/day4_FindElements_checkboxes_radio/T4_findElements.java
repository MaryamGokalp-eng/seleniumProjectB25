package com.cydeo.tests.day4_FindElements_checkboxes_radio;

import com.cydeo.reviewWithOscar.week2.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        // windows : alt+enter --> press enter again
        //mac  : option + Enter --> press enter again
        //ToLocateTheLinks on thePage go to-->driver.findElements(By.tagName("a")); (2returnTheListOfAllElements
        // TagName a CreateMeALinkOnWebPage-Shortcut--> mac : option + Enter --> press enter again
        // toGenerateReturn=theContainerType-->List <WebElement> WhenEverMyContainerIsReturnMeTypeCall-->allLinks
        //AfterReturn allTheLinks and restore inside-->allLinks
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        //ThenApply forEachLoop forIterating through to GenerateTheLatThingYouCreate-->iter+Enter
        //OrYouCanDoLikeThis-->allLinks.iter+Enter
        for (WebElement each : allLinks) { //Iter AllLinks call each

         //ToPrintOut onlyTheTextInstead ofLinks Ihave to say--> each.getText()
         //OnceWeSayEachGetText()IsString soGetWebElement&ThenGet TheText OfIt&Then get actual text
            //TGetAttributeValue--> getAttribute("href") <-- thePassAttributeNameIWantToGetTheValurOf--> "href"
         System.out.println("Text of link: " + each.getText());// getText() getTextOfTheWebElement&RunOut
         System.out.println("HREF Values: " + each.getAttribute("href"));

        }

    }
}


/*

 //TC #4: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        //windows : alt+enter --> press enter again
        //mac     : option + Enter --> press enter again
        List <WebElement> allLinks =  driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {

            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href"));



 */
