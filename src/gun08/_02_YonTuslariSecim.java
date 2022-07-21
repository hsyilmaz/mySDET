package gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_YonTuslariSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);
        Action action=aksiyonlar
                .moveToElement(element)
                .click()
                .sendKeys("b")
                .build();
        action.perform();

        Bekle(2);
        action=aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        action.perform();


        BekleKapat();


    }
}