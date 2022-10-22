package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeMedunnaPage {

    public PracticeMedunnaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement singinSymbol;

    @FindBy (xpath = "//*[.='Sign in']")
    public WebElement singinbutton;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "(//*[.='Sign in'])[4]")
    public WebElement singinWithCredentials;   //kimlik bilgileri ile demek

    @FindBy (xpath = "//*[contains(text(), 'Authentication information not correct.')]") //açılıp kapanan
    public WebElement popUpMessage;                                 //webelementi locate içiinde kullanılır
}
