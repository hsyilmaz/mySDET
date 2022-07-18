
package gun05;

        import Utils.BaseStaticDriver;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
/*1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
2- Business i çekleyin.  [id$='4586_0']   [type='radio'][value='Business']
3- discover XYZ ye tıklatın ve online Advertising i seçin
 [id='u_1fG_4588']   [value='Online Advertising']
4- Every day i seçin   [id='u_1fG_89585_0']
5- Good u seçin  [type='radio'][value='Good']
6- using XYZ yi tıklatın ve 3.seçeneği seçin
[id='u_1fG_4597']     [value*='month'] [id='u_1fG_4597'] > :nth-child(4)
*/

public class _01_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("[id$='4586_0']"));
        business.click();
        Bekle(2);
        WebElement dropDownDiscover=driver.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscover.click();
        Bekle(2);
        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("[id$=_4588] > [value='Online Advertising']"));
        optionOnlineAdvertising.click();
        Bekle(2);
        WebElement buttonEveryDay=driver.findElement(By.cssSelector("[id='u_eva_89585_0'][value='Every Day']"));
        buttonEveryDay.click();
        Bekle(2);
        WebElement goodRadio=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();
        Bekle(2);
        WebElement howLongDropdown=driver.findElement(By.cssSelector("[id$='_4597']"));
        howLongDropdown.click();
        Bekle(2);
        WebElement secenek4=driver.findElement(By.cssSelector("[id$='_4597'] > :nth-child(4)"));
        secenek4.click();

        goodRadio.click(); // sadece son açılan dropdown kapansın diye herhangi bir yere tıklattık
        Bekle(3);
        BekleKapat();
    }
}


//button[class='btn btn-default'][onclick='showInput();']

// id için
// By.id("get-input");
// cssSelector
// By.cssSelector("[id='get-input']");
// By.cssSelector("#get-input");
// driver.findElement(By.cssSelector("[id='get-input']"));
