package gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdnotFoundException {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        try {
            WebElement eleman = driver.findElement(By.id("label_"));
            System.out.println(eleman.getText());
        }
        catch(Exception ex){
            System.out.println("eleman bulunamadi "+ex.getMessage());
            }
            Thread.sleep(2000);
            driver.quit();
        }
    }

