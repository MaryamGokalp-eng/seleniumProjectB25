package com.cydeo.tests.tests.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {
        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup(); // SIDE SUMMARIES set the browser
        WebDriver driver = new ChromeDriver(); //get browser
        driver.manage().window().maximize(); // maximise browser

        //2- Go to: https://google.com
        driver.get("https://www.google.com"); // get Goggle.com & next to write apple in the search box

        //3- Write “apple” in search box
        //Expected: Title should start with “apple” word so for me to be able to generate some actions
        //I need to locate the element first by our generate web & said find element by the letter q
        // Then it goes to the web element page check name & attribute find the 1st matching result & return
        // even if we have multi locator by always find the 1st matching element & returnBack to us
        //4- PRESS ENTER using Keys.ENTER
        //to locate WebElement on googleSearchBox = driver.findElement(By.name("q"));. Then find attribute value q
        // Q was found googlePage we use googleSendKeys then enter apple, NEXT command Keys.ENTER) is to...
        //imitate user press enter
        WebElement googleSearchBox = driver.findElement(By.name("q"));//2 write webElement in searchBox,WeNeed to locate
        googleSearchBox.sendKeys("apple" + Keys.ENTER);//the code type apple then press ENTER

        //5- Verify title:
        //Expected:Title should start with "apple" word 4 checking the title
        // 1st verify the title otherwise u cannot move forward with ur project
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();//string is 2 get the title

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

    }


}