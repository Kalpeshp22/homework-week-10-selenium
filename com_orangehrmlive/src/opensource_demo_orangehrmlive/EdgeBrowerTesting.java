package opensource_demo_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowerTesting {

    public static void main(String[] args) {
        String baseURL = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get(baseURL);// no return type  // using driver.get method

        driver.manage().window().maximize(); // using manage method we maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URl = "+ driver.getCurrentUrl());
        System.out.println("page source:" + driver.getPageSource());

        WebElement emailField =driver.findElement(By.id("txtUsername"));

        emailField.sendKeys("prime321@gmail.com");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));

        passwordField.sendKeys("prime123");

        //  Close the browser
        driver.close();
    }
}

