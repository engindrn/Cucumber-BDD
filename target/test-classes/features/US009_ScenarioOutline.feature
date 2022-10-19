Feature: US009 Kullanici amazonda istediği kelimeleri aratır

  Scenario Outline: TC01 Kullanici istediği kelimeleri aratir
    Given Kullanici "amznUrl" sayfasina gider
    Then Kullanici "<istenenKelime>" aratir
    And Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And Sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | java          | java                 |

     #TestNG deki dataProvider kullanimindaki gibi Cucumberda da    Scenario Outline kullaniriz
#Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
 #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
 #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
#icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
 #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
 # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
 #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz