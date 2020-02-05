package stepDefinition;

import cucumber.api.java.After;
import utilities.Driver;

public class hooks {

    /*
        Before and after class methods will be in this class
     */

    @After
    public void afterClass(){
        Driver.closeDriver();
    }

}
