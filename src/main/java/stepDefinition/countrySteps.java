package stepDefinition;

import PageObjectModel.signInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;


public class countrySteps {

    WebDriver driver;
    signInPage sip = new signInPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
//        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get( "https://test-basqar.mersys.io" );
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

        sip.signInMethod();
    }





}
