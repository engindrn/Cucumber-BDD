@brd
Feature: US006 Parametre Kullanimi

  Scenario: TC01 Parameetre Kullanimi
    Given Kullanici "https://www.hepsiburada.com" sayfasinda
    Then kullanici 4 saniye bekler
    When url'nin "hepsi" icerdigini test edelim
    And Sayfayi kapatir


    # stepDefinations da sadece parametreli kullanım olrak siteye gitti-tırnak içine yazdığımız için-
  #diğer adimleri yani Threed.sleep ve istenen kelimenin url de içerip içermediğini daha önce stepDefination
  #packagesi başka class altında oluşturup kullandiğimiz için ordan kullandık kapatmada aynı şekilde