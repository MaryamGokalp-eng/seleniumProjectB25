package com.cydeo.tests.tests.tests.day5_testing_Intro_dropdowns;
import org.testng.Assert;
import org.testng.annotations.*;

//EachTimeURunYourClassThis-->@BeforeClass-<--RunYourClass2x //IfOneTesIsFailedItWillContinueExecuteTheSameTest
//Means if one test failed will continueExecute another test by default
public class TestNG_Intro {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);

    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 is running...");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here");

    }

    @BeforeClass
    public void setupMethod() {
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("---> AfterMethod is running!");
    }
}