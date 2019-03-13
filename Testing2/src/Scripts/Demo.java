package Scripts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
//        fetchText();
//        dismiss();
//enterData();
    acceptData();
    }


    static void fetchText() {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[text()='Click me!']")).click();
        Alert alert = driver.switchTo().alert();
        String str = driver.switchTo().alert().getText();
        System.out.println(str);
    }
    static  void dismiss()
    {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }
    static void enterData()
    {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
         driver.switchTo().alert().sendKeys("Pallavi tripathi");

    }
    static void acceptData(){
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        driver.switchTo().alert().accept();
        driver.close();
    }

}


