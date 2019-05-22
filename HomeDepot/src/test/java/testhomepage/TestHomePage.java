package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    String url = "https://www.homedepot.com/";


    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @Test
    public void clickOnHomeServices() throws InterruptedException {
        homePage.clickOnHomeServices();
    }
    @Test
    public void clickOnTrackOrder() throws InterruptedException {
        homePage.clickOnTrackOrder();
    }
    @Test
    public void clickOnAllDepartments(){
        homePage.clickOnAlldepartments();
    }








}
