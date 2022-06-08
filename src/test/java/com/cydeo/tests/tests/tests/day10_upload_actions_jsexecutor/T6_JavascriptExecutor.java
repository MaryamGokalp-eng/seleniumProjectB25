package com.cydeo.tests.tests.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        //JavaScript ComesFromSeleniumLibrary, we canExecute coder inOurJavaSeleniumCode&ItHas2()
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //At The moment we do not haveAccessOurDriverType so  WeDownCast toTheInterface called JavaScript Executor
        //here we are testing java type
        //IDowncastDriverType2UseThe()ComesFromJavaScript-->((JavascriptExecutor)Driver.getDriver()).executeScript("");

        //((JavascriptExecutor)Driver.getDriver()).executeScript("");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //a. 750 pixels down 10 times.
        //ThisWindowScrollBy Comes FrmJavaScript&AcceptTwoArguments-->0,750--->window.scrollBy(0,750)");
        //MeansIfYouHaveToGoToTheRightSide YouHaveToPassTheTwoNumber toThee xs--> 0,750 <--LeftIs y &Right isThe xs
        //IfIWantToScroll UP INeed 2 passSomeNumber to my XS Arguments 750 exp & I wait 1secondOtherwiseICanNotSee
        //When we run should OpenThePageMove Down 750 pxl
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }


        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }

        //JavaScript method to use : window.scrollBy(0,0)
        //WeCan Scroll selenium Page 4ways up,down,left&right
    }
}
