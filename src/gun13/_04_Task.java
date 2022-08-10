package gun13;

import Utils.BaseStaticDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;


public class _04_Task extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.google.com/");

        Robot rbt = new Robot();

        rbt.keyPress(KeyEvent.VK_META);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_META);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_META);
            rbt.keyPress(KeyEvent.VK_T);
            rbt.keyRelease(KeyEvent.VK_T);
            rbt.keyRelease(KeyEvent.VK_META);
        }

        switchingWindow("https://www.youtube.com");
        switchingWindow("https://www.amazon.com");

        BekleKapat();}

    public static void switchingWindow(String url){
        Set<String> windowsIds = driver.getWindowHandles();  // IDs of all open pages/windows.
        for (String id : windowsIds) {
            if(id.equals(driver.getWindowHandle()))
                continue;

        driver.switchTo().window(id); //
        driver.get(url);
        System.out.println(id + " - Title = " + driver.getTitle());
    }

    }

}












