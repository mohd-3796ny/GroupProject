package testhomepage;

import base.CommonAPI;
import homepage.HomePage1;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage1 extends CommonAPI {
    HomePage1 homePage1;
    @BeforeMethod
    public void init(){ homePage1 = PageFactory.initElements(driver, HomePage1.class);
    }

    @Test(enabled = false)
    public void clickOnStoreFinder(){
        homePage1.setClick();
    }




}
