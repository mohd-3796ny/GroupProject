package testloginHomePage;

import base.CommonAPI;
import loginHomePage.LoginHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginHomePage extends CommonAPI {

    LoginHomePage loginHomePage;
    String url = "https://www.linkedin.com/";


    @BeforeMethod
    public void init() {
        loginHomePage = PageFactory.initElements(driver, LoginHomePage.class);
        driver.get(url);
    }

    @Test
    public void inputEmailorPhone() throws InterruptedException {
        loginHomePage.inputEmailorPhone();
    }

    @Test
    public void inputPassword() throws InterruptedException {
        loginHomePage.inputEmailorPhone();

    }
    @Test
    public void buttonSignIn() throws InterruptedException {
        loginHomePage.buttonSignIn();

    }

    @Test
    public void linkForgotpassword() throws InterruptedException {
        loginHomePage.linkForgotpassword();

    }
    @Test
    public void clickOnPostajob() throws InterruptedException {
        loginHomePage.clickOnPostajob();

    }
    @Test
    public void searchOnFindpeopleyouknow() throws InterruptedException {
        loginHomePage.searchOnFindpeopleyouknow();

    }
    @Test
    public void searchOnFindacoworkerorclassmate() throws InterruptedException {
        loginHomePage.searchOnFindacoworkerorclassmate();

    }
    @Test
    public void searchOnFindanewjob() throws InterruptedException {
        loginHomePage.searchOnFindanewjob();

    }

    @Test
    public void searchOnFindacourseortraining() throws InterruptedException {
        loginHomePage.searchOnFindacourseortraining();
    }

    @Test
    public void searchOnGetstarted() throws InterruptedException {
        loginHomePage.searchOnGetstarted();
    }

    @Test
    public void searchOnHelpCentre() throws InterruptedException {
        loginHomePage.searchOnHelpCentre();
    }
    @Test
    public void Members() throws InterruptedException {
        loginHomePage.Members();
    }
    @Test
    public void Jobs() throws InterruptedException {
        loginHomePage.Jobs();
    }
    @Test
    public void Companies() throws InterruptedException {
        loginHomePage.Companies();
    }

}
