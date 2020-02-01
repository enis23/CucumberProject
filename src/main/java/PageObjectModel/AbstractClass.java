package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public abstract class AbstractClass {

/*

abstract class create

pass the parameters

use it in the step definitions

configuration reader
 */

/*

abstract class create

   clickFunction
        click on element

 */


private WebDriver driver = Driver.getDriver();

WebDriverWait wait =new WebDriverWait( driver,20 );

public void clickFunction(WebElement clickElement){

    wait.until( ExpectedConditions.elementToBeClickable(clickElement) );
    clickElement.click();

}

public void sendkeysFunction(WebElement sendkeysElement , String value){

    wait.until( ExpectedConditions.visibilityOf( sendkeysElement ) );
    sendkeysElement.sendKeys( value );

}

    public void verifyCreated(List<WebElement> tableList, String value ){

    boolean result = false;

    for(int i = 0; i<tableList.size() ; i++){
        if(tableList.get( i ).getText().equalsIgnoreCase( value )){
            result = true;
        }
    }

    if(result==false){
        Assert.fail(  );
    }else{
        System.out.println(value + " is displayed");
    }

    }

    public void waitUntilVisibility(WebElement waitElement){
        wait.until( ExpectedConditions.visibilityOf( waitElement ) );
    }

}
