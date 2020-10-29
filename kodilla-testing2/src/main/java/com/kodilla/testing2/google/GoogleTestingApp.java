package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
//    public static final String SEARCHFIELD = "1st-ib";
    public static final String SEARCHCLASS = ".gLFyf.gsfi";
//    public static final String SEARCHCLASS = "input.gLFyf.gsfi";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("http://www.google.com");

//        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        WebElement searchField = driver.findElement(By.cssSelector(SEARCHCLASS));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
