package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {

    leftNav lv = new leftNav();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lv.clickbuttonCitizenship();
    }

    @Given("^Type the citizenship name \"(.*?)\"$")
    public void type_the_citizenship_name(String arg1) throws Throwable {

    }

    @Given("^Type the shortName \"(.*?)\"$")
    public void type_the_shortName(String arg1) throws Throwable {

    }

}
