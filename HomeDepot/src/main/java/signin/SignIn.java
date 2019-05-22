package signin;

import base.CommonAPI;
import jdk.nashorn.internal.ir.IfNode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignIn extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
    WebElement MyAccount;

    public void clickMyAccount() throws InterruptedException {
        if (MyAccount.isDisplayed()){
            Assert.assertTrue(true);
            MyAccount.click();
            Thread.sleep(5);
        }
    }
}
