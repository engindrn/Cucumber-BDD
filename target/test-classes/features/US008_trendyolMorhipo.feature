Feature: US008 Trendyol Morhipo search

  Scenario: TC01 Arama sonuçlarını karşılaştırma

    Given kullanici google a gider
    Then kullanici google da Trendyol u aratir
    And kullanici Trendyol a girer
    And kullanici Trendyol da makas aratir
    And kullanici toplam Trendyol daki makas sayisini alir
    Then kullanici yeni sekme acar
    And kullanici google da Morhipo u aratir
    And kullanici Morhipo ya girer
    And kullanici Morhipo da makas aratir
    Then kullanici toplam Morhipo daki makas sayisini alir
    And kullanici makas sayisi fazla olan sayfayi kapatir
    Then kullanici makas sayisi az olan sayfayi kapatir


#- Google'a gidiniz
#- trendyol'u aratınız
#- trendyol linkini bulup siteye gidiniz
#- makas aratınız
#- toplam ürün sayısını alınız
#- yeni sekmede morhipo'ya gidiniz
#- makas aratınız
#- toplam ürün sayısını alınız
#- iki sitedeki topla makas sayısını karşılaştırınız
#- Önce ürün sayısı fazla olan siteyi kapatınız
#- Sonra diğer sayfayıda kapatınız