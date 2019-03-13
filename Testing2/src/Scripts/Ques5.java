package Scripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Ques5 {
    public static void main(String[] args) {
        partOne();
        PartTwo();
    }
    static void partOne()
    {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().defaultContent();
        System.out.println("Number of iframes " + driver.findElements(By.xpath("//iframe")).size());
    }

       static  void PartTwo(){
        String expected="Acid-free paper for the digital age";
           WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("//a[text()='Sample content']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");
        String actual=driver.findElement(By.xpath("//h2")).getText();
        if(expected.equals(actual)){
            System.out.println("The actual and expected header matches");
        }
        driver.close();
    }
}
