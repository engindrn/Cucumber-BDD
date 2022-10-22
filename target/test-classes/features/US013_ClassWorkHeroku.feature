Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama

    And kullanici "heroku" adresine gider
    And Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    And addRemove Elements yazisinin gorunurlugunu test edin
    And kullanici 3 saniye bekler
    And Delete butonunun gorunmedigini test edin
