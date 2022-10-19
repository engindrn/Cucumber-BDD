package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.devtools.v95.input.model.DragDataItem;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarScenarioOutStepDef {

    BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Login yazisina tiklar.")
    public void loginYazisinaTiklar() {
        blueRentaCarPage.loginButton.click();
    }

    @And("{string} username girer")
    public void usernameGirer(String usernames) {
        blueRentaCarPage.userEmail.sendKeys(usernames);
    }

    @And("{string} password girer")
    public void passwordGirer(String password) {
        blueRentaCarPage.password.sendKeys(password);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        blueRentaCarPage.login.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentaCarPage.ikinciLogin.isDisplayed());
    }
}
