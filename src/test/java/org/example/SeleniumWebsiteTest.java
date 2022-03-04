package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertEquals;

public class SeleniumWebsiteTest {

    @org.junit.Test
    public  void  test_selenium_dot_div_blog()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        WebElement searchBox=driver.findElement(By.linkText("Blog"));
        searchBox.click();
        searchBox=driver.findElement(By.id("m-blog2016-li"));
        searchBox.click();
        searchBox=driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!"));
        assertEquals("Fall Selenium Conf, Save the Date & Call for Speakers!",searchBox.getText());

        String title = driver.getTitle();
        assertEquals("Blog Posts - 2016 | Selenium", title);

        driver.quit();


    }
}
