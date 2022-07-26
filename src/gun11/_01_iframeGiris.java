package gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_iframeGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  //"frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

        driver.switchTo().parentFrame();  // geldigin yere geri don (1 basamak geri git)
        driver.switchTo().defaultContent(); // ilk ana sayfaya dogrudan geri don.










        BekleKapat();
    }
}
