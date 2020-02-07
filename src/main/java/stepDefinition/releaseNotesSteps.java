package stepDefinition;

import PageObjectModel.leftNav;
import PageObjectModel.releaseNotes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class releaseNotesSteps {

    leftNav lv = new leftNav();
    releaseNotes rn = new releaseNotes();

    @Given("^Click on release notes$")
    public void click_on_release_notes() throws Throwable {
        lv.clickonreleaseNotes();
    }

    @Then("^Verify first system text is displayed$")
    public void verify_first_system_text_is_displayed() throws Throwable {
        rn.systemOneVerification();
    }

    @Then("^Verify Second system text is displayed$")
    public void verify_Second_system_text_is_displayed() throws Throwable {
        rn.systemTwoVerification();
    }

    @Then("^Verify first Student text is displayed$")
    public void verify_first_Student_text_is_displayed() throws Throwable {
        rn.studentOneVerification();
    }

    @Then("^Verify Second Student text is displayed$")
    public void verify_Second_Student_text_is_displayed() throws Throwable {
        rn.studentTwoVerification();
    }
}
