@practiceForm
Feature: Form doldurma

  Scenario Outline: Practice form doldurma


    Given Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And kullanici 3 saniye bekler
    And bir dosya yukler
    And kullanici 3 saniye bekler
    And checkbox1 i secer
    And kullanici 3 saniye bekler
    And radio2 yi secer
    And kullanici 3 saniye bekler
    And selection item3 secer
    And kullanici 3 saniye bekler
    And dropdown itmem4 secer
    And kullanici 3 saniye bekler
    And submite tiklar
    And kullanici 3 saniye bekler
    Then dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |