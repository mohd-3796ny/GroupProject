package testloginpage;

import base.CommonAPI;
import homepage.HomePage;
import loginPage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPage extends CommonAPI {

    LoginPage loginPage;
    String url = "https://www.homedepot.com/";


    @BeforeMethod
    public void init(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.get(url);
    }

    @Test
    public void clickOnMyaccount() throws InterruptedException {
        loginPage.clickOnMyAccount();
    }
//    @Test
//    public void inputEmailid() throws InterruptedException {
//        loginPage.inputEmailid();
//
//
//    }
    @Test
    public void clickOnSignin() throws InterruptedException {
        loginPage.clickOnSignin();
    }

//    @Test
//    public void SignInEmailid() throws InterruptedException {
//        loginPage.SignInEmailid();
//
//
//    }



}
