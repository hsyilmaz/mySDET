package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
       driver.get("https://demoqa.com/buttons");
       Bekle(2);

        WebElement element =driver.findElement(By.id("doubleClickBtn"));

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).doubleClick().build();
        action.perform();

        Bekle(6);
       BekleKapat();
    }
}
