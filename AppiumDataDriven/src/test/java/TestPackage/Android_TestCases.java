package TestPackage;

import PageObjects.TasksListPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Android_TestCases extends BasePage{
    TasksListPage tasksListPage;

    @Test
    public void Tests() throws MalformedURLException, InterruptedException {
        Android_setup();
        tasksListPage= new TasksListPage(appiumDriver);
        tasksListPage.createnewtask();
    }



}
