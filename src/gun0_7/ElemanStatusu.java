package gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElemanStatusu extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());


    }
}
