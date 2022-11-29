@hepsi
Feature:US006 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.



  Scenario:TC001 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.

            Given Kullanici Medunna adresine gider
            When Kullanici Sing in simgesine tiklar
            And Kullanici Sing in e tiklar
            And Kullanici Username girer
            And Kullanici Password girer
            And Kullanici Sing in butonuna tiklar
            And Kullanici account-menu (Efe Efe) tiklar
            And Kullanici Settings i tiklar
            And User settings sayfasinda oldugunu dogrular
            And Firstname kayit olurken girilen firstname ile ayni olmalidir
            When Lastname kayit olurken girilen lastname ile ayni olmalidir
            Then Email kayit olurken girilen email ile ayni olmalidir

  Scenario:TC002 "Firstname"güncelleme seçeneği olmalıdır.

             Given Kullanici Medunna adresine gider
             When Kullanici Sing in simgesine tiklar
             And Kullanici Sing in e tiklar
             And Kullanici Username girer
             And Kullanici Password girer
             And Kullanici Sing in butonuna tiklar
             And Kullanici account-menu (Efe Efe) tiklar
             And Kullanici Settings i tiklar
             Given Kullanici yeni bir firstname girer
             When Kullanici save butonuna tiklar
             Then Firstname nin guncellendigini dogrular



  Scenario:TC003 "Lastname" güncelleme seçeneği olmalıdır.

               Given Kullanici Medunna adresine gider
               When Kullanici Sing in simgesine tiklar
               And Kullanici Sing in e tiklar
               And Kullanici Username girer
               And Kullanici Password girer
               And Kullanici Sing in butonuna tiklar
               And Kullanici account-menu (Efe Efe) tiklar
               And Kullanici Settings i tiklar
               Given Kullanici yeni bir lastname girer
               Then Kullanici save butonuna tiklar
               And Lastname nin guncellendigini dogrular


  Scenario:TC004 "E-mail" güncelleme seçeneği olmalıdır.

             Given Kullanici Medunna adresine gider
             When Kullanici Sing in simgesine tiklar
             And Kullanici Sing in e tiklar
             And Kullanici Username girer
             And Kullanici Password girer
             And Kullanici Sing in butonuna tiklar
             And Kullanici account-menu (Efe Efe) tiklar
             And Kullanici Settings i tiklar
             Given Kullanici yeni bir Email girer
             Then Kullanici save butonuna tiklar
             And Email in guncellendigini dogrular
