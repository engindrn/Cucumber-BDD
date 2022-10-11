Feature: US002 Background Kullanimi


  Background: Ortak Adımlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullancı amazonda nutella aratır
    Then Kullanici nutella aratir
    And Sonuclarin nutalla icerdigini test eder


  Scenario: TC02 Kullancı amazonda Selenium aratır
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullancı amazonda iphone aratır
    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir


