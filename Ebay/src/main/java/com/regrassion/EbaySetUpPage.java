package com.regrassion;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static base.CommonAPI.driver;

public class EbaySetUpPage {

    public static void initialization(){
 driver = new ChromeDriver ();

           System.setProperty ( "webdriver.chrome.driver" ,"/Users/mohdfaruque/Desktop/WebAutomationGroupProject/Generic/driver/chromedriver" );

        driver.manage ().timeouts ().implicitlyWait ( 20 ,TimeUnit.SECONDS );
        driver.manage ().timeouts ().pageLoadTimeout ( 20 ,TimeUnit.SECONDS );
       driver.manage ().window ().maximize ();
       driver.get ( "https://www.ebay.com" );
    }



}
