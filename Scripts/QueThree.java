package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QueThree {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement wb = driver.findElement(By.name("q")) ;
        wb.sendKeys("To the new");
        wb.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
    }
}
