package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckboxTest {

    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8082/index.html");
        WebElement link= driver.findElement(By.id("checkboxLink"));
        link.click();

    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void testCheckBox(){



        WebElement lettuceCheckbox = driver.findElement(By.id("lettuceCheckbox"));
        lettuceCheckbox.click();

        WebElement mayoCheckbox = driver.findElement(By.id("mayoCheckbox"));

        WebElement turkeyCheckbox = driver.findElement(By.id("turkeyCheckbox"));
        System.out.println(lettuceCheckbox.isSelected());
        System.out.println(mayoCheckbox.isSelected());
        System.out.println(turkeyCheckbox.isSelected());

        assertTrue(lettuceCheckbox.isSelected());
    }
    @Test
    public void test_loading_complete_message(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        WebElement msg = driver.findElement(By.id("message"));
        assertEquals("Loading complete...", msg.getText());
    }
}
