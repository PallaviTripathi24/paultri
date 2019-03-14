package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Testing2/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
        List<WebElement> el = driver.findElements(By.xpath("//h2[text()='HTML Table with unique id']//following-sibling::table//tr"));
        System.out.println("row size" + el.size());
        for (int i = 2; i <= el.size(); i++) {
            List<WebElement> td = driver.findElements(By.xpath("//h2[text()='HTML Table with no id']//following-sibling::table//tr[" + i + "]//td"));
// System.out.println(td.get(0).getText());
            if (td.get(0).getText().equals("Quality Assurance Engineer"))
                System.out.println("Salary of Quality Assurance Engineer: "+ td.get(2).getText());
        }

        }
    }