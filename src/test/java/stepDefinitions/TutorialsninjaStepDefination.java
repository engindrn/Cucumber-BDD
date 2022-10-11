package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TutorialsninjaStepDefination {

    List<String> listTelMarkalari = new ArrayList<>();
    List<String> listSepettekiTelMarlkalari = new ArrayList<>();

    TutorialsPage tutorialsPage=new TutorialsPage();

    @Given("kullanici tutorialsninja sayfasina gider")
    public void kullaniciTutorialsninjaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialUrl"));

    }

    @Then("Phones & PDAs'a tiklar")
    public void phonesPDAsATiklar() {
        tutorialsPage.phonePdaClick.click();
    }

    @And("telefon markalarini alir")
    public void telefonMarkalariniAlir() {
        for (WebElement w : tutorialsPage.telefonMarkalari) {
             listTelMarkalari.add(w.getText());

        }
        for (String s:listTelMarkalari) {
            System.out.println("telefon markalari :"+s);
        }
    }

    @And("Tum ogeleri sepete ekler")
    public void tumOgeleriSepeteEkler() {
        List<WebElement> addSepet= tutorialsPage.sepeteEkle;
        for (WebElement w:addSepet) {
            w.click();
        }
    }

    @And("sepete tiklar")
    public void sepeteTiklar() {
        tutorialsPage.sepetButton.click();
    }

    @And("sepetteki urun isimlerini alir")
    public void sepettekiUrunIsimleriniAlir() throws InterruptedException {
        Thread.sleep(3000);
        for (WebElement w : tutorialsPage.sepettekiTelMarkalari) {
            listSepettekiTelMarlkalari.add(w.getText());

        }
        for (String s:listSepettekiTelMarlkalari) {
            System.out.println("sepetteki telefon markalari :"+s);
        }
    }

    @And("sepetteki ve sayfadaki ürünlerin dogru oldugunu karsilastirir")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() {
        Collections.sort(listSepettekiTelMarlkalari);
        System.out.println("x :"+listSepettekiTelMarlkalari);
       Collections.sort(listTelMarkalari);
        System.out.println("y :"+listTelMarkalari);
      Assert.assertEquals(listSepettekiTelMarlkalari, listTelMarkalari);
    }
}




//package stepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.WebElement;
//import pages.TutorialsninjaPage;
//import utilities.ConfigReader;
//import utilities.Driver;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class TutorialsninjaStepDefinition {
//
//    TutorialsninjaPage tutorialsninjaPage = new TutorialsninjaPage();
//
//    List<String> listTelMarkalari = new ArrayList<>();
//    List<String> listSepettekiTelMarlkalari = new ArrayList<>();
//
//
//    @Given("kullanici tutorialsninja sayfasina gider")
//    public void kullaniciTutorialsninjaSayfasinaGider() throws InterruptedException {
//
//        Driver.getDriver().get(ConfigReader.getProperty("tutorialsninja"));
//
//
//    }
//
//    @Then("Phones & PDA' ya tiklar")
//    public void phonesPDAYaTiklar() {
//        tutorialsninjaPage.phonesPDAs.click();
//
//    }
//
//
//    @And("telefon markalarini alir")
//    public void telefonMarkalariniAlir() {
//        for (WebElement w : tutorialsninjaPage.telMarkalari) {
//            listTelMarkalari.add(w.getText());
//
//        }
//
//        listTelMarkalari.forEach(System.out::println);
//        System.out.println("=======================================");
//
//
//    }
//
//    @And("Tüm ögeleri sepete ekler")
//    public void tümÖgeleriSepeteEkler() {
//        tutorialsninjaPage.addToCartButtons.forEach(WebElement::click);
//
//    }
//
//    @And("sepete tiklar")
//    public void sepeteTiklar() {
//        tutorialsninjaPage.sepetButonu.click();
//
//    }
//
//    @And("sepetteki isimleri alir")
//    public void sepettekiIsimleriAlir() {
//        for (WebElement w : tutorialsninjaPage.spettekiTelMarkalari) {
//            listSepettekiTelMarlkalari.add(w.getText());
//
//        }
//        listSepettekiTelMarlkalari.forEach(System.out::println);
//
//    }
//
//        And("sepetteki ve sayfadaki ürünlerin dogru oldugunu karsilastirir")
//    public void sepettekiVeSayfadakiÜrünlerinDogruOldugunuKarsilastirir() {
//
//        Collections.sort(listSepettekiTelMarlkalari);
//        Collections.sort(listTelMarkalari);
//        Assert.assertEquals(listTelMarkalari, listSepettekiTelMarlkalari);
//
//    }
//}








//package stepDefinitions;
//
//        import io.cucumber.java.en.And;
//        import io.cucumber.java.en.Then;
//        import org.junit.Assert;
//        import org.openqa.selenium.WebElement;
//        import pages.TutorialsPage;
//        import utilities.ReusableMethod;
//
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//public class TutorialsStepDefinitions {
//
//    TutorialsPage page = new TutorialsPage();
//
//    List<String> cartPhoneList;
//    List<String> phoneList;
//
//    @Then("Phones & PDAS'a tiklar")
//    public void phonesPDASATiklar() {
//
//        page.phonesAndPdas.click();
//    }
//
//    @Then("Telefonlarin markalarini alir")
//    public void telefonlarinMarkalariniAlir() {
//
//        System.out.println("Telefon Markalari");
//        int count = 1;
//        for (WebElement w : page.phonesTitle) {
//
//            System.out.println(count + " -> " + w.getText());
//            count++;
//        }
//    }
//
//    @Then("Tum ogeleri sepete ekler")
//    public void tumOgeleriSepeteEkler() {
//
//        for (WebElement w : page.phonesAddCart) {
//
//            w.click();
//            ReusableMethod.waitFor(2);
//        }
//
//    }
//
//    @Then("Sepete tiklar")
//    public void sepeteTiklar() {
//
//        page.cart.click();
//    }
//
//    @Then("Sepetteki urun isimlerini alir")
//    public void sepettekiUrunIsimleriniAlir() {
//
//        System.out.println("Sepetteki Telefonlar");
//        int count = 1;
//        //for (WebElement w : page.sepettekiTel) {
//        //    System.out.println(count + " -> " + w.getText());
//        //    count++;
//        //}
//
//        cartPhoneList = new ArrayList<>(); // sepetteki urunleri bos liste atadik
//
//        for (int i = 1; i < page.sepettekiTelefonlar.size(); i += 2) {  // +2
//
//            System.out.println(count + " -> " + page.sepettekiTelefonlar.get(i).getText());
//            cartPhoneList.add(page.sepettekiTelefonlar.get(i).getText());
//            count++;
//        }
//        Collections.sort(cartPhoneList); // sepetteki urunleri naturel sirala
//
//        System.out.println("*****");
//        System.out.println(cartPhoneList);
//
//    }
//
//    @And("Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastiriniz.")
//    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastiriniz() {
//
//        phoneList = new ArrayList<>();  // telefon listesini bos liste atadik
//
//        for (int i = 0; i < page.phonesTitle.size(); i++) {
//
//            phoneList.add(page.phonesTitle.get(i).getText());
//        }
//        Collections.sort(phoneList); // telefon listesini naturel sirala
//
//        System.out.println("*****");
//        System.out.println(phoneList);
//
//
//        Assert.assertEquals(phoneList, cartPhoneList); //karsilastir
//    }
//}