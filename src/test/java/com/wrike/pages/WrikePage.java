package com.wrike.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WrikePage {
    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a")
    protected WebElement social_twitter;

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button")
    protected WebElement button_get_started_for_free;

    public WrikePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButton_get_started_for_free(){
        button_get_started_for_free.sendKeys(Keys.RETURN);
    }

    public WebElement getSocial_twitter(){
        return social_twitter;
    }
}
