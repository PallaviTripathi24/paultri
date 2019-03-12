package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE_k_&gclid=EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE");

        WebElement el=driver.findElement(By.xpath("//span[text()='Prime']"));
        Actions action=new Actions(driver);
        action.moveToElement(el).perform();
        WebElement el1=driver.findElement(By.xpath("//span[text()='Join Prime']"));
        action.click(el1).perform();
    }
}
