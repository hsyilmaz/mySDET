package gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        WebElement textBox=driver.findElement(By.cssSelector("[placeholder='Full Name'][type='text']"));
        textBox.sendKeys("Automation");

        WebElement textBox2=driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        textBox2.sendKeys("Testing@gmail.com");

        WebElement textBox3=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        textBox3.sendKeys("Testing Current Address");

        WebElement textBox4=driver.findElement(By.cssSelector("[clas$=col-sm-12']"));
        textBox4.sendKeys("Testing Permanent Address");



        WebElement btn=driver.findElement(By.className("btn-primary"));
        btn.click();

        WebElement msg=driver.findElement(By.id("name"));
        if (msg.getText().contains("Automation"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        WebElement msg2=driver.findElement(By.id("email"));
        if (msg2.getText().contains("Testing@gmail.com"))
            System.out.println("test passed");
        else
            System.out.println("test failed");


        BekleKapat();
    }
}
