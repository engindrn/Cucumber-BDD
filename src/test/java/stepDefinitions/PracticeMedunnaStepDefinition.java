package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeMedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeMedunnaStepDefinition {

    PracticeMedunnaPage medunnaPage=new PracticeMedunnaPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForClickablility(medunnaPage.singinSymbol,5);
        medunnaPage.singinSymbol.click();
        medunnaPage.singinbutton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
                                     //feature da bir isim girmedik o yuzden parametre buraya username olr geldi
        username= Faker.instance().name().username();   //böylece araya girip fakerdan username aldık.
        medunnaPage.username.sendKeys(username);       //burdada onu gönderdik/
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {

        password=Faker.instance().internet().password();
        medunnaPage.password.sendKeys(password);
    }

    @And("signine tiklar")
    public void signineTiklar() {
        medunnaPage.singinWithCredentials.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(medunnaPage.popUpMessage));
        Assert.assertTrue(medunnaPage.popUpMessage.isDisplayed());
    }
}
