package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //firstTest();
        secondTest();
    }
    //Negative test case (wrong email and wrong password are entered)
    public static void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("websiteaddress");
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }

        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
        }

        WebElement email = driver.findElement(By.id("user_email"));
        email.sendKeys("fg123@gm.com");
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
        }

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("123456789");
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }
            WebElement buttonSubmit = driver.findElement(By.cssSelector("input.users-session-form__submit"));
            buttonSubmit.sendKeys(Keys.ENTER);

        System.out.println("Negative test case");
    }
    //Positive test case (correct email and correct password are entered)
    public static void secondTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("websiteaddress");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        //Acceptance of cookies
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        WebElement box = driver.findElement(By.id("user_first_name"));
        box.sendKeys("John");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        box = driver.findElement(By.id("user_last_name"));
        box.sendKeys("Doe");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        box = driver.findElement(By.id("user_email"));
        box.sendKeys("jd47i4n@hotmail.com");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        box = driver.findElement(By.id("user_password"));
        box.sendKeys("123AsDD*");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        box = driver.findElement(By.id("user_password_confirmation"));
        box.sendKeys("123AsDD*");
        try {
            Thread.sleep(3000);
        } catch(Exception e) {
        }
        //Checkbox mark accepting user's marketing rules
        WebElement checkbox = driver.findElement(By.id("user_marketing_consent_1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox).click().build().perform();
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
        }
        checkbox = driver.findElement(By.id("user_marketing_consent_2"));

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(checkbox).click().build().perform();
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
        }
        //Successful Login
        WebElement buttonLogin = driver.findElement(By.cssSelector("input.users-session-form__submit"));
        buttonLogin.sendKeys(Keys.ENTER);

        System.out.println("Positive test case");
    }
}