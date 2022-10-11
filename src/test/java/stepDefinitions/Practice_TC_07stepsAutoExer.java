package stepDefinitions;

import io.cucumber.java.en.*;               //bir methodu imprt edip adını * ile değiştirince hepsi import oldu
import org.junit.Assert;                  //feature de çalıştırıp hata alıp methodları buraya yapıştırdık
import pages.Practice_TC07_AutoExerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class Practice_TC_07stepsAutoExer {

    Practice_TC07_AutoExerPage practice_tc07_autoExerPage=new Practice_TC07_AutoExerPage();


    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyi_baslatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
     String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        practice_tc07_autoExerPage.testCaseLink.click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
    //      String testCaseUrl="https://automationexercise.com/test_cases";
    //    Assert.assertEquals(testCaseUrl,Driver.getDriver().getCurrentUrl());

        Assert.assertTrue(practice_tc07_autoExerPage.testCaseTitle.isDisplayed());

    }

    @Then("Ilgili sayfanin ekran goruntusunu alin")
    public void ilgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
