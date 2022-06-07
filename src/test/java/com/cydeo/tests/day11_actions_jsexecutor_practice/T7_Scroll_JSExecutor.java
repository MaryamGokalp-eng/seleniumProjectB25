package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test(){
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “Cydeo” link
        //Then YourJob Is done
       BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        //4- Scroll up to “Home” link
        //TheCodeBelow insteadOfPass 1 argumentIPassed two arguments so OnMyCodeInsteadOfPass Cydeo link I passed
        // HomeLink directly for the firstIndexIn that Case I would pass The Argument 0-->("arguments[0]. WeCanPass&
        //moveThe 1 weDesignToMove-->cydeoLink, homeLink); &IfWeSayGo&get index--> ("arguments[1] or -->"arguments[0]
        //Index                                                   0           1
        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

        //objects
        //cydeoLink 0
        //homeLink 1
        //someOtherLink 2

        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)

    }
}