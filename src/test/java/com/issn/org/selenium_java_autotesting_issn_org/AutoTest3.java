package com.issn.org.selenium_java_autotesting_issn_org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.issn.org/ru/");

        WebElement renovationLink = driver.findElements(By.linkText("План сайта")).get(0);
        renovationLink.click();
    }
}