package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {


       // System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Desktop/selenium dependencies/drivers/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");



    }
}
