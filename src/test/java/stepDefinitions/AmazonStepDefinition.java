package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinition {

    AmazonPage amazonPage= new AmazonPage();      //bütün methotlardan ulaşabilmek için class levelde objeminizi oluşturduk

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
    }

    @And("Sonuclarin nutalla icerdigini test eder")
    public void sonuclarinNutallaIcerdiginiTestEder() {
        String expectedResault= "Nutella";
       String actualResault= amazonPage.aramaSonucWE.getText();
       Assert.assertTrue(actualResault.contains(expectedResault));
    }

    @And("Sayfayi kapatir")                        //kod burda ama featuresde en son seneryoda kullanırsak bütün
    public void sayfayiKapatir() {            //testleri tek browserda yapar. senaryo sonlarına eklersek herdefa
        Driver.closeDriver();                //kapatır yenisini açar
    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String expectedResault= "Selenium";
        String actualResault= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualResault.contains(expectedResault));
    }


    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expectedResault= "iphone";
        String actualResault= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualResault.contains(expectedResault));
    }

    @Then("Kullanici {string} aratir")                                        //US004
    public void kullaniciAratir(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")                          //US004
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {

        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("Kullanici {string} sayfasina gider")                              //US005
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("url'nin {string} icerdigini test edelim")                           //US005
    public void urlNinIcerdiginiTestEdelim(String arananKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi){                 //US005
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
