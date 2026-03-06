package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/carbon_footprint_tracker/frontend/login.html");
        driver.manage().window().maximize();

        System.out.println("Test Case 1: Login Page Opened Successfully");

        Thread.sleep(2000);
        
        driver.findElement(By.id("login-email")).sendKeys("arcade.manshi@gmail.com");
        System.out.println("Test Case 2: Email Entered Successfully");

        Thread.sleep(1000);

        driver.findElement(By.id("login-password")).sendKeys("123@bob");
        System.out.println("Test Case 3: Password Entered Successfully");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Test Case 4: Login Button Clicked Successfully");

        Thread.sleep(4000);
        
        driver.switchTo().alert().accept();
        System.out.println("Test Case 5: Alert Popup Accepted Successfully");

        Thread.sleep(3000);

        System.out.println("All Test Cases Executed Successfully");

        driver.quit();
    }
}