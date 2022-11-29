package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",  //runnerdan çalıştırınca targetın altında rapor verir
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",      //features ile stepDefinationu glue ile birbirin tanıttık
        glue = "stepDefinitions",
        tags = "@hepsi",
        dryRun = false             //true yaparsak dersek testimizi calistirmadan eksik adimlari bize verir
)


public class Runner {
    /*
Runner Class'i TestNG'deki XML mantigi ile calisir
Calistirmak istedigimiz senaryolari tag belirtiriz
ve belirttigimiz taglari calistirir XML'deki gibi istedigimiz testleri calitrimak icin kullaniriz
Runner Class body'si bostur ve Runner Class'ini ekleyecegimiz notasyonlar aktive eder

Bu class'da kullanacagimiz 2 adeet notasyon vardir

1-@RunWith(Cucumber.class)  notasyonu Runner Class'ina calisma ozelligi ekler,
Bu notasyon oldugu icin Cucumber frameworkumuz de Junit kullanmayi tercih ederiz

2-@CucumberOptions notasyonu icin de
features :Runner dosyasinin feature dosyasini nereden bulacagimizi tarif eder/ dosya yolu
glue:stepDefinitions yolunu belirtiriz/ bire bir ismi
tags :Hangi tagi calistirmak istiyorsak onu belli eder featurda belirlerdiğimzi tagı yazarız
dryRun: 2 secenek vardir
a-)dryRun=true --> dersek testimizi calistirmadan eksik adimlari bize verir
b-)dryRun=false-->Testlerimizi drive ile calistirir

"@grp1 or @grp2",   //iki tagı çalıştırır
 */



 //  Runner class: Cucumber ın olmazsa olmazlarındandır.
 //  Runwith olmazsa olmazdır
 //  CucumberOptions: Junitten geliyor, testlerimizi bu anatotion ile resources-feature da bulunan
 //  Glue kısmı  ile birbirine yapıştırıyoruz, yani feauture fileım ile stepDefinition umu birbirine yapıştırıyorum
 //  Daha sonra tag kısmında feature içinde olusturdugum isimlendirme  kısmını burada çağırıyorum.
 //   dryRun(prova anlamında)= true ile calıstırdığımızda  eksik stepDefinitionları bulmak için kullanıyoruz, browser ı açmadan toolumuza getirir.
 // =false: varsayılan olarak false gelir. Browser calısır. Normal test case lerimizi koşacağımız zaman kullanıyoruz.
}
