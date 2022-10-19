Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: : TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "<arananKelime>" icerdigini test edelim
    And Sayfayi kapatir
    Examples:
      | arananUrl   | arananKelime |
      | amznUrl     | amazon      |
      | faceUrl     | face        |
      | googleUrl   | google      |
      | bluerentUrl | blue        |



    #"....." ve "<......>"   string ifade olarak methoda gider