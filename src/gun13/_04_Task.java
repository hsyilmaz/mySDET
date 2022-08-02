package gun13;
import Utils.BaseStaticDriver;
import com.sun.glass.events.KeyEvent;

import java.awt.*;

public class _04_Task extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.google.com/");

        Robot r = new Robot();

        r.keyPress(java.awt.event.KeyEvent.VK_META);
        r.keyPress(java.awt.event.KeyEvent.VK_TAB);
        r.keyRelease(java.awt.event.KeyEvent.VK_TAB);
        Bekle(1);
        r.keyRelease(java.awt.event.KeyEvent.VK_META);

        for (int i = 0; i < 3; i++) {
            r.keyPress(KeyEvent.VK_COMMAND); // tuşa basıldı  down
            r.keyPress(KeyEvent.VK_TAB); // tuş bırakıldı up
                r.keyRelease(KeyEvent.VK_COMMAND);
                r.keyRelease(KeyEvent.VK_TAB);
    }

        driver.get("http://www.facebook.com");
        driver.switchTo().window(driver.getWindowHandle());
        driver.get("http://www.youtube.com");
        driver.switchTo().window(driver.getWindowHandle());
        driver.get("http://www.amazon.com");

            BekleKapat();

        }
    }


