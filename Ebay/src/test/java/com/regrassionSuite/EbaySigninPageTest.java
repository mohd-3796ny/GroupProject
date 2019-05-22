package com.regrassionSuite;

import com.regrassion.EbaySigninPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbaySigninPageTest extends EbaySigninPage {
    EbaySigninPage objOfSigninPage = null;
"com.regrassionSuite.EbaySigninPageTest
//    private Iterable<?> tittle;
//    private Object signinPage;

    @BeforeMethod
public void initializationOfElements(){objOfSigninPage = PageFactory.initElements ( driver,EbaySigninPage.class );}


////@Test
////public void EbayImageTest(){
////        boolean flag = SigninPage.equals ( "EbayImage" );
////        Assert.assertTrue ( flag );
////    }
//
//@Test
//public void signinPageTest(){
//    objOfSigninPage.
//
////}
////
////@AfterMethod
////    public void tearDown(){
////driver.quit ();
////}


    @Test
    public void SignInBox(){
        objOfSigninPage.SignInBox();
        System.out.println("Invalid Password");

    }

}
