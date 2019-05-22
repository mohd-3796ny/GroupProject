package RegressionMainTest;

import RegressionMain.Homepage;

public class HomepageTest extends Homepage {


    public void loginWithValidPass(){
        clickAccount();
        writeUsername("user");
        writePass("");
    }


    public void loginWithInvalidPass(){
        clickAccount();
        writeUsername("user");
        writePass("");
    }

}
