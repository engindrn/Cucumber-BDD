package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDefinition {

    PracticeAmazonPage practiceAmazonPage=new PracticeAmazonPage();

    //Faker faker=new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
    practiceAmazonPage.singIn.click();
    }

    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
       // practiceAmazonPage.email.sendKeys(faker.internet().emailAddress());
        practiceAmazonPage.email.sendKeys(Faker.instance().internet().emailAddress()); //kısa yol obje
    }                                                                      //oluşturmadan method içinde istance
                                                                     //olarak yazdık
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
    ReusableMethods.getScreenshotWebElement("FakeEmail",practiceAmazonPage.email);
    }

    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
    practiceAmazonPage.devamEt.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
    String expextedText="There was a problem";
    String actualText= practiceAmazonPage.thereWasProblem.getText();
        Assert.assertEquals("esit degil",expextedText,actualText);
    }

    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
    practiceAmazonPage.needHelp.click();
    }

    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
    practiceAmazonPage.forgotYourPassword.click();
    }

    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
    Assert.assertTrue(practiceAmazonPage.passwordAssistance.isDisplayed());
    /*metni stringe atip gettex deyip contains de yapabiliriz*/
    }

    @Then("Geri gider")
    public void geri_gider() {
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().back();
    }

    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
    practiceAmazonPage.createYourAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
    Assert.assertTrue(practiceAmazonPage.createAccountText.getText().contains("Create account"));
    }

    @Then("websayfasini kapatir")
    public void websayfasini_kapatir() {
    Driver.closeDriver();
    }
}
