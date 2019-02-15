package com.wrike;

import org.junit.Assert;
import org.junit.Test;

public class Tests extends ChromeWebDriverSettings{

    @Test
    public void openWrikePage() {
        chromeDriver.get("https://www.wrike.com/");
        Assert.assertTrue( chromeDriver.getTitle().equals("Your online project management software - Wrike"));
    }

}
