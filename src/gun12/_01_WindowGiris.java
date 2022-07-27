package gun12;
import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;

public class _01_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement link: linkler)
            if(!link.getAttribute("href").contains("mailto"))
                link.click();

        Set<String> WindowIDs= driver.getWindowHandles();
        for(String id:WindowIDs)
            System.out.println("id = " + id);


        Bekle(6);
        BekleKapat();
    }
}
