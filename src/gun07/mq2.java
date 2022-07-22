package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class mq2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);
        List<WebElement> cities = driver.findElements(By.cssSelector(".dragableBox[id^='box']"));

        for (WebElement city : cities) {
            String num = city.getAttribute("id");
            num = num.substring(num.length() - 1);

                String cssSelector = "[id='box10" + num + "']";
                WebElement targetBox = driver.findElement(By.cssSelector(cssSelector));

                actions.dragAndDrop(city, targetBox).perform();
                Bekle(1);
            }

            BekleKapat();

    }
}
