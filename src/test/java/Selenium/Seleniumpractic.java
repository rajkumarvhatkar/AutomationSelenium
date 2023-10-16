package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractic {

     public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://classes.nareshit.com/my-account/");
         driver.manage().window().maximize();
         driver.navigate().to("https://www.google.com/");
    }
}
