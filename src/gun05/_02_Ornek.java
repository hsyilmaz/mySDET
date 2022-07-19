package gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        textBox.sendKeys("Automation");

        WebElement textBox2=driver.findElement(By.cssSelector("input[placeholder='name@example.com'][type='email']"));
        textBox2.sendKeys("Testing@gmail.com");

        WebElement textBox3=driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        textBox3.sendKeys("Testing Current Address");

        WebElement textBox4=driver.findElement(By.cssSelector("#permanentAddress-wrapper .form-control"));//[id='permanentAddress-wrapper'] [class='form-control']
        textBox4.sendKeys("Testing Permanent Address");



        WebElement btn=driver.findElement(By.cssSelector("[class^='mt-2 justify'] button[class^=btn]"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        if (msg.getText().contains("Automation"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        WebElement msg2=driver.findElement(By.cssSelector("input[placeholder='name@example.com'][type='email']"));
        if (msg2.getText().contains("Testing@gmail.com"))
            System.out.println("test passed");
        else
            System.out.println("test failed");


        BekleKapat();
    }
}
