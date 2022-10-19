
@All
Feature: US001 Amazon Search

  Scenario: TC01 Kullancı amazonda nutella aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And Sonuclarin nutalla icerdigini test eder

  @grp1
  Scenario: TC02 Kullancı amazonda Selenium aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder

@grp2
  Scenario: TC03 Kullancı amazonda iphone aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir