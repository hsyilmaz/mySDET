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


        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < 5; i++) {
                WebElement firstnumber = driver.findElement(By.id("number1Field"));
                int num1 = (int) (Math.random() * 10 + 1);
                String strnum1 = ""+num1;   ///String.valueOf(num1);
                firstnumber.sendKeys(strnum1);
                WebElement secondnumber = driver.findElement(By.id("number2Field"));
                int num2 = (int) (Math.random() * 10 + 1);
                String strnum2 = num2+""; ///String.valueOf(num2);
                secondnumber.sendKeys(strnum2);

                WebElement selectmenu = driver.findElement(By.id("selectOperationDropdown"));
                Select ddmenu = new Select(selectmenu);
                ddmenu.selectByIndex(j);

                WebElement btn = driver.findElement(By.id("calculateButton"));
                btn.click();
//                try {
                    wait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Answer']"),"Answer"));
                  //wait.until(ExpectedConditions.elementToBeClickable(By.id("clearButton")));
//                } catch (Exception e) {
//                }
                WebElement answer = driver.findElement(By.id("numberAnswerField"));

                switchmethod(j, num1, num2, answer);

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
                String strtoplam = String.valueOf(toplam);
                Assert.assertTrue(strtoplam.contains(answer.getText()));
                break;
            case 1:
                int cikar = num1 - num2;
                String strcikar = String.valueOf(cikar);
                Assert.assertTrue(strcikar.contains(answer.getText()));
                break;
            case 2:
                int carp = num1 * num2;
                String strcarp = String.valueOf(carp);
                Assert.assertTrue(strcarp.contains(answer.getText()));
                break;
            case 3:

                int bol = num1 / num2;
                String strbol = String.valueOf(bol);
                Assert.assertTrue(strbol.contains(answer.getText()));
                break;

            case 4:
                String strnum1=String.valueOf(num1);
                String strnum2=String.valueOf(num2);
                String concat =strnum1+strnum2;
                Assert.assertTrue(concat.contains(answer.getText()));
                break;
        }
    }


}
