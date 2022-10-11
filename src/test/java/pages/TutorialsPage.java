package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsPage {

    public TutorialsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonePdaClick;

    @FindBy (xpath = "//h4")
    public List<WebElement> telefonMarkalari;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    public List<WebElement> sepeteEkle;

    @FindBy (xpath = "//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepetButton;

    @FindBy (xpath = "//body//tr//td[@class='text-left']")
    public List<WebElement> sepettekiTelMarkalari;
}
//body//tr//td[@class='text-left']