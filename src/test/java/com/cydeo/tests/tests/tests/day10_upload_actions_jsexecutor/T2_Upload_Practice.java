package com.cydeo.tests.tests.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_tst(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //3 STEPS BELOW, 1ST STEP Find File copy as path name
        //2. Find some small file from your computer, and get the path of it.
        //How IstThatWork? MyBrowserDriverIsMyTranslateBetweenMySelenium&MyBrowserCode by ConvertTheFile
        //PathByFindingTheFile&SomeHowTransferIntoMyBrowser
        String path = "/Users/mariajoana/Desktop/JavaProgramming B25 April22/HTML-Class/Day01-html/cybertruck.jpeg";

        /*
        String path ="C:\\Users\\hayat\\Desktop\\note.txt";
         */

        //3. Upload the file.
        //2rd STEP COPY AS STRING TheAboveCode we Located TheWedElement&WePassHereOnThe Code below
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        //WeCopyFileSubmit by ClickOnTheUploadButtonOnMyWebDriver&PastInto & UPLOAD THE BUTTON
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        //When We run to see if it click and I create a header so I would say
        //ThisHeader us display-->Assert.assertTrue(fileUploadedHeader.isDisplayed());
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

        //Next afterYouClick onThe


  }

}
