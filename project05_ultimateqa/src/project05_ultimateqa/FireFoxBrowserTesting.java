package project05_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FireFoxBrowserTesting {
    public static void main(String[] args) { // main method
        String baseURL = "https://courses.ultimateqa.com/users/sign_in"; // 1ST STEPE
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Web driver is object

        driver.get(baseURL);// no return type  // using driver.get method

        driver.manage().window().maximize(); // using manage method we maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URl = " + driver.getCurrentUrl());
        System.out.println("page source:" + driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("user[email]"));

        emailField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.name("user[password]"));

        passwordField.sendKeys("SuperSecret");


        //  Close the browser
        driver.close();

    }
}
