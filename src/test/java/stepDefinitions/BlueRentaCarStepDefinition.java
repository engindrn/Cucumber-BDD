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
      //  Thread.sleep(3000);
        Assert.assertTrue(blueRentaCarPage.bsarisizLoginKontro.isDisplayed());

     /* Login dediğimiz halde;  daha önce aldığımız iki locate hala görünüyor ise demek ki ilerleyemedik.
     Assert.assertTrue(blueRentaCarPage.userEmail.isDisplayed() && blueRentaCarPage.password.isDisplayed());*/

    }

    @And("kulllanici sayfayi kapatir")         //burdan bu methodu silersek daha önce bu packagede olduğu için
    public void kulllaniciSayfayiKapatir() {  //ordan kullanır ve sayfayi kapatır.
        Driver.closeDriver();
    }
}






//package stepDefinitions;
//        import io.cucumber.java.en.And;
//        import io.cucumber.java.en.Given;
//        import io.cucumber.java.en.Then;
//        import org.junit.Assert;
//        import org.openqa.selenium.Keys;
//        import org.openqa.selenium.interactions.Actions;
//        import pages.BrcPage;
//        import utilities.ConfigReader;
//        import utilities.Driver;
//public class BlueRentACarStepDefinition {
//    BrcPage brc = new BrcPage();
//    Actions actions = new Actions(Driver.getDriver());
//    @Given("kullanici {string} ana sayfasinda")
//    public void kullaniciAnaSayfasinda(String istenenUrl) {
//        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
//    }
//    @Then("Login yazisina tiklar")
//    public void loginYazisinaTiklar() {
//        brc.login.click();
//    }
//    @And("gecersiz username girer")
//    public void gecersizUsernameGirer() {
//        brc.email.sendKeys("gecersiz@gmail.com");
//    }
//    @And("gecersiz password girer")
//    public void gecersizPasswordGirer() {
//        actions.sendKeys(Keys.TAB).sendKeys("12345").perform();
//    }
//    @And("Login butonuna basar")
//    public void loginButonunaBasar() {
//        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
//    }
//    @Then("sayfaya giris yapilamadigini kontrol eder")
//    public void sayfayaGirisYapilamadiginiKontrolEder() {
//        Assert.assertTrue(brc.ikinciLogin.isDisplayed());
//    }
//}
