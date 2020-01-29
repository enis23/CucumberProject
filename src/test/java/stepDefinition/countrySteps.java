package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class countrySteps {

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver(  );

        driver.get( "https://test-basqar.mersys.io" );
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

    }





}
