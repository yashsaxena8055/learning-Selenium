package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestGoogle {
    @Test
    public void testGoogle() {
        WebDriverManager.firefoxdriver().setup();
//    WebDriverManager.chromedriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("selenium testing");
        searchBox.sendKeys(Keys.ENTER);

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement result = driver.findElement(By.cssSelector("#rso > div:nth-child(3) > div > div > div.yuRUbf > a > h3"));
        result.click();

    }
}
