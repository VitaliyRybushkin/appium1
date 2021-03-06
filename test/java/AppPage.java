import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppPage {
    public void openMenu(AndroidDriver androidDriver){
        androidDriver.findElementByAccessibilityId("Open menu").click();
    }
    public void swipeDown(AndroidDriver androidDriver){

        (new TouchAction(androidDriver)).waitAction(1000).press(405,1573).moveTo(481,230).release().perform();
    }
    public void swipeUp(AndroidDriver androidDriver){

        (new TouchAction(androidDriver)).waitAction(1000).press(481,230).moveTo(405,1573).release().perform();
    }
    public void openSent(AndroidDriver androidDriver){
        androidDriver.findElementByAccessibilityId("Folder Sent: 0 unread").click();
    }
    public void openMyMails(AndroidDriver androidDriver){
        androidDriver.findElementByAccessibilityId("Folder Inbox: 6 unread").click();
    }
    public void openTools(AndroidDriver androidDriver){
        androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[15]").click();//tools
    }
    public void swipeLeft(AndroidDriver androidDriver){

        (new TouchAction(androidDriver)).press(971,1066).waitAction(1000).moveTo(115,1066).release().perform();
    }
    public void swipeRight(AndroidDriver androidDriver){

        WebDriverWait wait = new WebDriverWait(androidDriver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ru.yandex.mail:id/fab")));
        (new TouchAction(androidDriver)).press(3,382).waitAction(1000).moveTo(1000,407).release().perform();
    }
    public void logOut(AndroidDriver androidDriver){
        androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[17]").click();//log out
    }
    public void allStepsLogOut(AndroidDriver androidDriver){
        swipeRight(androidDriver);
        swipeDown(androidDriver);
        logOut(androidDriver);
    }
}
