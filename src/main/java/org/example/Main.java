package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

//        WebDriver driver=firefoxDriver();
        WebDriver driver = chromeDriver();
        driver.get("http://google.com");


        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("selenium");

        searchBox.sendKeys(Keys.ENTER);




    }
    public static WebDriver firefoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
   public static WebDriver chromeDriver(){
       WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
   }

}
