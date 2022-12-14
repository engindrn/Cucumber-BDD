package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentaCarPage {

   public BlueRentaCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "(//*[@role='button'])[1]")
    public WebElement loginButton;

   @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement userEmail;

   @FindBy (css = "#formBasicPassword")
   public WebElement password;

   @FindBy(xpath = "//*[@class='btn btn-primary']")
   public WebElement login;

   @FindBy (xpath = "//*[text()='invalid credentials']")
   public WebElement bsarisizLoginKontro;

    @FindBy(id="dropdown-basic-button")
    public WebElement basariliGiris;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;


}
