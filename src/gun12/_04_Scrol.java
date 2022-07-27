package gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrol extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com");

        // JavaScript komutlarini calistirmak icin once js degiskeni tanimlandi.

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");

        Bekle(2);  js.executeScript("window.scrollBy(0,-500)");






        Bekle(5);
        BekleKapat();

    }
}
