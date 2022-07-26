package gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class _03_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  //"frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

        driver.switchTo().frame(0);  //"frame1 in icinde frame 3 e gectim."

        WebElement chkbox = driver.findElement(By.id("a"));
        chkbox.click();

        driver.switchTo().defaultContent();
                    // ya da
        // driver.switchTo().parentFrame();
        //driver.switchTo().parentFrame();

        driver.switchTo().frame(1);  //"frame1"

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(menu);
        ddmenu.selectByIndex(3);

//        Actions aksiyonlar=new Actions(driver);
//        Action aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build();
//        aksiyon.perform();
//
//        aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
//        aksiyon.perform();


        BekleKapat();

    }
}
