package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
//    public static final String SEARCH_CLASS = "input#gh-ac.gh-tb.ui-autocomplete-input";
//    public static final String SEARCH_CLASS = ".gh-tb.ui-autocomplete-input";
    public static final String SEARCH_NAME = "_nkw";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com/");

//        WebElement searchField = driver.findElement(By.cssSelector(SEARCH_CLASS));
        WebElement searchField = driver.findElement(By.name(SEARCH_NAME));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}