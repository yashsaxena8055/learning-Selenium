package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
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
    @org.junit.Test
    public void test_selenium_dot_dev_blog2017() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://selenium.dev");

        WebElement blog = driver.findElement(By.linkText("Blog"));
        blog.click();

        WebElement link2016 = driver.findElement(By.id("m-blog2017"));
        link2016.click();

        WebElement element = driver.findElement(By.linkText("Hacking with IntelliJ"));
        assertEquals("Hacking with IntelliJ", element.getText());

        String title = driver.getTitle();
        assertEquals("Blog Posts - 2017 | Selenium", title);

        driver.quit();
    }
}
