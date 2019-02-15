package com.wrike;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverSettings {
    protected ChromeDriver chromeDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProgs\\wrikeTest\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @After
    public void close() {
        chromeDriver.quit();
    }
}
