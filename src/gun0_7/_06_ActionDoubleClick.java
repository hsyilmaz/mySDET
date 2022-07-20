package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClick extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement element = driver.findElement(By.id("doubleClickBtn"));


        Actions Aksiyonlar = new Actions(driver);
        Action aksiyon=Aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();

        Bekle(6);
        BekleKapat();


    }
}
