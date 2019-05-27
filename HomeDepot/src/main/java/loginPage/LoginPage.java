
package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement MyAccount;
    @FindBy(xpath = "//*[@id='emailholder' and @class='form-input body__m-top-large form-input--error']")
    WebElement Email;
    @FindBy(xpath = "//*[@id=\"authSignIn\"]/a/span")
    WebElement Signin;

    @FindBy(xpath = "//*[@id=\"email_id\"]")
    WebElement SignInEmailid;



    public void clickOnMyAccount() throws InterruptedException {
        MyAccount.getText();
        Thread.sleep(5);
    }
//    public void inputEmailid() throws InterruptedException {
//        Email.sendKeys("kamal");
//        Thread.sleep(5);
//    }

    public void clickOnSignin() throws InterruptedException {
        Signin.getText();
        Thread.sleep(5);
    }

    public void SignInEmailid() throws InterruptedException {
        SignInEmailid.sendKeys("kamal");
        Thread.sleep(5);
    }




}
