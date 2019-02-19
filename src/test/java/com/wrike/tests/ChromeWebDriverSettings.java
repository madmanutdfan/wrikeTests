package com.wrike.tests;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriverSettings {
    protected ChromeDriver chromeDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProgs\\wrikeTest\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        /**
         * Open url: https://www.wrike.com/
         */
        chromeDriver.get("https://www.wrike.com/");
    }

    @After
    public void close() {
        chromeDriver.quit();
    }
}
