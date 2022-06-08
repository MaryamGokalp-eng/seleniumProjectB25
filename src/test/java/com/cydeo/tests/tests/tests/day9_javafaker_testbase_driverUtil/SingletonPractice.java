package com.cydeo.tests.tests.tests.day9_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test (priority = 2)
    public void singleton_understand_test1(){

        //The method below copy the Line & paste two time change the numbers from str1 to str2 & str3
        //When It assign the value one time & when I call the method it will return the value
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);

    }
    //One more test below & when you change the priority it will return same ID. If does not exit return the value
    @Test (priority = 1)
    public void singleton_understanding_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
    }

}