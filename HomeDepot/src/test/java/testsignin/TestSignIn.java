package testsignin;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signin.SignIn;

public class TestSignIn extends CommonAPI {

    SignIn signIn;

    String url = "https://www.homedepot.com";


    @BeforeMethod
    public void init(){
        signIn = PageFactory.initElements(driver, SignIn.class);
        driver.get(url);
    }

    @Test
    public void clickOnSigneIn() throws InterruptedException {
        signIn.clickMyAccount();
    }


}


