package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumpractic {

     public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://classes.nareshit.com/my-account/");
         driver.manage().window().maximize();
         driver.navigate().to("https://www.google.com/");

         // Firefox
         System.setProperty("webdriver.geco.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         FirefoxDriver driver1 = new FirefoxDriver();

         //Microsoft
         System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         EdgeDriver driver2 = new EdgeDriver();
    }
}
