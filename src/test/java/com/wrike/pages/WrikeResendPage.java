package com.wrike.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WrikeResendPage extends WrikePage{
    private WebDriver driver;

    private By text_ok = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/div/h3");

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button")
    private WebElement button_very_interested;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button")
    private WebElement button_1_5;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button")
    private WebElement button_yes;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button")
    private WebElement button_submit_results;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")
    private WebElement button_resend_email;

    public WrikeResendPage(WebDriver driver){
        super(driver);
    }

    public WebElement getButton_submit_results() {
        return button_submit_results;
    }

    public void clickButton_yes() {
        button_yes.click();
    }

    public void clickButton_1_5() {
        button_1_5.click();
    }

    public void clickButton_very_interested() {
        button_very_interested.click();
    }

    public void clickButton_submit_results() {
        button_submit_results.submit();
    }

    public By getText_ok() {
        return text_ok;
    }

    public WebElement getButton_resend_email() {
        return button_resend_email;
    }

    public void clickButton_resend_email() {
        button_resend_email.sendKeys(Keys.RETURN);
    }
}
