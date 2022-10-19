package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GuruPage;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class GuruStepDefinition {

    GuruPage guruPage = new GuruPage();

   // @And("kulllanici cookiesi kabul eder")              GEREK YOK ÇALIŞIYOR COOKİESLEDE
   // public void kulllaniciCookiesiKabulEder() {
     //      guruPage.cookies.click();
     // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
     //  wait.until(ExpectedConditions.visibilityOf(guruPage.cookies)).click();
     //   }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {


        int index = -1;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {
            if(guruPage.basliklar.get(i).getText().equals(baslik)){ //Feature'dan gelen string değeri i degerine eşitledik
                System.out.println(guruPage.basliklar.get(i).getText());//Feature'dan gelen başlığı yazdırdık
                index = i+1; // Feature'dan gelen ve i değerine eşitlediğimiz string'i aynı değere sahip sutunlarıda yazdırabilmek için
                // boş bir konternar oluşturup ona atadık. Listte index 0(sıfır) dan başladığı için ve webTable locate'imiz 1 den
                //başladığı için i değerini bir arttırdık.
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //Sonrasında webTable'daki body'i locate edip eşitlediğimiz index'i başlık altındaki sutunu getirebilmesi için bu liste koyduk.

                //Lambda ilede o sutunu yazdırdık
                sutunElement.forEach(t-> System.out.println(t.getText()));

                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}


            }
        }
    }


}