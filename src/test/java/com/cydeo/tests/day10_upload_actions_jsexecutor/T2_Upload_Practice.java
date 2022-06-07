package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_tst(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        //How IstThatWork? MyBrowserDriverIsMyTranslateBetweenMySelenium&MyBrowserCode by ConvertTheFile
        //PathByFindingTheFile&SomeHowTransferIntoMyBrowser
        String path = "/Users/mariajoana/Desktop/JavaProgramming B25 April22/HTML-Class/Day01-html/cybertruck.jpeg";

        /*
        String path ="C:\\Users\\hayat\\Desktop\\note.txt";
         */

        //3. Upload the file.
        //TheAboveCode we Located TheWedElement&WePassHereOnThe Code below
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);

        fileUpload.sendKeys(path);

        //WeCopyFileSubmit by ClickOnTheUploadButtonOnMyWebDriver&PastInto
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

        //The 3 step we did was find the file upload the text copy as string&upload the button.


  }

}
