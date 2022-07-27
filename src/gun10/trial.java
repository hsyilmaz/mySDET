package gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class trial extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement Samsung= driver.findElement(By.cssSelector("a.hrefch"));  //By.LinkText"Samsung galaxy s6"
        Samsung.click();

        WebElement addtoCart= driver.findElement(By.linkText("Add to cart"));
        addtoCart.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement home= driver.findElement(By.cssSelector("a#nava"));
        home.click();

        BekleKapat();

    }
}
