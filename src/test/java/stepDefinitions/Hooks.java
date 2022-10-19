package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /* cucumburda stepDefinition package si içerisinde @Before @After gibi bir notasyon varsa
       extends testbase dememize gerek kalmadan her scenariodan önce ve/veya sonra bu methodlar calisacaktir

       Buda bizim isteyeceğimiz bir durum değildir

       cucuburda @before @after kullanimina ihtiyac olursa bunu stepDefinition packagesi altında oluşturacağımız
       hooks class ına koyariz

       biz her senaryodan sonra test sonucunu kontrol edip faild olan scenariolar için screenschoot alması
       amacıyşa @After notasyonu kullanacagız*/



    @After
    public void tearDown(Scenario scenario){  final byte[] screenshot=((TakesScreenshot)
            Driver.getDriver()).getScreenshotAs(OutputType.BYTES);  if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png","screenshots");
    }
       // Driver.closeDriver();
    }
}


/*Scenario classından obje oluşturuyor eğer scenario nuzda hata alırsanız resmini alır*/