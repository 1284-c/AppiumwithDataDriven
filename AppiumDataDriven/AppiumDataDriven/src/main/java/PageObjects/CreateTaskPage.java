package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends Mobile_Gestures{

    public CreateTaskPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id="com.jeffprod.todo:id/editTextTitre")
    MobileElement Title;
    public void tasktitle(String title){sendText(Title,title);}
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Note']")
    MobileElement Note;
    public void tasknote(String note)
    {sendText(Note,note);}
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Tag']")
    MobileElement Tag;
    public void clicktag()
    {click(Tag);}
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ListView/android.widget.CheckedTextView[1]\n")
    MobileElement tagselection;
    public void selectatag(){click(tagselection);}
    @AndroidFindBy(id = "android:id/button1")
    MobileElement okbutton;
    public void clickokbutton(){click(okbutton);}
    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextPriority")
    MobileElement priority;
    public void clicktaskpriorty(){click(priority);}
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]\n")
    MobileElement selectpriority;
    public void selectpriority()
    {click(selectpriority);}
    @AndroidFindBy(id = "com.jeffprod.todo:id/action_save")
    MobileElement savetask;
    public void savetask()
    {click(savetask);}}
