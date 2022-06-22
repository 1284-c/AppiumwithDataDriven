package TestPackage;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;

public class Android_TestCases extends BasePage{
    TasksListPage tasksListPage;
    CreateTaskPage createTaskPage;

    @DataProvider(name = "tasks data")
    public Object[][] passData() throws IOException, ParseException, org.json.simple.parser.ParseException {
        return JsonReader.getJSONdata(System.getProperty("user.dir")+"/data/TasksData.json","Tasks Data",2);
    }

    @Test(dataProvider ="tasks data")
    public void Tests(String taskname,String taskDesc) throws MalformedURLException, InterruptedException {
        Android_setup();
        tasksListPage= new TasksListPage(appiumDriver);
        tasksListPage.createnewtask();
        createTaskPage = new CreateTaskPage(appiumDriver);
        createTaskPage.tasktitle(taskname);
        createTaskPage.tasknote(taskDesc);
        createTaskPage.clicktag();
        createTaskPage.selectatag();
        createTaskPage.clickokbutton();
        createTaskPage.clicktaskpriorty();
        createTaskPage.selectpriority();
        createTaskPage.clickokbutton();
        createTaskPage.savetask();


    }



}
