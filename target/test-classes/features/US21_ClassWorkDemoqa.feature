Feature: US21 Class Work
  Scenario: TC Explicitly wait
     Given Kullanici "demoqaUrl2" sayfasina gider
    When kullanici Visible After bes seconds butonunun gorunur olamsini bekler
    And kullanici Visible After bes seconds butonunun gorunur oldugunu test eder
