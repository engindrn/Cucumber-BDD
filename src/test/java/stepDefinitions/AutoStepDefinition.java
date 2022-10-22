package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AutoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class AutoStepDefinition {

    AutoPage autoPage=new AutoPage();

    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
        autoPage.login.click();
    }

    @And("kullanici Create and account bolumune {string} adresi girer")
    public void kullaniciCreateAndAccountBolumuneAdresiGirer(String email) {

        email= Faker.instance().internet().emailAddress();      //bu faker obje oluşturmadan da çalışır
        autoPage.email.sendKeys(email);

    }

    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        autoPage.createAccount.click();
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
            autoPage.radioButton.click();
        ReusableMethods.Actions().
                    sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().name().firstName()).
                    sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().name().lastName()).
                    sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().internet().password()).
                    perform();

        Select select=new Select(autoPage.gunler);
        Random random=new Random();
        int rastgele =random.nextInt(select.getOptions().size());
        select.selectByIndex(rastgele);

        Select options=new Select(autoPage.aylar);
        int secme =random.nextInt(options.getOptions().size());
        options.selectByIndex(secme);

        Select options1=new Select(autoPage.yillar);
        int secme1= random.nextInt(options1.getOptions().size());
        options1.selectByIndex(secme1);

        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).    //space ile buttona tıkladık
               sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().name().firstName()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().name().lastName()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().company().name()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().address().buildingNumber()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().address().city()).
                sendKeys(Keys.TAB).sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("11255").
                sendKeys(Keys.TAB).sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.Faker().phoneNumber().cellPhone()).
                perform();
    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
    autoPage.register.click();
    }

    @Then("kullanicinin hesap olusturuldugunu dogrulayin")
    public void kullanicininHesapOlusturuldugunuDogrulayin() {
        String expectecResult ="My account";
        String actualResult= autoPage.myAccountText.getText();

        Assert.assertEquals(expectecResult,actualResult);
    }


}



/*package stepDefinitions;
        import com.github.javafaker.Faker;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Then;
        import org.junit.Assert;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.interactions.Actions;
        import pages.AutoPage;
        import utilities.Driver;

public class AutoStepDefinition {

    AutoPage auto = new AutoPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
        auto.login.click();
    }
    @And("kullanici Create and account bolumune email adresi girer")
    public void kullaniciCreateAndAccountBolumuneEmailAdresiGirer() {
        auto.createEmail.sendKeys(faker.internet().emailAddress());
    }
    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
        auto.radioButton.click();
        action.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys("1").
                sendKeys(Keys.TAB).sendKeys("June").sendKeys(Keys.TAB).sendKeys("1982").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("kansa").sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).
                sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).perform();
    }
    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }
    @Then("kullanicinin hesap olusturuldugunu dogrulayin")
    public void kullanicininHesapOlusturuldugunuDogrulayin() {
        Assert.assertTrue(auto.myAccountText.isDisplayed());
    }
}*/