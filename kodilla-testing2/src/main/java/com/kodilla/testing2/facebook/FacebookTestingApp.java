package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div[contains(@class,\"_9fiw\")]/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class,\"_6ltg\")]/a";
    public static final String XPATH_FIRSTNAME = "//input[@id=\"u_2_b\"]";
    public static final String XPATH_LASTNAME = "//input[@id=\"u_2_d\"]";
    public static final String XPATH_EMAIL = "//input[@id=\"u_2_g\"]";
    public static final String XPATH_CONFIRM_EMAIL = "//input[@id=\"u_2_j\"]";
    public static final String XPATH_PASSWORD = "//input[@id=\"password_step_input\"]";
    public static final String XPATH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//select[@id=\"year\"]";
    public static final String XPATH_SEX = "//select[@id=\"u_2_3\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIE)).isDisplayed()) ;
        WebElement cookieAcceptButton = driver.findElement(By.xpath(XPATH_COOKIE));
        cookieAcceptButton.click();

        while (!driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).isDisplayed()) ;
        WebElement createNewAccountButton = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccountButton.click();

        Thread.sleep(5000);

        while (!driver.findElement(By.xpath(XPATH_FIRSTNAME)).isDisplayed());
        System.out.println("XPATH_FIRSTNAME - wyswietlony");
        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstnameField.sendKeys("John");

        while (!driver.findElement(By.xpath(XPATH_LASTNAME)).isDisplayed());
        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Doe");

        while (!driver.findElement(By.xpath(XPATH_EMAIL)).isDisplayed());
        WebElement emailField = driver.findElement(By.xpath(XPATH_EMAIL));
        emailField.sendKeys("john.doe@google.com");

        while (!driver.findElement(By.xpath(XPATH_CONFIRM_EMAIL)).isDisplayed());
        WebElement confirmEmailField = driver.findElement(By.xpath(XPATH_CONFIRM_EMAIL));
        confirmEmailField.sendKeys("john.doe@google.com");

        while (!driver.findElement(By.xpath(XPATH_PASSWORD)).isDisplayed());
        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("12345789");

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(0);

        while (!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());
        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(0);

        while (!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed());
        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(50);

//        WebElement sex = driver.findElement(By.xpath(XPATH_SEX));
//        sex.click();
    }
}
