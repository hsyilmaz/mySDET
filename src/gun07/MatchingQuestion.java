package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MatchingQuestion extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> countries = driver.findElements(By.cssSelector("[id^='box10']"));
        for (WebElement ctry : countries)
            System.out.println(ctry.getText());

        List<WebElement> capitals = driver.findElements(By.cssSelector("[id^='box'][dragableelement]"));
        for (WebElement city : capitals)
            System.out.println(city.getText());

        Actions aksiyonlar = new Actions(driver);
        for (WebElement city : capitals)
            for (WebElement ctry : countries) {
                aksiyonlar.dragAndDrop(city, ctry).build().perform();

            }
    }
}
