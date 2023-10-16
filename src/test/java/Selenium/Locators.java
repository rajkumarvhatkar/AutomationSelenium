package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("Rajkumar");
        driver.findElement(By.name("inputPassword")).sendKeys("helloworld");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rajkumar");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("raj.vk@mail.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'] [2]")).sendKeys("raj31.vk@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9860801124");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("raj31.vk@gmail.com");
      //  driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9860801124");
       // driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rajkumar");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("//input[@id='chkboxOne']")).click();
        driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
    }
}
