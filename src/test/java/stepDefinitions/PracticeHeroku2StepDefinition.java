package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeHeroku2Page;
import utilities.Driver;

import java.util.Random;

public class PracticeHeroku2StepDefinition {

    PracticeHeroku2Page heroku2=new PracticeHeroku2Page();

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();         //araya girip fakerdan değerler atadık
        password= Faker.instance().internet().password();
        textarea= Faker.instance().animal().name();

        heroku2.username.sendKeys(username);
        heroku2.password.sendKeys(password);
        heroku2.textarea.clear();                         //ordaki yaziyi  sildik
        heroku2.textarea.sendKeys(textarea);

    }
    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
      //   heroku2.chooseFile.sendKeys("C:\\Users\\mua\Desktop\text.txt.txt"); //direk yoluda gönderebiliriz

        String dosyaYolu= "C:\\Users\\ENGİN\\Desktop\\text.txt.txt";  //yükleyeceğim file in yolu
        heroku2.chooseFile.sendKeys(dosyaYolu);    //dosya seç butununun locatini alıp yolu oraya gönderdm
        // heroku2.xxxxxxxxxxx.click();            //dosyayi gönderdikten sonra yükle demek gerekirse böyle.
        //burda gerek olmadı direk yükledi


                 /*2.yol*/
     //  String homeDirectory= System.getProperty("user.home");
     //  String filePath =homeDirectory+"\Desktop\text.txt.txt";
     //  heroku2.chooseFile.sendKeys(filePath);             //LOCALİMİZDEKİ BİR DOSYAYİ YÜKLEDİK


    }
    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {

        if(!heroku2.checkBox1.isSelected()){        //BİRİ SEÇTİK
            heroku2.checkBox1.click();
        }

        if(heroku2.checkBox2.isSelected()){       //SEÇİLİYSE TIKLADIK KALDIRIDK
            heroku2.checkBox2.click();
        }

        if(heroku2.checkBox3.isSelected()){      //SEÇİLİYSE TIKLADIK KALDIRIDK
            heroku2.checkBox3.click();
        }

    }
    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        heroku2.radio2.click();

    }
    @When("selection item3 secer")
    public void selection_item3_secer() {

        heroku2.selectItem3.click();

    }
    @When("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {

        Select select = new Select(heroku2.dropdown);  //dropdown u list olark değil webelement olr aldık
        Random random = new Random();                                    //size() 0 dan başladığı için -1 dedik
        int rastgele= random.nextInt(select.getOptions().size()-1);     //getOptions methoduyla büytün
        select.selectByIndex(rastgele);                                      //dropdawn ı seçtik.bize list dönderir bunuda random için bound(sınır) değeri olarak verdik
                //random calsından bir obje oluşturduk menüden rastgele seçim yapması için

        //ORN
    // Random random1=new Random();                       // class levelda Random random; seklinde de olusturulabilir
    // int random1= (int)(Math.random()*10);             // 10 kdar rastgele secer
    // select=new Select(us21page.physicianSelect);              //buda class levelda
    // select.deselectByIndex(random1);




    }
    @When("submite tiklar")
    public void submite_tiklar() {
        heroku2.submitButton.click();

    }
    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {

        Assert.assertTrue(heroku2.fileName.isDisplayed());

    }
}
