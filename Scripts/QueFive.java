package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueFive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com");
        driver.findElement(By.xpath("//a[text()='contact us']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();
    }
}
