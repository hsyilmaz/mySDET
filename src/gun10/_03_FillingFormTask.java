package gun10;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */


import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
       driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("ismet");

        WebElement description=driver.findElement(By.id("description"));
        description.sendKeys("hoca");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        wait.until(ExpectedConditions.textToBe(By.cssSelector("div#submit-control"),
                "Form submited Successfully!"));

        WebElement mesaj=driver.findElement(By.cssSelector("div#submit-control"));
        Assert.assertEquals("Form submited Successfully!", mesaj.getText());

        BekleKapat();
    }
}
