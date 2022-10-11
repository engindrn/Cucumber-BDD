package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleTrendyolMorhipoPage {

    public GoogleTrendyolMorhipoPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement googleSearch;

    @FindBy(xpath = "//*[text()='Tümünü kabul et']")
    public WebElement cookies;

    @FindBy(xpath = "//*[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")
    public WebElement trendyolLink;

    @FindBy (xpath = "//*[text()='Akzeptieren']")
    public WebElement akzeptieren;

    @FindBy (className = "country-wrapper")
    public WebElement trendyolCountrActive;

    @FindBy (xpath = "//ul[@class='dropdown']")
    public  WebElement dropDown;




    @FindBy(xpath = "//h3[text()='Morhipo']")
    public WebElement morhipoLink;



    @FindBy(xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoSearch;

    @FindBy(id = "total-product-count")
    public WebElement morhipoAramaSonucu;



    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolSearchBox;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement aramaSonucu;




}
