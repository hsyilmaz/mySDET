package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStaticDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    static
    {
        KalanOncekileriKapat();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli
    }

    public static void BekleKapat()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void Bekle(int saniye)
    {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver /T");
        } catch (Exception ignored) {}

    }

}




     /*
    İnterview Sorusu :  Implicit ve Explicit

    Implicitliy : Bütün elemanlar için geçerli,Bir kere tanımlanır.
    Explicit    : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

    Her ikisi tanımlı ise : önce Implicit kullanılır, ve üzerine Explicit in süresi eklenerek
                                  toplam hata sınır süresi ortaya çıkmış olur.

  ExpectedConditions
             .titleIs -> title bu olana kadar bekle
             .titleContains -> title ın da bu kelime geçene kadar bekle
             .urlToBe -> url bu olana kadar bekle
             .urlContains -> url de bu kelime geçene kadar bekle
             .visibilityOfElementLocated -> eleman var ve gözükür olana kadar bekle
             .visibilityOfTheElement -> eleman gözükene kadar bekle
             .InvisibilityOfTheElement -> eleman kaybolana kadar bekle
             .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
             .elementToBeSelected -> eleman seçilebilir olana kadra bekle
             .textToBe -> elemanda verilen txt gözükene kadar bekle.
             .alertIsPresent()  -> alert çıkana kadar bekle.
             .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle
             .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle
             .numberOfElementsToBe  -> verilen locatora sahip elemanların sayısı bu olana kadar bekle
             .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle
             .numberOfElementsToBeMoreThan -> verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle

https://the-internet.herokuapp.com/
https://the-internet.herokuapp.com/dynamic_controls
*/
