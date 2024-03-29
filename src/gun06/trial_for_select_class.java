package gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class trial_for_select_class extends BaseStaticDriver {
    @Test
    public void selectTest() throws InterruptedException {

        driver.get("https://sqengineer.com/practice-sites/basic-web-elements/");

        Select selectBox = new Select(driver.findElement(By.id("selectBox")));
        selectBox.selectByIndex(0);
        System.out.println("get first when New York : "+selectBox.getFirstSelectedOption().getText());
        selectBox.getOptions().forEach(opt -> System.out.println(opt.getText()));

        System.out.println("-----------------------------------------------------");
        Bekle(3);

        selectBox.selectByValue("Francisco");
        System.out.println("get first when San francisco : "+selectBox.getFirstSelectedOption().getText());

        System.out.println("-----------------------------------------------------");
        Bekle(3);

        selectBox.selectByVisibleText("Sydney");
        System.out.println("get first when Sydney : "+selectBox.getFirstSelectedOption().getText());

        System.out.println("-----------------------------------------------------");

        selectBox.getAllSelectedOptions().forEach(opt -> System.out.println(opt.getText()));

        System.out.println("a----------------------------------------------------");

        System.out.println("selectBox.getWrappedElement().getText() = " + selectBox.getWrappedElement().getText());

        Assert.assertEquals(selectBox.getFirstSelectedOption().getText(), "Sydney");

        driver.quit();
    }
}
