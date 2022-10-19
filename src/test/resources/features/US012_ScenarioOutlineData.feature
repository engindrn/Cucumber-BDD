@data
Feature:Class Calismasi

  Scenario Outline:
    When kullanici "dataUrl" adresine gider
    Then kullanici 1 saniye bekler
    Then new butonuna basar
    Then kullanici 1 saniye bekler
    And isim bolumune "<firstname>" girer
    Then kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>" girer
    Then kullanici 1 saniye bekler
    And position bolumune"<position>" girer
    Then kullanici 1 saniye bekler
    And ofis bolumune "<ofisbilgisi>" girer
    Then kullanici 1 saniye bekler
    And extension bolumune "<extension>" girer
    Then kullanici 1 saniye bekler
    And startdate bolumune"<Stardate>"  girer
    Then kullanici 1 saniye bekler
    And salary bolumune "<Salary>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate   | Salary |
      | Ali       | Veli     | Qa       | Google      | Senior    | 20-2-2022  | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 10-1-2021  | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 11-12-2020 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon      | Senior    | 12-5-2009  | 50000  |
      | Orhan     | Duman    | PO       | WallMart    | Senior    | 6-6-2006   | 30000  |
