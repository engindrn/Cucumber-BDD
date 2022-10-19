package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DeomqaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemoqaStepDefinition {

    DeomqaPage demoqa=new DeomqaPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() throws InterruptedException {
        ReusableMethods.Actions().sendKeys(Keys.PAGE_DOWN).perform();
        demoqa.alert.click();
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demoqa.click.click();
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent()); //alert görünür olana kadar bekler
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertYazisi = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedAlertYazisi,alertYazisi);

    }
    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }






    @Then("kullanici Will enable bes seconds butonunun enable olmasini bekler")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.elementToBeClickable(demoqa.enable));
    }
    @And("kullanici Will enable bes seconds butonunun enable oldugunu test eder")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demoqa.enable.isEnabled());
    }






    @When("kullanici Visible After bes seconds butonunun gorunur olamsini bekler")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOlamsiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.visible));
    }
    @And("kullanici Visible After bes seconds butonunun gorunur oldugunu test eder")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(demoqa.visible.isDisplayed());
    }
}
