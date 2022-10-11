Feature: US004 Parametre Kullanimi

  Background:
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then Kullanici "nutella" aratir
    And Sonuclarin "nutalla" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then Kullanici "selenium" aratir
    And Sonuclarin "selenium" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC03 Kullanici amazonda parametreli arama yapar
    Then Kullanici "java" aratir
    And Sonuclarin "java" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC04 Kullanici amazonda parametreli arama yapar
    Then Kullanici "SQL" aratir
    And Sonuclarin "SQL" icerdigini test eder
    And Sayfayi kapatir


# Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız string değeri stepDefinitionda
#Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
#Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz string ifadeyi değiştirmemiz
#yeterli olucaktır. Böylece kodlarımız dinamik olucaktır

  #istersek featureden çalıştırıp sadece sona kapatır dersek hepsini tep sayfada yapar
  #bu şekilde her seneryoda yeni browser açıp kapatacak