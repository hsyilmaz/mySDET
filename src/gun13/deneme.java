package gun13;

import Utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class deneme extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.google.com/");
        Robot rbt=new Robot();


        rbt.keyPress(KeyEvent.VK_META);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_META);


        for (int i = 0; i < 3; i++) {
            rbt.keyPress((KeyEvent.VK_TAB)); // tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
            Bekle(2);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


    }
}
