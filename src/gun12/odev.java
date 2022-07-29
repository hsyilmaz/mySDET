package gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class odev extends BaseStaticDriver {
    /*1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 video ya kadar listeyi uzatınız.
4- Son videonun title ını yazdırınız.
YouTube
Enjoy the videos and music you love, upload original content, and share it all with friends, family, and the world on YouTube.

*/
    public static void main(String[] args) {
        driver.get("https://www.youtube.com");
        WebElement search = driver.findElement(By.cssSelector("input#search"));
        search.sendKeys("Selenium");

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(search).sendKeys(Keys.ENTER).build();
        action.perform();
        Bekle(2);

        JavascriptExecutor js= (JavascriptExecutor) driver;

        Bekle(10);

        js.executeScript("window.scrollBy(0,15000)");

//        js.executeScript("arguments[0].click()", ?); // elemente click yapma

        BekleKapat();

        }



    }


