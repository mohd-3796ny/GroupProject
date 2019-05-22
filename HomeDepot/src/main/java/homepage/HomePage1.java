package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends CommonAPI {



    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[1]/a")
    public static WebElement click;


    public void setClick(){
        click.click();


    }





}
