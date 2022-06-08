package com.cydeo.tests.tests.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//Task Below is good review for Locator, javaFaker, configuration properties,

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver.get(url) //DoesNotReadFromConfigurationProperty
        //WeNeed to useThisKeyToRead FromTheConfigurationProperty-->registration.form.url
        //For UsToBeAble To read we need toUseThe() WeCreated-->ConfigurationReader.getProperty <--This()
        //Job is to go to the configuration properties &GetTheValueOfIt-->("registration.form.url")
        //ItWillReturnsMeAString-->(ConfigurationReader.getProperty("registration.form.url"));
        //ThenI get() will be opened. THE SINGLETON WAY BELOW, 1ST LINE CREATE 2RD, 3RD LINE WILL RETURN & SO ON...
        //1stLineCreate-->Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
      //2rdLineReturn->WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker = new Faker();

        //3. Enter first name
        //WebElement inputFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        //usefulPlug toAddColour intoCodes in on Intelli->system preferences->plugin->selenium ui,or materialTheme ui
        //everyTimeWhen WeCallOurDriverWeNeedToUse-->Driver.getDriver() coz is theWayOf Singleton
   //2rdLineReturn->WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //ICanInsertTheStringToExplain & restoreMeAString-->String fakerFirstName = faker.name().firstName();
        //The above mentioned line generate a randoUserName-->faker.name().firstName();

        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));   //Return
        String fakerFirstName = faker.name().firstName();
        inputFirstName.sendKeys(fakerFirstName);

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        //NextCreateDifferent Instructure withJavaFaker and Create a DifferentLocator onMyWedDriver
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", ""));
        //UNeedToBeFamiliar WhatUCanUseInDifferentApplications
        //RundanGenerateNumbers###-->String user = faker.bothify("helpdesk###");
        //ICanUseTheString ForTheEmailByConcatenateBelow-->inputUsername.sendKeys(user);
        //AndWillBeAssign ToMyUserName&BeTheBeginningPartOfTheEmail
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String user = faker.bothify("helpdesk###");      //->Helpdesk124 & everyTimeWillBeRundanGenerateNumber
        inputUsername.sendKeys(user);

        //6. Enter email address
        //ConcatenateEmailAddress below useString4Email & BeAssignToMyUserName
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");  //<--IHavePutUserString &ConcatenateInsteadOfUseFaker

        //7. Enter password
        //FirstLocateTheBox OnMyDriverNamePassword
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########")); //<-HereWeCanHardCodeNumber0rUseJavaFakerPut8#
        //System.out.println("faker.internet().password() = " + faker.internet().password());

        //8. Enter phone number
        //
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        //ToSelect TheGenderInMy ChromeDrive Say-->//input[@value='female']
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920) //<--HereGenerateDOB From18 To 84Years old
        inputBirthday.sendKeys("03/08/2000");

        //11.Select Department/Office
        //BelowISaySelect&DepartmentNameDropdown-->Select departmentDropdown = new Select();ComplainingCozINeedTo
        //PassWholeWebElement-->(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        //SaySelectByIndexCOZ()SelectByInteger->departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
   //COZAbove()Integer->WebElement inputBirthday=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //TheISayFakerGiveMeANumberBetween1-9-->departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //Every Time Generate A NUmber Between1-9 on the code below
     Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //break until 1.05pm cst

        //12.Select Job Title
        //13.Select programming language from checkboxes
        //14.Click to sign up button
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }
}

