package com.wrike.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WrikeHomePage extends WrikePage{
    //private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[1]/input")
    private WebElement textbox_email;

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[2]/button")
    private WebElement button_create_my_wrike_account;

    public WrikeHomePage(WebDriver driver){
        super(driver);
    }

    public void setTextbox_email(String email){
        textbox_email.sendKeys(email);
    }

    public void clickButton_create_my_wrike_account(){
        button_create_my_wrike_account.sendKeys(Keys.RETURN);
    }


}
