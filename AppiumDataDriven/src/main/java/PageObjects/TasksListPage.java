package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends Mobile_Gestures{
    public TasksListPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.ImageButton")
    MobileElement createbutton;
    public void createnewtask(){click(createbutton);}

}
