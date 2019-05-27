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
}
