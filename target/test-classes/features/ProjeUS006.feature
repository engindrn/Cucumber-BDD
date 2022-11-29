
  Feature:US006 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.

    Background: ortak adimlar
      Given Kullanici Medunna "https://www.medunna.com" gider
      Then Kullanici Sing in simgesine tiklar
      Then Kullanici Sing in e tiklar
      When Kullanici "Username" girer
      Then Kullanici password "Password" girer
      And Kullanici Sing in butonuna tiklar
      And Kullanici account-menu (Efe Efe) tiklar
      Then Kullanici Settings i tiklar

    Scenario: TC001 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.

      Given User settings sayfasinda oldugunu dogrular
      Then Firstname kayit olurken girilen firstname ile ayni olmalidir
      And Lastname kayit olurken girilen lastname ile ayni olmalidir
      Then Email kayit olurken girilen email ile ayni olmalidir

    Scenario : TC002 "Firstname"güncelleme seçeneği olmalıdır.

      Given Kullanici yeni bir firstname girer
      When Kullanici save butonuna tiklar
      Then Firstname nin guncellendigini dogrular


    Scenario : TC003 "Lastname" güncelleme seçeneği olmalıdır.

      Given Kullanici yeni bir lastname girer
      Then Kullanici save butonuna tiklar
      And Lastname nin guncellendigini dogrular


    Scenario : TC004 "E-mail" güncelleme seçeneği olmalıdır.

      Given Kullanici yeni bir Email girer
      Then Kullanici save butonuna tiklar
      And Email in guncellendigini dogrular