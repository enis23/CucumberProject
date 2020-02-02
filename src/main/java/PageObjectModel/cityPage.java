package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class cityPage {

    private WebDriver driver ;

    public cityPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }



    
}
