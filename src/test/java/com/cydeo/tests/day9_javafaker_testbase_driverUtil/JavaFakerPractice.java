package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

//--> Faker faker = new Faker();
//-->System.out.println("faker.name().firstName()="+faker.name().firstName());
//ReasonToLearnThis if uGetBoardWritingTheSame testCodeThisTCouldBe implementingAsDifferent testDataFor yourCode
//So when you call java faker just generate some test data
public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();

        //automatically print codeWhenUWrite soutV and the end-->("faker.name().firstName().soutV
        //automatically print CodeWhenWrite soutV at the end ForLastNameType faker.name().lastName().soutV
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //Exampl eIfInYourApplication YouSupposeToEnterFullName CallMethodFullName -->faker.name().fullName()soutV
        //E depois voce imprime retorna para voce a primeiro e o ultimo nome juntos
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify() method will generate random numbers in the format we want to get
        //ExampleIfIWantToGet randomNumberPrintCode automaticallyWrite soutV->("faker.numerify("###-###-####").soutV
        //U could Also Use for Date CreditCard and what ever you want to set.
        //You use when u need to generate random data all the # tag will be random generated
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        //ExamplePrintNumber312 Belong2Different areaWontChangeOnlyRandomNumber->faker.numerify("312-###-####").soutV
        System.out.println("faker.numerify(\"312-###-####\") = "
                + faker.numerify("312-###-####"));

        //letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = "+faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));



    }
}