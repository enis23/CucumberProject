package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class cityPage {

    private WebDriver driver ;

    public cityPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath="//mat-dialog-container//mat-select//span")
    private WebElement frameDropdown;




}
