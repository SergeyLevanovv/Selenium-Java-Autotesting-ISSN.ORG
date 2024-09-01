package com.example.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {
    WebDriver driver;
    String baseUrl, nodeURL;

    @Before
    public void setUp() throws MalformedURLException {
        baseUrl = "https://www.issn.org/ru/";
        nodeURL = "http://192.168.138.4:4444/wd/hub";
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
    }

    @Test
    public void simpleTest() {
        driver.get(baseUrl);
        Assert.assertEquals("SeleniumHQ Browser Automation", driver.getTitle());
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
