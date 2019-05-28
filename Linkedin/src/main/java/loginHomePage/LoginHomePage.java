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




    @FindBy(xpath = "/html/body/nav/section[2]/form/div[2]/a")
    WebElement Forgotpassword;
    @FindBy(xpath = "/html/body/main/section[3]/div/a")
    WebElement Postajob;
    @FindBy(xpath = "/html/body/main/section[4]/div/div[1]/div/a")
    WebElement Findpeopleyouknow;
    @FindBy(xpath = "/html/body/main/section[5]/div/div/ul/li[1]/a")
    WebElement Findacoworkerorclassmate;
    @FindBy(xpath = "/html/body/main/section[5]/div/div/ul/li[2]/a")
    WebElement Findanewjob;
    @FindBy(xpath = "/html/body/main/section[5]/div/div/ul/li[3]/a")
    WebElement Findacourseortraining;
    @FindBy(xpath = "/html/body/main/section[7]/div/a")
    WebElement Getstarted;
    @FindBy(xpath = "/html/body/main/section[8]/div/div/ul[1]/li[3]/a")
    WebElement HelpCentre;
    @FindBy(xpath = "/html/body/main/section[8]/div/div/ul[4]/li[2]/a")
    WebElement Members;
    @FindBy(xpath = "/html/body/main/section[8]/div/div/ul[4]/li[3]/a")
    WebElement Jobs;
    @FindBy(xpath = "/html/body/main/section[8]/div/div/ul[4]/li[4]/a")
    WebElement Companies;






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
    public void linkForgotpassword() throws InterruptedException {
        Forgotpassword.click();
        Thread.sleep(4);
    }
    public void clickOnPostajob() throws InterruptedException {
        Postajob.click();
        Thread.sleep(4);
    }
    public void searchOnFindpeopleyouknow() throws InterruptedException {
        Findpeopleyouknow.click();
        Thread.sleep(4);
    }
    public void searchOnFindacoworkerorclassmate() throws InterruptedException {
        Findacoworkerorclassmate.click();
        Thread.sleep(4);
    }
    public void searchOnFindanewjob() throws InterruptedException {
        Findanewjob.click();
        Thread.sleep(4);
    }
    public void searchOnFindacourseortraining() throws InterruptedException {
        Findacourseortraining.click();
        Thread.sleep(4);
    }

    public void searchOnGetstarted() throws InterruptedException {
        Getstarted.click();
        Thread.sleep(4);
    }
    public void searchOnHelpCentre() throws InterruptedException {
        HelpCentre.click();
        Thread.sleep(4);
    }
    public void Members() throws InterruptedException {
        Members.click();
        Thread.sleep(4);
    }
    public void Jobs() throws InterruptedException {
        Jobs.click();
        Thread.sleep(4);
    }
    public void Companies() throws InterruptedException {
        Companies.click();
        Thread.sleep(4);
    }

}