
Feature: US003_tutorialsninja doğrulama

  Scenario: Kullanıcı Phones ve PDA aratır

    Given kullanici tutorialsninja sayfasina gider
    Then Phones & PDAs'a tiklar
    And telefon markalarini alir
    And  Tum ogeleri sepete ekler
    And sepete tiklar
    And sepetteki urun isimlerini alir
    And sepetteki ve sayfadaki ürünlerin dogru oldugunu karsilastirir
    And Sayfayi kapatir
  #sayfayı kapatır methodu stepDefinatin da amazonda birkez methodu oluşturduk artık o package de kullanılır


#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız