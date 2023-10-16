package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameid {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement emailElement = driver.findElement(By.name("email"));
        emailElement.sendKeys("raj31.vk@gmail.com");
        WebElement passElement = driver.findElement(By.name("pass"));
        passElement.sendKeys("Raj31.vk");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
