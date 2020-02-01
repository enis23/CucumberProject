package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class applicationPage extends AbstractClass{

    private WebDriver driver ;

    public applicationPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css = "svg[data-icon='plus']" )
    private WebElement plusButton;

    @FindBy(css="mat-dialog-actions svg[data-icon='save']")
    private WebElement saveButton;

    public void clickPlusButton(){
        clickFunction( plusButton );
    }

    public void clickSaveButton(){
        clickFunction( saveButton );
    }

}
