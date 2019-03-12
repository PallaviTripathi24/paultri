package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class QueOne {
    public static void main(String[] args)throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/windows");
           driver.findElement(By.xpath("//a[text()='Click Here']")).click();
           Set<String> str=driver.getWindowHandles();
            Set<String> session=driver.getWindowHandles();
            Iterator<String> iterator=session.iterator();
            String s1=iterator.next();
        System.out.println(s1);
        driver.switchTo().window(s1);

            }


//            driver.manage().window().maximize();
//        Thread.sleep(10000);
//        driver.close();
        }


