package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueFour {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com");
//        driver.findElement(By.xpath("//a[text()='contact us']")).click();
//        driver.findElement(By.id("h-contact-us")).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("h-contact-us"))));
//        driver.close();


    }
}
