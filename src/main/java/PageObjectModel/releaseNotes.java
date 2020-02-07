package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.readExcel;

public class releaseNotes extends AbstractClass{

    private WebDriver driver ;

    public releaseNotes(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath = "//ms-release-notes //ul//li[text()=' School settings - Ability to configure parameters of Countries, Cities, Citizenship... ']")
    private WebElement systemOne;

    @FindBy(xpath = "//ms-release-notes //ul//li[text()=' Sms and E-mail Notifications - Sms and E-mail Notifications for students and their parents ']")
    private WebElement systemTwo;

    @FindBy(xpath = "//ms-release-notes //ul//li[text()=' Student Info - Ability to store information about students, their parents, their documents, etc. ']")
    private WebElement studentOne;

    @FindBy(xpath = "//ms-release-notes //ul//li[text()=' Student Fees and Payments - Ability to track student fees and payments ']")
    private WebElement studentTwo;

    String systemOneExcel = readExcel.getData( "releaseNotes" ,"ReleaseNotes" , "SYSTEM" , 1 );
    String systemTwoExcel = readExcel.getData( "releaseNotes" ,"ReleaseNotes" , "SYSTEM" , 2 );
    String StudentOneExcel = readExcel.getData( "releaseNotes" ,"ReleaseNotes" , "STUDENT" , 1 );
    String StudentTwoExcel = readExcel.getData( "releaseNotes" ,"ReleaseNotes" , "STUDENT" , 2 );

    public void systemOneVerification(){
        System.out.println(systemOne.getText());
        System.out.println(systemOneExcel);
        Assert.assertEquals( systemOne.getText(), systemOneExcel );
    }

    public void systemTwoVerification(){
        System.out.println(systemTwo.getText());
        System.out.println(systemTwoExcel);
        Assert.assertEquals( systemTwo.getText(), systemTwoExcel );
    }

    public void studentOneVerification(){
        System.out.println(studentOne.getText());
        System.out.println(StudentOneExcel);
        Assert.assertEquals( studentOne.getText(), StudentOneExcel );
    }

    public void studentTwoVerification(){
        System.out.println(studentTwo.getText());
        System.out.println(StudentTwoExcel);
        Assert.assertEquals( studentTwo.getText(), StudentTwoExcel );
    }
}
