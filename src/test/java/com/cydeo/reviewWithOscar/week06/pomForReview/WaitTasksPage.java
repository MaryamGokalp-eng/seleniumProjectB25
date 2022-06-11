package com.cydeo.reviewWithOscar.week06.pomForReview;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class WaitTasksPage {
    public By disable;
    public HTMLInputElement enable;

    public WaitTasksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "alert")
    public WebElement alertActivate;

}
