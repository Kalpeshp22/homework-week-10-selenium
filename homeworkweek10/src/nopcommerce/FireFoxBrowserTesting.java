package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class FireFoxBrowserTesting {

    public static void main(String[] args) {

        String basURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(basURL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = "+ driver.getCurrentUrl());

        WebElement emailFeild = driver.findElement(By.id("Email"));

        emailFeild.sendKeys("admin321@gmail.com");

        WebElement passwordFeild = driver.findElement(By.name("Password"));

        passwordFeild.sendKeys("admin123");

        driver.close();



    }

}
