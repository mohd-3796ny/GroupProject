package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/div[1]/div/div/a/img")
    WebElement HomeServices;
    @FindBy(xpath = "//*[@id=\"headerOrderStatus\"]")
    WebElement TracOrder;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a")
    WebElement AllDepartments;

    @FindBy(xpath = "//*[@id=\"furniture\"]")
    WebElement Furniture;
    @FindBy(tagName = "img stretchy 335x134")
    WebElement SelectEntrywayFurniture;
    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[1]/a")
    WebElement StoreFinder;

    @FindBy(xpath = "//*[@id=\"gpsButton\"]/span")
    WebElement UseMyLocation;
    @FindBy(xpath = "//*[@id=\"storeSearchBox\"]")
    WebElement storeSearchBox;
    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[5]/a")
    WebElement CreditServices;
    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[4]/a")
    WebElement GiftCards;
    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    WebElement headerSearch;
    @FindBy(xpath = "(//a[contains(text(),'Hardware')])[1]")
    WebElement Hardware;
    @FindBy(xpath = "(//b[contains(text(),'Door Hardware')])")
    WebElement DoorHardware;
//    @FindBy(xpath = "(//a[contains(text(),'Casters')])[1]")
//    WebElement Casters;
    @FindBy(xpath = "//*[@id=\"side\"]/div/div/div[1]/div[2]/ul/li[2]/a")
    WebElement MemorialDay;
    @FindBy(xpath = "//a[contains(text(),'Local Ad')]")
    WebElement LocalAd;
//    @FindBy(xpath = "//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li[2]/a")
//    WebElement Bath;
    @FindBy(xpath = "(//a[contains(text(),'Electrical')])[1]")
    WebElement Electrical;
    @FindBy(xpath = "(//a[contains(text(),'Outdoor Living')])[1]")
    WebElement OutdoorLiving;
    @FindBy(xpath = "(//a[contains(text(),'Plumbing')])[1]")
    WebElement Plumbing;
    @FindBy(xpath = "(//a[contains(text(),'Tools')])[1]")
    WebElement Tools;
    @FindBy(xpath = "(//a[contains(text(),'Building Materials')])[1]")
    WebElement BuildingMaterials;
    @FindBy(xpath = "(//a[contains(text(),'Appliances')])[1]")
    WebElement Appliances;

    @FindBy(xpath = "//*[@id=\"container\"]/div[3]/footer/div[2]/nav[1]/ul/li[1]/a")
    WebElement CheckOrderStatus;

    @FindBy(xpath = "//*[@id=\"container\"]/div[3]/footer/div[2]/nav[1]/ul/li[2]/a")
    WebElement CheckYourCreditCard;

    @FindBy(xpath = "//*[@id=\"container\"]/div[3]/footer/div[2]/nav[1]/ul/li[3]/a")
    WebElement OrderCancellation;






    public void clickOnHomeServices() throws InterruptedException {

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
    public void clickOnAlldepartments() throws InterruptedException {

        TestLogger.log(getClass().getSimpleName()+" "+ convertToString(new Object(){

        }.getClass().getEnclosingMethod().getName())+" "+ "department has been click");

        if (AllDepartments.isDisplayed()){
            Assert.assertTrue(true);
            AllDepartments.click();
            Thread.sleep(3);

        }
    }
    public void linkOnFurniture() throws InterruptedException {
        Furniture.getText();
        Thread.sleep(3);
    }

    public void CheckOrderStatus() throws InterruptedException {
        CheckOrderStatus.getText();
        Thread.sleep(3);
    }



//    public void searchSelectEntrywayFurniture() throws InterruptedException {
//        SelectEntrywayFurniture.click();
//        Thread.sleep(3);
//    }
    public void searchStoreFinder() throws InterruptedException {
        StoreFinder.getLocation();
        Thread.sleep(5);
    }
//    public void searchUseMyLocation() throws InterruptedException {
//        UseMyLocation.click();
//        Thread.sleep(5);
//    }
//    public void inputStoreSearchBox() throws InterruptedException {
//        storeSearchBox.sendKeys("92-30 168th Street\n" +
//                "Jamaica, NY 11433");
//        Thread.sleep(3);
//
//    }
    public void linkCreditServices() throws InterruptedException {
        CreditServices.getText();
        Thread.sleep(5);
    }
    public void clickOnGiftCards() throws InterruptedException {
        GiftCards.click();
        Thread.sleep(5);
    }
    public void ClickOnheaderSearch() throws InterruptedException {
        headerSearch.sendKeys("Java Book");
        Thread.sleep(5);
    }
    public void clickOnHardWare() throws InterruptedException {
        Hardware.getText();
        Thread.sleep(5);

   }
//    public void searchOnDoorHardware() throws InterruptedException {
//        DoorHardware.getText();
//        Thread.sleep(5);
//    }
//    public void clickOnCasters() throws InterruptedException {
//        Casters.click();
//        Thread.sleep(5);
//    }
//    public void linkMemorialDay() throws InterruptedException {
//        MemorialDay.getText();
//        Thread.sleep(5);
//    }
    public void clickOnLocalAd() throws InterruptedException {
        LocalAd.click();
        Thread.sleep(5);
    }
//    public void clickOnBath() throws InterruptedException {
//        Bath.click();
//        Thread.sleep(5);
//    }
    public void clickOnElectrical() throws InterruptedException {
        Electrical.getText();
        Thread.sleep(5);
    }
    public void clickOnOutDoorLiving() throws InterruptedException {
        OutdoorLiving.getText();
        Thread.sleep(5);
    }
    public void clickOnPlumbing() throws InterruptedException {
        Plumbing.getText();
        Thread.sleep(5);
    }
    public void clickOnTools() throws InterruptedException {
        Tools.getText();
        Thread.sleep(5);
    }
    public void clickOnBuildingMaterials() throws InterruptedException {
        BuildingMaterials.getText();
        Thread.sleep(5);
    }
    public void searchOnAppliances() throws InterruptedException {
        Appliances.getText();
        Thread.sleep(5);
    }

    public void CheckYourCreditCard() throws InterruptedException {
        CheckYourCreditCard.getText();
        Thread.sleep(5);
    }

    public void OrderCancellation() throws InterruptedException {
        OrderCancellation.getText();
        Thread.sleep(5);
    }

}



