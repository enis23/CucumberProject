package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class countryPage extends AbstractClass {

    private WebDriver driver ;

    public countryPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css = "svg[data-icon='plus']" )
    private WebElement plusButton;

    public void clickPlusButton(){
        clickFunction( plusButton );
    }

}
