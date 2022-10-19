package stepDefinitions;

import io.cucumber.java.en.And;

public class HerokuStepDefinition {

    //sayfaya daha oluşturlan bu package deki datatable classındaki methodu kullanarak gitiik

    @And("Add Element butona basin")
    public void butonaBasin(String arg0) {
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void butonuGorunurOluncayaKadarBekleyin(String arg0) {
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin(String arg0) {
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
    }

    @And("addRemove Elements yazisinin gorunurlugunu test edin")
    public void addremoveElementsYazisininGorunurlugunuTestEdin() {

    }
}





//package stepDefinitions;
//        import io.cucumber.java.en.And;
//        import org.junit.Assert;
//        import org.openqa.selenium.support.ui.ExpectedConditions;
//        import org.openqa.selenium.support.ui.WebDriverWait;
//        import pages.HerokuPages;
//        import utilities.Driver;
//        import utilities.ReusableMethods;
//        import java.time.Duration;

//public class HerokuStepDefinition {

//    HerokuPages herokuPages=new HerokuPages();

//    @And("Add Element butona basin")
//    public void addElementButonaBasin() {
//        herokuPages.addElementButton.click();
//    }
//    @And("Delete butonu gorunur oluncaya kadar bekleyin")
//    public void deleteButonuGorunurOluncayaKadarBekleyin() {
//
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(herokuPages.deleteButton));
//
//          Reusable ile
//          ReusableMethods.waitForVisibility(herokuPages.deleteButton,10);
//    }

//    @And("Delete butonunun gorunur oldugunu test edin")
//    public void deleteButonununGorunurOldugunuTestEdin() {
//        assert herokuPages.deleteButton.isDisplayed();
//        Bu sekilde de kullanilabiliyor
//        herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
//         yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz
//         Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
//         bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
//         Assert.assertTrue(herokuPages.deleteButton.isDisplayed());
//    }
//    @And("Delete butonuna basarak butonu silin")
//    public void deleteButonunaBasarakButonuSilin() {
//        herokuPages.deleteButton.click();
//    }
//    @And("Delete butonunun gorunmedigini test edin")
//    public void deleteButonununGorunmediginiTestEdin() {
//        assert !herokuPages.deleteButton.isDisplayed();
//
//}
/*@Then("Delete butonunun gorunmedigini test edin")
public void deleteButonununGorunmediginiTestEdin() {

    Assert.assertTrue(page.deleteList.isEmpty());
Page Sayfasi
@FindBy(css = "button[class=added-manually]")
public List<WebElement> deleteList;*/


/*assert ! herOkuAppPage.deleteElement.isDisplayed();

Page Sayfasi
@FindBy(xpath = "//*[text()='Delete']")
public WebElement deleteElement;*/


//    }
//    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
//    public void addremoveElementsYazisininGorunurlugunuTestEder() {
//        assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
//    }
//}
/*Most Common Selenium Exceptions (En Yaygın Selenyum Exception’ları)
NoSuchWindowException: değiştirilecek pencere hedefi yoksa oluşur.
NoSuchFrameException: değiştirilecek çerçeve hedefi yoksa oluşur.
NoSuchElementException: bir öğe bulunamazsa oluşur
NoAlertPresentException: sunulmayan uyarıya geçtiğinizde oluşur.
InvalidSelectorException: yanlış bir seçici nedeniyle oluşur.
TimeoutException: Bir komutun tamamlanması için yeterli zaman olmadığında atılır.
ElementNotVisibleException: DOM’daki mevcut bir öğenin gizli olarak ayarlanmış özelliği olduğunda oluşur.
ElementNotSelectableException: DOM’da bir öğe sunulduğunda ortaya çıkar, ancak bunu seçebilirsiniz.
NoSuchSessionException: Tarayıcıdan çıktıktan sonra Web Sürücüsü harekete geçiyor
StaleElementReferenceException:weböğesigeçerliDOM’denayrıldığındaortayaçıkar.
NullPointerExeption: örn configuration.propertiesde tanımlı olmayan bir adresi featuresde parametre olrak girersek
DuplicatesStepDefinitionExeption : StepDefinitionda aynı method dan birden fazla olamaz unique olmalı*/