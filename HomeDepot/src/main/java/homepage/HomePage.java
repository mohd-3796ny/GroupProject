package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[3]/div[1]/div/div/a/img")
    WebElement HomeServices;
    @FindBy(xpath = "//*[@id=\"headerOrderStatus\"]")
    WebElement TracOrder;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a")
    WebElement AllDepartments;


//    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[3]/div[1]/div/div/a/img")
//    WebElement user;
//    @FindBy(xpath = "//*[@id=\"headerOrderStatus\"]")
//    WebElement pass;
//    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a")
//    WebElement login;
//
//    public void login(){
//        user.sendKeys("");
//        pass.sendKeys("");
//        login.click();
//    }



    public void clickOnHomeServices() throws InterruptedException {
        //login();
        if (HomeServices.isDisplayed()){
            Assert.assertTrue(true);
            HomeServices.click();
            Thread.sleep(5);
        }
    }
    public void clickOnTrackOrder() throws InterruptedException {

        if (TracOrder.isDisplayed()){
            Assert.assertTrue(true);
            TracOrder.click();
            Thread.sleep(5);
        }
    }
    public void clickOnAlldepartments(){
        if (AllDepartments.isDisplayed()){
            Assert.assertTrue(true);
            AllDepartments.click();

        }


    }

}
