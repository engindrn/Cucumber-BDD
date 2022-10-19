@RUN
Feature: US015 Class Work

  Scenario Outline: TC01 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" adresine gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Close (Rs) |
      | % Change           |

    Scenario: Kullanici sayfayi kapatır
      Given Sayfayi kapatir