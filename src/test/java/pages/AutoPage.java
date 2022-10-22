package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.security.auth.x500.X500Principal;
import java.util.List;

public class AutoPage {

    public  AutoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@class='login']")
    public WebElement login;

    @FindBy (xpath = "//*[@id='email_create']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='SubmitCreate']")
    public WebElement createAccount;

    @FindBy (xpath = "//*[@id='uniform-id_gender1']")
    public WebElement radioButton;

    @FindBy(xpath = "(//select)[1]")  //dropdown ı aldık tek bir webelemete atadık optionlar içerisinde
    public WebElement gunler;

    @FindBy(xpath = "(//select)[2]")
    public WebElement aylar;

    @FindBy(xpath = "(//select)[3]")
    public WebElement yillar;

    @FindBy (xpath = "//*[text()='Register']")
    public WebElement register;


    @FindBy (xpath = "(//*[text()='My account'])[1]")
    public WebElement myAccountText;

}
