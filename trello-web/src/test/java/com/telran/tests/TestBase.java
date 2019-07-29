package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://trello.com/");

    }

    protected void fillUserForm(String login, String password) {
        driver.findElement(By.id("user")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    protected void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    protected void confirmLoginButton() {
        click(By.id("login"));
    }

    protected void click( By locator) {
        driver.findElement(locator).click();
    }

    protected void clickOnLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
