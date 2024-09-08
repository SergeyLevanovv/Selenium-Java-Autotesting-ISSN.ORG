package com.issn.org.selenium_java_autotesting_issn_org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AutoTest2 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(CapabilityType.BROWSER_NAME,"chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.138.4:4444"), capability);
        driver.get("https://www.issn.org/ru/");
        System.out.println("Title of the page is " + driver.getTitle());
        driver.close();
    }
}