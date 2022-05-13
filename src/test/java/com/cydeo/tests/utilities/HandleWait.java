package com.cydeo.tests.utilities;

public class HandleWait {

    //Thread.sleep help us to wait 1or 2second & stop,
    //solution I can create a custom () on Handle Wait for me without through an exception
    public static void staticWait(int seconds){ //need to wait coz java is fastWeb page is slow
        try {
            Thread.sleep(seconds * 1000);
        }catch ( Exception e){
        }



    }
}
