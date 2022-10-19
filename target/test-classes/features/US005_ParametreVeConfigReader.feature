Feature: US005_Parametre Kullanimi

  Scenario:TC01 Parametre kullaniminda ConfigReader kullanimi

    Given Kullanici "amznUrl" sayfasina gider
    When Kullanici "Nutella" aratir
    And Sonuclarin "Nutalla" icerdigini test eder
    And Sayfayi kapatir

    Scenario:TC02 URL testi
      Given Kullanici "bluerentUrl" sayfasina gider
      Then kullanici 3 saniye bekler
      When url'nin "blue" icerdigini test edelim
      And Sayfayi kapatir

  Scenario:TC04 URL testi
    Given Kullanici "faceUrl" sayfasina gider
    Then kullanici 4 saniye bekler
    When url'nin "facebook" icerdigini test edelim
    And Sayfayi kapatir

  Scenario:TC05 URL testi
    Given Kullanici "amznUrl" sayfasina gider
    Then kullanici 5 saniye bekler
    When url'nin "amazon" icerdigini test edelim
    And Sayfayi kapatir

    #url configuration.properties deki keyimizi yazdık istediğimizde değiğtirebilirz