package gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        String homepage=driver.getWindowHandle(); // bulunduğun sayfanın win id si

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement link: linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIds=driver.getWindowHandles();  // açık olan tüm sayfaların win id leri
        for(String id: windowsIds) {
            if (id.equals(homepage))
                continue; // ana sayfa değilse

            driver.switchTo().window(id); // diğer sayfaya (windowa) geçiş yaptık
            System.out.println(id + " - Title = " + driver.getTitle());
        }

        Bekle(3);
        BekleKapat();
    }
}
