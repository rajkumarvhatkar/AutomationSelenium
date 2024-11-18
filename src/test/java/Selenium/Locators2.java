package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
     public static void main(String[] args) throws InterruptedException {

         String name = "rajkumar";
         System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
//         System.setProperty("webdriver.geco.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
//         FirefoxDriver driver = new FirefoxDriver();

//         System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
//         EdgeDriver driver = new EdgeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         String password = getPassword(driver);
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.manage().window().maximize();
         driver.findElement(By.id("inputUsername")).sendKeys(name);
         driver.findElement(By.name("inputPassword")).sendKeys("password");
         driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(2000);
         System.out.println(driver.findElement(By.tagName("p")).getText());
         Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
         Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
         driver.findElement(By.xpath("//*[text()='Log Out']")).click();
         driver.close();
    }

    public static String getPassword(ChromeDriver driver) throws InterruptedException {
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
         String passwordTest = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
         String [] passwordArry = passwordTest.split("'");
//         String[] passwordArry2 = passwordArry[1].split("'");
//         passwordArry2[0];
        String password = passwordArry[1].split("'")[0];
        return password;



    }
}
