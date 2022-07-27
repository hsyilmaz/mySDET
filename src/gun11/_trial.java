package gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _trial extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.cssSelector("b#topic+input"));
        topic.sendKeys("Turkiye");

        driver.switchTo().frame(0);
        WebElement chkbox= driver.findElement(By.cssSelector("input#a"));
        chkbox.click();

        driver.switchTo().defaultContent();  // en basa donduk.

        driver.switchTo().frame(1);
        WebElement animals = driver.findElement(By.cssSelector("select#animals"));
        Select ddmenu=new Select(animals);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1);



        BekleKapat();
    }
}
