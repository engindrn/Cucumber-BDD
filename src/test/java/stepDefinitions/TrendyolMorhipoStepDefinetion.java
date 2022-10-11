package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GoogleTrendyolMorhipoPage;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TrendyolMorhipoStepDefinetion {

    int mhSadeceSonucYazisi;
    int tysadeceSonucYazisi;

    GoogleTrendyolMorhipoPage googleTrendyolMorhipoPagePage = new GoogleTrendyolMorhipoPage();
    Actions actions=new Actions(Driver.getDriver());
   
    String trendyolWindowHandle;
    String morhipoWindowHandle;

    @Given("kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        googleTrendyolMorhipoPagePage.cookies.click();

    }

    @Then("kullanici google da Trendyol u aratir")
    public void kullaniciGoogleDaTrendyolUAratir() {
        googleTrendyolMorhipoPagePage.googleSearch.sendKeys("trendyol", Keys.ENTER);
    }

    @Then("kullanici Trendyol a girer")
    public void kullaniciTrendyolAGirer() throws InterruptedException {
        googleTrendyolMorhipoPagePage.trendyolLink.click();
        trendyolWindowHandle = Driver.getDriver().getWindowHandle();
            Thread.sleep(3000);
        googleTrendyolMorhipoPagePage.akzeptieren.click();
       googleTrendyolMorhipoPagePage.trendyolCountrActive.click();
       Driver.getDriver().findElement(By.xpath("//*[text()='Germany']")).click();
        Thread.sleep(3000);
      //  Select options=new Select(googleTrendyolMorhipoPagePage.dropDown);
        //options.selectByVisibleText("Turkey");
       //  googleTrendyolMorhipoPagePage.dropDown.sendKeys("Turkey");
     //  List<WebElement> ddmList= options.getOptions();
      //  System.out.println(ddmList);

      Driver.getDriver().findElement(By.xpath("//*[text()='Turkey']")).click();
       Driver.getDriver().findElement(By.xpath("//*[text()='LAND AUSWÄHLEN']")).click();
    }

    @Then("kullanici Trendyol da makas aratir")
    public void kullaniciTrendyolDaMakasAratir() throws InterruptedException {
        googleTrendyolMorhipoPagePage.trendyolSearchBox.sendKeys("makas", Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("kullanici toplam Trendyol daki makas sayisini alir")
    public void kullaniciToplamTrendyolDakiMakasSayisiniAlir() {
        String[] trendyolMakasSonucu = googleTrendyolMorhipoPagePage.aramaSonucu.getText().split(" ");
        tysadeceSonucYazisi = Integer.parseInt(trendyolMakasSonucu[3]);
        System.out.println(tysadeceSonucYazisi);
    }

    @Then("kullanici yeni sekme acar")
    public void kullaniciYeniSekmeAcar() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);

    }

    @Then("kullanici google da Morhipo u aratir")
    public void kullaniciGoogleDaMorhipoUAratir() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        googleTrendyolMorhipoPagePage.googleSearch.sendKeys("morhipo", Keys.ENTER);

    }

    @And("kullanici Morhipo ya girer")
    public void kullaniciMorhipoYaGirer() {
        googleTrendyolMorhipoPagePage.morhipoLink.click();
        morhipoWindowHandle = Driver.getDriver().getWindowHandle();

    }

    @And("kullanici Morhipo da makas aratir")
    public void kullaniciMorhipoDaMakasAratir() throws InterruptedException {
        googleTrendyolMorhipoPagePage.morhipoSearch.sendKeys("makas", Keys.ENTER);
        Thread.sleep(2000);
    }

    @And("kullanici toplam Morhipo daki makas sayisini alir")
    public void kullaniciToplamMorhipoDakiMakasSayisiniAlir() {
        String[] morhipoMakasSonuc = googleTrendyolMorhipoPagePage.morhipoAramaSonucu.getText().split(" ");
        mhSadeceSonucYazisi = Integer.parseInt(morhipoMakasSonuc[0]);
        System.out.println(mhSadeceSonucYazisi);
    }

    @And("kullanici makas sayisi fazla olan sayfayi kapatir")
    public void kullaniciMakasSayisiFazlaOlanSayfayiKapatir() throws InterruptedException {
        if (tysadeceSonucYazisi>mhSadeceSonucYazisi){
            Driver.getDriver().switchTo().window(trendyolWindowHandle);
            Thread.sleep(2000);
            Driver.getDriver().close();

        }else {
            Driver.getDriver().close();

        }

    }

    @And("kullanici makas sayisi az olan sayfayi kapatir")
    public void kullaniciMakasSayisiAzOlanSayfayiKapatir() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().quit();
    }
}






/*Trendyol/Morhipo Makas seach  String Manipulasyonlar ile çözümü*/
//package stepDefinetions;
//
//        import io.cucumber.java.en.And;
//        import io.cucumber.java.en.Given;
//        import io.cucumber.java.en.Then;
//        import org.openqa.selenium.Keys;
//        import org.openqa.selenium.WindowType;
//        import pages.GooglePage;
//        import pages.MorhipoPage;
//        import pages.TrenyolPage;
//        import utilities.ConfigReader;
//        import utilities.Driver;
//
//public class MakasSearchStepDefination {
//
//    GooglePage googlePage=new GooglePage();
//    TrenyolPage trenyolPage=new TrenyolPage();
//    MorhipoPage morhipoPage=new MorhipoPage();
//
//    int trenyolMakasSonucu;
//    int morhipoMakasSonucu;
//    String trendyolHandle;
//    String morhipoHandle;
//    @Given("Google'a gidildi")
//    public void googleAGidildi() {
//        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
//    }
//
//    @Then("Trendyol aratildi")
//    public void trendyolAratildi() {
//        googlePage.searchBox.sendKeys("Trendyol", Keys.ENTER);
//    }
//
//    @Then("Trendyol linki bulunup tiklandi")
//    public void trendyolLinkiBulunupTiklandi() {
//        googlePage.trendyolLinki.click();
//        trendyolHandle=Driver.getDriver().getWindowHandle();
//    }
//
//    @Then("Makas aratildi")
//    public void makasAratildi() {
//        trenyolPage.trendyolsearchbox.sendKeys("Makas",Keys.ENTER);
//
//    }
//    @Then("Toplam urun sayisi alindi")
//    public void toplamUrunSayisiAlindi() {
//        String temp;
//        temp=(trenyolPage.trendyolMakasSonucu.getText().replaceAll("\\D",""));
//        trenyolMakasSonucu=Integer.parseInt(temp);
//    }
//    @Then("Yeni sekmede morhipo'ya gidildi")
//    public void yeniSekmedeMorhipoYaGidildi() {
//        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
//        Driver.getDriver().get(ConfigReader.getProperty("morhipoUrl"));
//        morhipoHandle=Driver.getDriver().getWindowHandle();
//    }
//    @Then("Morhipo'da makas aratildi")
//    public void morhipoDaMakasAratildi() {
//        morhipoPage.morhipoSearchBox.sendKeys("Makas",Keys.ENTER);
//    }
//    @Then("Toplam urun sayisini alindi")
//    public void toplamUrunSayisiniAlindi() {
//        morhipoMakasSonucu=Integer.parseInt(morhipoPage.morhipoMakasSonucu.getText());
//    }
//    @Then("Iki sitedeki toplam makas sayisi karsilastirildi")
//    public void ıkiSitedekiToplamMakasSayisiKarsilastirildi() {
//    }
//    @Then("Urun sayisi fazla olan site kapatildi")
//    public void urunSayisiFazlaOlanSiteKapatildi() {
//        if (trenyolMakasSonucu>morhipoMakasSonucu){
//            Driver.getDriver().switchTo().window(trendyolHandle).close();
//        }
//        else Driver.getDriver().switchTo().window(morhipoHandle).close();
//    }
//    @And("Acik kalan diger sayfada kapatildi")
//    public void acikKalanDigerSayfadaKapatildi() {
//        Driver.quitDriver();
//    }
//}