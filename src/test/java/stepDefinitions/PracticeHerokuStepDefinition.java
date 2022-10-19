package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeHerokuPage;
import utilities.Driver;

import java.util.List;

public class PracticeHerokuStepDefinition {

    PracticeHerokuPage practiceHerokuPage =new PracticeHerokuPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32toplam;
    int clickTextToplam;
    int sonuc;


    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int int1) {
        for (int i = 0; i < int1; i++) {
            practiceHerokuPage.clickButton.click();
        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int int1) {
        //  practiceTestPage.clickButton.sendKeys(Keys.SPACE);
        for (int i = 0; i < int1; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        List<WebElement> down32 = practiceHerokuPage.down32; //pageobje üzerinden cektim ve listime attım buradaki iki basamakli sayilari toplamamlazım, suan burada 50 tane down32 var
        for (WebElement w : down32) {                         //down32dekileri w ye alıyorum
            w.getText().replaceAll("^[0-9]", ""); //her bir webelementindeki down32 yi sırayla cektim ve w nin icine koyuorum, getText ile down32 olarak alıyorum sadece 32 yi almak icin
                                                                  // regex yani replaceAll ile rakam olmayanları at diyorum (\\D) kullanarakta yapabilirdim.
        }
        System.out.println("down32 toplamı  :"+down32toplam);
    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
        List<WebElement> clickText = practiceHerokuPage.clickText;

        for (WebElement w : clickText) {
            clickTextToplam += w.getText().length();
        }
        sonuc = down32toplam - clickTextToplam;
        System.out.println("sonuc = " + sonuc);

    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("sonuc esit degil",result,sonuc);
    }
}
