package com.wrike.tests;

import com.wrike.pages.WrikeHomePage;
import com.wrike.pages.WrikePage;
import com.wrike.pages.WrikeResendPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WrikeTest extends ChromeWebDriverSettings {
    @Test
    public void testFreeTrial() {
        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);

        WrikeHomePage wrikeHomePage = new WrikeHomePage(chromeDriver);
        /**
         * Click "Get started for free" button near "Login" button;
         */
        wrikeHomePage.clickButton_get_started_for_free();

        /**
         * Fill in the email field with random generated value of email with mask
         * “<random_text>+wpt@wriketask.qaa”​ (e.g. “​abcdef+wpt@wriketask.qaa”​)
         */
        String email = "qatest+wpt@wriketask.qaa";
        wrikeHomePage.setTextbox_email(email);

        /**
         * Click on "Create my Wrike account" button
         */
        wrikeHomePage.clickButton_create_my_wrike_account();

        /**
         * check with assertion that you are moved to the next page
         */
        wait.until(ExpectedConditions.urlToBe("https://www.wrike.com/resend/"));
        Assert.assertTrue(chromeDriver.getCurrentUrl().equals("https://www.wrike.com/resend/"));

        WrikeResendPage wrikeResendPage = new WrikeResendPage(chromeDriver);

        /**
         * Fill in the Q&A section at the left part of page
         */
        wrikeResendPage.clickButton_very_interested();
        wrikeResendPage.clickButton_1_5();
        wrikeResendPage.clickButton_yes();

        /**
         * check with assertion that your answers are submitted
         */
        wait.until(ExpectedConditions.elementToBeClickable(wrikeResendPage.getButton_submit_results()));
        wrikeResendPage.clickButton_submit_results();
        wait.until(ExpectedConditions
                .textToBe(wrikeResendPage.getText_ok(),
                    "Thanks for helping us out!"));
        Assert.assertFalse(wrikeResendPage.getButton_submit_results().isDisplayed());

        /**
         * Click on "Resend email"
         */
        wrikeResendPage.clickButton_resend_email();
        wait.until(ExpectedConditions
                .not(ExpectedConditions
                        .visibilityOf(wrikeResendPage.getButton_resend_email())));
        Assert.assertFalse(wrikeResendPage.getButton_resend_email().isDisplayed());
    }

    @Test
    public void testTwitter(){
        WrikePage wrikePage = new WrikePage(chromeDriver);

        /**
         * correct url
         */
        Assert.assertTrue(wrikePage.getSocial_twitter().getAttribute("href").equals("https://twitter.com/wrike"));
    }
}
