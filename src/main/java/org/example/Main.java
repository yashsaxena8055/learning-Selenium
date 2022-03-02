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
        testSeleniumDev(driver);

//        searchBox.click();
//        searchBox.sendKeys("selenium");
//
//        searchBox.sendKeys(Keys.ENTER);
//       searchBox= driver.findElement(By.cssSelector(".LC20lb"));
//       searchBox.click();
    }

    public static  void testSeleniumDev(WebDriver driver){
        driver.get("https://www.selenium.dev/");

        WebElement searchBox=driver.findElement(By.cssSelector("#main_navbar > ul > li:nth-child(7) > a"));
        searchBox.click();
      searchBox=driver.findElement(By.id("m-blog2016-li"));
      searchBox.click();
        searchBox=driver.findElement(By.cssSelector(" body > div > div.td-main > div > main > div:nth-child(1) > div > ul > li:nth-child(4) > div > h5 > a"));
        searchBox.click();



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
