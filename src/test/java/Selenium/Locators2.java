package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
     public static void main(String[] args) throws InterruptedException {

         String name = "rajkumar";
         System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.manage().window().maximize();
         driver.findElement(By.id("inputUsername")).sendKeys(name);
         driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
         driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(2000);
         System.out.println(driver.findElement(By.tagName("p")).getText());
         Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
         Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
    }
}
