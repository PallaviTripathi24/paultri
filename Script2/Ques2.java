package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class Ques2 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        File f= new File("/home/ttn/IdeaProjects/Testing2/Properties/regist.properties");
        FileInputStream fip= new FileInputStream(f);
        prop.load(fip);
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(prop.getProperty("Fname"));
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(prop.getProperty("Lname"));
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(prop.getProperty("Address"));
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(prop.getProperty("Phone"));

        List<WebElement> radioList = driver.findElements(By.name("radiooptions"));
        for (int i= 0; i<radioList.size(); i++){
            if (radioList.get(i).getAttribute("value").equals(prop.getProperty("Gender"))){
                driver.findElements(By.name("radiooptions")).get(i).click();
            }
        }

        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int j=0; j<checkboxList.size(); j++){
            if (checkboxList.get(j).getAttribute("value").equals(prop.getProperty("Ch1"))){
                driver.findElements(By.xpath("//input[@type='checkbox']")).get(j).click();
            }
            if (checkboxList.get(j).getAttribute("value").equals(prop.getProperty("Ch2"))) {
                driver.findElements(By.xpath("//input[@type='checkbox']")).get(j).click();
            }
        }

        driver.findElement(By.id("firstpassword")).sendKeys(prop.getProperty("passw1"));
        driver.findElement(By.id("secondpassword")).sendKeys(prop.getProperty("passw2"));


    }
    }
