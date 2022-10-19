package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeomqaPage {

    public DeomqaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy (xpath = "(//*[@class='btn btn-light '])[11]")
   public WebElement alert;

    @FindBy (xpath = "(//*[text()='Click me'])[2]")
    public WebElement click;




    @FindBy (xpath = "//*[@id='enableAfter']")
    public WebElement enable;




    @FindBy (xpath = "//*[@id='visibleAfter']")
    public WebElement visible;


}
