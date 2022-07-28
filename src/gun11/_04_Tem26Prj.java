package gun11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _04_Tem26Prj extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");


        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < 5; i++) {
                WebElement firstnumber = driver.findElement(By.id("number1Field"));
                int num1 = (int) (Math.random() * 10 + 1);
                firstnumber.sendKeys(String.valueOf(num1)); //firstnumber.sendKeys(""+num1);
                WebElement secondnumber = driver.findElement(By.id("number2Field"));
                int num2 = (int) (Math.random() * 10 + 1);
                secondnumber.sendKeys(Integer.toString(num2));  //secondnumber.sendKeys(num2+"")

                WebElement selectmenu = driver.findElement(By.id("selectOperationDropdown"));
                Select ddmenu = new Select(selectmenu);
                ddmenu.selectByIndex(j);

                WebElement btn = driver.findElement(By.id("calculateButton"));
                btn.click();
//                try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
//                } catch (Exception e) {
//                }
                WebElement answer = driver.findElement(By.id("numberAnswerField"));

                switchmethod(j, num1, num2, answer);

                Bekle(2);

                firstnumber.clear();
                secondnumber.clear();
            }
        }

        BekleKapat();
    }

    static void switchmethod(int j, int num1, int num2, WebElement answer) {
        switch (j) {
            case 0:
                int toplam = num1 + num2;
                Assert.assertTrue((toplam+"").contains(answer.getText()));
                break;
            case 1:
                int cikar = num1 - num2;
                Assert.assertTrue((cikar+"").contains(answer.getText()));
                break;
            case 2:
                int carp = num1 * num2;
                Assert.assertTrue((""+carp).contains(answer.getText()));
                break;
            case 3:

                int bol = num1 / num2;
                Assert.assertTrue((""+bol).contains(answer.getText()));
                break;

            case 4:
                String koncat = num1+"" + num2+"";
                Assert.assertTrue(koncat.contains(answer.getText()));
                break;
        }
    }

}

