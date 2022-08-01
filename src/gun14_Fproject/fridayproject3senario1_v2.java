package gun14_Fproject;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class fridayproject3senario1_v2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com");

        WebElement addtoCart = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addtoCart.click();


       driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));

       WebElement validate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));

        Assert.assertEquals("1",validate.getAttribute("value"));

        WebElement remove = driver.findElement(By.className("Product-Remove"));
        remove.click();

        WebElement contShop = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        contShop.click();

        driver.switchTo().defaultContent();

        WebElement validate2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id='cart_item_nos']")));

        Assert.assertTrue(validate2.getText().contains("0"));


        BekleKapat();
    }
}
