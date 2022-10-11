@rent
Feature: US007 BlueRentaCar negatif test

  Scenario: TC11 kullanici gecersiz bilgilerle giris yapar

    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir