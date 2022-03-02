package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        FirefoxOptions options=new FirefoxOptions();
//        options.setBinary("/usr/bin/firefox");
//

        WebDriver driver=firefoxDriver();
//        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

//        List<WebElement> s= driver.findElements(By.name("q"));
//
//        WebElement searchBox= s.get(0);

        WebElement searchBox=driver.findElement(By.name("q"));


        searchBox.click();
        searchBox.sendKeys("selenium");

        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> link = driver.findElements(By.className("yuRUbf"));
        WebElement element=link.get(2);
        element.click();


    }
    public static WebDriver firefoxDriver()
    {
             return new FirefoxDriver();
    }
   public static WebDriver chromeDriver(){
        return new ChromeDriver();
   }

}
