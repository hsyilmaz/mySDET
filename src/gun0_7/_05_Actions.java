package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_Actions extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click me']"));

        Bekle(2);
        Actions aksiyonlar= new Actions(driver);













        BekleKapat();
    }
}
