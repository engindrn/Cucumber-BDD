package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.DataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataTablesStepDefinition {

    DataTablesPage dataTablesPage= new DataTablesPage();


    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String gidilenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilenUrl));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.next.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String name) {
        dataTablesPage.firstName.sendKeys(name);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String soyisim) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(soyisim).perform();
    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofisBilgisi) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(ofisBilgisi).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startdate bolumune{string}  girer")
    public void startdateBolumuneGirer(String startDate) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.click.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {

        Assert.assertTrue(dataTablesPage.isimVar.getText().contains(isim));
      /*aradığımız isim en üsste geleceği için ilk sırada isim bölümünü locate ettik geleni getText ile aldık
      ve bizdeki featureddki isimle karşılaştırddık */
    }


}




//package stepDefinitions;
//
//        import io.cucumber.java.en.And;
//        import io.cucumber.java.en.Then;
//        import io.cucumber.java.en.When;
//        import org.junit.Assert;
//        import org.openqa.selenium.Keys;
//        import org.openqa.selenium.interactions.Actions;
//        import pages.DatabasePage;
//        import utilities.ConfigReader;
//        import utilities.Driver;
//
//public class DatabaseOutline {
//    DatabasePage data = new DatabasePage();
//    Actions actions = new Actions(Driver.getDriver());
//
//    @When("kullanici {string} adresine gider")
//    public void kullaniciAdresineGider(String istenenUrl) {
//        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
//    }
//
//    @Then("new butonuna basar")
//    public void newButonunaBasar() {
//        data.newButton.click();
//    }
//
//    @And("isim bolumune {string} girer")
//    public void isimBolumuneGirer(String firstname) {
//        data.firstname.sendKeys(firstname);
//    }
//
//    @And("soyisim bolumune {string} girer")
//    public void soyisimBolumuneGirer(String lastname) {
//        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
//    }
//
//    @And("position bolumune{string} girer")
//    public void positionBolumuneGirer(String position) {
//        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
//    }
//
//    @And("ofis bolumune {string} girer")
//    public void ofisBolumuneGirer(String ofis) {
//        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
//    }
//
//    @And("extension bolumune {string} girer")
//    public void extensionBolumuneGirer(String extension) {
//        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
//    }
//
//    @And("startdate bolumune{string}  girer")
//    public void startdateBolumuneGirer(String startDate) {
//        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
//    }
//
//    @And("salary bolumune {string} girer")
//    public void salaryBolumuneGirer(String salary) {
//        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
//    }
//
//    @And("Create tusuna basar")
//    public void createTusunaBasar() {
//        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
//    }
//
//    @When("kullanici {string} ile arama yapar")
//    public void kullaniciIleAramaYapar(String firstname) {
//        data.search.sendKeys(firstname);
//    }
//
//    @Then("isim bolumunde {string} oldugunu dogrular")
//    public void isimBolumundeOldugunuDogrular(String isim) {
//        Assert.assertTrue(data.isimVar.getText().contains(isim));
//    }
//
//
//}