package project05_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) { // main method
        String baseURL = "https://courses.ultimateqa.com/users/sign_in"; // 1ST STEPE
        // baseUrl is as   varibale declariton and valuation
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //set protepry of system class. // web driver /   all in small letter

        WebDriver driver = new ChromeDriver(); // Web driver is object
        // is class // varibale      =  object creation
        // Lunch the URL

        driver.get(baseURL);// no return type  // using driver.get method

        driver.manage().window().maximize(); // using manage method we maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URl = "+ driver.getCurrentUrl());
        System.out.println("page source:" + driver.getPageSource());

        WebElement emailField =driver.findElement(By.id("user[email]"));

        emailField.sendKeys("admin321@gmail.com");

        WebElement passwordField = driver.findElement(By.name("user[password]"));

        passwordField.sendKeys("admin123");

        //  Close the browser
        driver.close();
    }
}


