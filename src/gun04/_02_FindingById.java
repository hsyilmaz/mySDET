package gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.id("label_3"));
        System.out.println(element.getText());

        Thread.sleep(2000);
        driver.quit();

    }


}
