package gun13;
import Utils.BaseStaticDriver;
import com.sun.glass.events.KeyEvent;

import java.awt.*;
import java.util.Set;

public class _04_Task extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.google.com/");

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_COMMAND);
        r.keyPress(KeyEvent.VK_T);

        r.keyRelease(KeyEvent.VK_COMMAND);
        r.keyRelease(KeyEvent.VK_T);

//        driver.get("http://www.facebook.com/");

        Bekle(1);

        r.keyPress(KeyEvent.VK_COMMAND);
        r.keyPress(KeyEvent.VK_T);

        r.keyRelease(KeyEvent.VK_COMMAND);
        r.keyRelease(KeyEvent.VK_T);

//        driver.get("http://www.yahoo.com/");

        Bekle(1);

//        Set<String> windowsIds = driver.getWindowHandles();
//        for (String id : windowsIds) {
//            if (id.equals(driver.getWindowHandle()))
//                continue;
//
//            driver.switchTo().window(id); // diğer sayfaya (window'a) geçiş yaptık.
//            System.out.println(id + " - Title = " + driver.getTitle());
//
//


            BekleKapat();

        }
    }

