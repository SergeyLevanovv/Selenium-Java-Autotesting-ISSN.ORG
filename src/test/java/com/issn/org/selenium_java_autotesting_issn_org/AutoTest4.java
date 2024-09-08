package com.issn.org.selenium_java_autotesting_issn_org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.issn.org/ru/");

        WebElement imageLink =
                driver.findElements(By.tagName("img")).get(1);
        imageLink.click();
    }
}
