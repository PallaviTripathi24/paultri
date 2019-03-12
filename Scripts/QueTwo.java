package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class QueTwo {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/TestingExample/Chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        driver.close();
    }
}
