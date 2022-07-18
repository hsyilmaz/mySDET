package gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");
        WebElement element = driver.findElement(By.linkText("Siparişlerim")); //sadece a taglerinde calisir
        System.out.println("element.getText() = " + element.getText());

        System.out.println("element.getAttribute(\"title\") = " + element.getAttribute("title"));
        System.out.println("element.getAttribute(\"href\") = " + element.getAttribute("href"));
        System.out.println("element.getAttribute(\"rel\") = " + element.getAttribute("rel"));

        WebElement element2 = driver.findElement(By.partialLinkText("Süper Teklif")); //sadece a taglerinde calisir
        System.out.println("element2.getText() = " + element2.getText());

        WebElement element3 = driver.findElement(By.linkText("Yurt Dışından"));
        System.out.println("element3.getText() = " + element3.getText());




        BekleKapat();
    }
}
