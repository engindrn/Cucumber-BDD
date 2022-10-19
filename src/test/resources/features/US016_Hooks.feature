@hps
Feature: US016 Parametre Kullanimi

  Scenario: TC01 Parameetre Kullanimi
    Given Kullanici "https://www.hepsiburada.com" sayfasinda
    Then kullanici 4 saniye bekler
    When url'nin "amazon" icerdigini test edelim
    And Sayfayi kapatir