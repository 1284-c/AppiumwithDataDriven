package TestPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class BasePage {

    public AppiumDriver<MobileElement> appiumDriver;
    public WebDriverWait wait;
    DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
    //Boolean localAndroid=true;
    //  @BeforeTest
    public void Android_setup() throws InterruptedException, MalformedURLException {

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("avd", "Pixel_4_XL_API_31");
        desiredCapabilities.setCapability("avdLaunchTimeout", 180000);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jeffprod.todo");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.jeffprod.todo.ActivityMain");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), desiredCapabilities);
        Thread.sleep(5000);


    }/*
    public void iOS_setup() throws InterruptedException, MalformedURLException {


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability("avdLaunchTimeout",180000);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        appiumDriver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub/"), desiredCapabilities);
        Thread.sleep(5000);



    }*/
/*
    @Test
    public void click_app_button(){
        appiumDriver.findElementByAccessibilityId("App").click();
    }*/

    // @AfterTest
    public void tearDown(){
        appiumDriver.quit();
    }
}
