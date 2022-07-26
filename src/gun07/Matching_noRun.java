package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Matching_noRun extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> countries = driver.findElements(By.cssSelector("[id^='box10']"));

        List<WebElement> capitals = driver.findElements(By.cssSelector("[id^='box'][dragableelement]"));

        Actions actions = new Actions(driver);

        for (WebElement city : capitals)
            for (WebElement ctry : countries){
                Action action= actions.clickAndHold(city).build();
                action.perform();

                Bekle(1);

                action= actions.moveToElement(ctry).release(ctry).build();
                action.perform();

                if (city.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")){
                    break;}
            }

        BekleKapat();

    }
}

