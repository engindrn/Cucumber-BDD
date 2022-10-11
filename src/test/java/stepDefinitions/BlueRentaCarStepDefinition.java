package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinition {

    BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("bluerentUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentaCarPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentaCarPage.userEmail.sendKeys(ConfigReader.getProperty("blueemailF"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentaCarPage.password.sendKeys(ConfigReader.getProperty("bluepasswordF"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentaCarPage.login.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(blueRentaCarPage.bsarisizLoginKontro.isDisplayed());

    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
