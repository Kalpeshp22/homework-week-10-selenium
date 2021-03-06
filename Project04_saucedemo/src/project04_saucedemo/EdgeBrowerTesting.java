package project04_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowerTesting {
    public static void main(String[] args) { // main method
        String baseURL = "https://www.saucedemo.com/"; // 1ST STEPE
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver(); // Web driver is object

        driver.get(baseURL);// no return type  // using driver.get method

        driver.manage().window().maximize(); // using manage method we maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URl = "+ driver.getCurrentUrl());
        System.out.println("page source:" + driver.getPageSource());

        WebElement emailField =driver.findElement(By.id("user-name"));

        emailField.sendKeys("admin123@gamil.com");

        WebElement passwordField = driver.findElement(By.name("password"));

        passwordField.sendKeys("prime123");

        //  Close the browser
        driver.close();

    }
}


