package gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02Ornek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  //"frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

//        driver.switchTo().parentFrame();  // geldigin yere geri don (1 basamak geri git)
        driver.switchTo().defaultContent(); // ilk ana sayfaya dogrudan geri don.

        driver.switchTo().frame(1);  //"frame1"

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size() - 1);  // son elemeni sectik
//      ddmenu.selectByValue("avatar");

        /*frame 0
         >subframe 0
         >subframe 1*/

        BekleKapat();
    }
}