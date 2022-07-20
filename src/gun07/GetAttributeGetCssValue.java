package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("htpps://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));

        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("background"));
        System.out.println(inputValEnter.getCssValue("front-size"));
        System.out.println(inputValEnter.getCssValue("height"));


        



        BekleKapat();
    }
}
