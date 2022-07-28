package gun09_Fproject;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Tem26Sali extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                WebElement firstnumber = driver.findElement(By.id("number1Field"));
                int num1 = (int) (Math.random() * 20 + 1);
                firstnumber.sendKeys(String.valueOf(num1)); //firstnumber.sendKeys(""+num1);
                WebElement secondnumber = driver.findElement(By.id("number2Field"));
                int num2 = (int) (Math.random() * 20 + 1);
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

                Bekle(3);

                switch (j) {
                    case 0:
                        int toplam = num1 + num2;
                        Assert.assertTrue((toplam + "").contains(answer.getText()));
                        firstnumber.clear();secondnumber.clear();
                        break;
                    case 1:
                        int cikar = num1 - num2;
                        Assert.assertTrue((cikar + "").contains(answer.getText()));
                        firstnumber.clear();secondnumber.clear();
                        break;
                    case 2:
                        int carp = num1 * num2;
                        Assert.assertTrue(("" + carp).contains(answer.getText()));
                        firstnumber.clear();secondnumber.clear();
                        break;
                    case 3:

                        int bol = num1 / num2;
                        Assert.assertTrue(("" + bol).contains(answer.getText()));
                        firstnumber.clear();secondnumber.clear();
                        break;

                    case 4:
                        String koncat = num1 + "" + num2 + "";
                        Assert.assertTrue(koncat.contains(answer.getText()));
                        firstnumber.clear();secondnumber.clear();
                        break;
                }
            }
        }
        BekleKapat();
    }

}

