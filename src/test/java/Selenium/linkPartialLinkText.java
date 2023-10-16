package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkPartialLinkText {
    public static void main(String[] args){
        System.setProperty("webrider.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Automationpractice\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Forgotten password?")).click();
        driver.navigate().back();
    }

}
