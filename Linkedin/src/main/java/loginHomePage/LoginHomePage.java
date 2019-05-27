package loginHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginHomePage extends CommonAPI {

    @FindBy(xpath = "/html/body/nav/section[2]/form/div[1]/div[1]/input")
    WebElement EmailorPhone;
    @FindBy(xpath = "/html/body/nav/section[2]/form/div[1]/div[2]/input")
    WebElement Password;
    @FindBy(xpath = "/html/body/nav/section[2]/form/div[2]/button")
    WebElement SignIn;

    public void inputEmailorPhone() throws InterruptedException {
        EmailorPhone.sendKeys("abc");
        Thread.sleep(4);
    }

    public void inputPassword() throws InterruptedException {
        Password.sendKeys("123");
        Thread.sleep(4);
    }
    public void buttonSignIn() throws InterruptedException {
        SignIn.click();
        Thread.sleep(4);
    }



}