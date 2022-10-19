Feature: US020 Class Work

  Scenario: TC01 Explicitly Wait

    Given kullanici "demoqaUrl2" anasayfasina gider
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test eder