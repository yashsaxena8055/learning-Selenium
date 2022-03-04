package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RadioTest {

    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8082/index.html");
        WebElement link = driver.findElement(By.id("radioLink"));
        link.click();

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testCheckBox() {


        List<WebElement> radioBtn = driver.findElements(By.name("color"));
        radioBtn.get(2).click();

        assertEquals("blue", radioBtn.get(2).getAttribute("value"));
    }

}
