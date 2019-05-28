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
    public void clickOnAllDepartments() throws InterruptedException {
        homePage.clickOnAlldepartments();
    }

    @Test
    public void linkOnFurniture() throws InterruptedException {
        homePage.linkOnFurniture();
    }
//    @Test
//    public void searchSelectEntrywayFurniture() throws InterruptedException {
//        homePage.searchSelectEntrywayFurniture();
//    }
    @Test
    public void searchStoreFinder() throws InterruptedException {
        homePage.searchStoreFinder();
    }
//    @Test
//    public void searchUseMyLocation() throws InterruptedException {
//        homePage.searchUseMyLocation();
//    }
//    @Test
//    public void inputStoreSearchBox() throws InterruptedException {
//        homePage.inputStoreSearchBox();
//    }
    @Test
    public void linkCreditServices() throws InterruptedException {
        homePage.linkCreditServices();
    }
    @Test
    public void clickOnGiftCards() throws InterruptedException {
        homePage.clickOnGiftCards();
    }
    @Test
    public void ClickOnheaderSearch() throws InterruptedException {
        homePage.ClickOnheaderSearch();

    }
    @Test
    public void clickOnHardware() throws InterruptedException {
        homePage.clickOnHardWare();
    }
//    @Test
//    public void searchOnDoorHardware() throws InterruptedException {
//        homePage.searchOnDoorHardware();
//    }
//    @Test
//    public void clickOnCasters() throws InterruptedException {
//        homePage.clickOnCasters();
//    }
//    @Test
//    public void linkMemorialDay() throws InterruptedException {
//        homePage.linkMemorialDay();
//    }
    @Test
    public void clickOnLocalAd() throws InterruptedException {
        homePage.clickOnLocalAd();
    }
//    @Test
//    public void clickOnBath() throws InterruptedException {
//        homePage.clickOnBath();
//    }
    @Test
    public void clickOnElectrical() throws InterruptedException {
        homePage.clickOnElectrical();
    }
    @Test
    public void clickOnOutdoorLiving() throws InterruptedException {
        homePage.clickOnOutDoorLiving();
    }
    @Test
    public void clickOnPlumbing() throws InterruptedException {
        homePage.clickOnPlumbing();

    }
    @Test
    public void clickOnTools() throws InterruptedException {
        homePage.clickOnTools();
    }
    @Test
    public void clickBuildingMaterials() throws InterruptedException {
        homePage.clickOnBuildingMaterials();
    }
    @Test
    public void searchOnAppliance() throws InterruptedException {
        homePage.searchOnAppliances();

    }

    @Test
    public void CheckOrderStatus() throws InterruptedException {
        homePage.CheckOrderStatus();

    }

    @Test
    public void CheckYourCreditCard() throws InterruptedException {
        homePage.CheckYourCreditCard();

    }

    @Test
    public void OrderCancellation() throws InterruptedException {
        homePage.OrderCancellation();

    }

    @Test
    public void ProductRecalls() throws InterruptedException {
        homePage.ProductRecalls();

    }
    @Test
    public void RealEstateFloorPlanServices() throws InterruptedException {
        homePage.RealEstateFloorPlanServices();

    }
    @Test
    public void ProtectionPlans() throws InterruptedException {
        homePage.ProtectionPlans();

    }
    @Test
    public void RebateCenter() throws InterruptedException {
        homePage.RebateCenter();
    }
    @Test
    public void CorporateInformation() throws InterruptedException {
        homePage.CorporateInformation();
    }
    @Test
    public void DigitalNewsroom() throws InterruptedException {
        homePage.DigitalNewsroom();
    }
    @Test
    public void HomeDepotFoundation() throws InterruptedException {
        homePage.HomeDepotFoundation();
    }
    @Test
    public void InvestorRelations() throws InterruptedException {
        homePage.InvestorRelations();
    }
    @Test
    public void GovernmentCustomers() throws InterruptedException {
        homePage.GovernmentCustomers();
    }
    @Test
    public void AffiliateProgram() throws InterruptedException {
        homePage.AffiliateProgram();
    }
    @Test
    public void CorporateResponsibility() throws InterruptedException {
        homePage.CorporateResponsibility();
    }

}
