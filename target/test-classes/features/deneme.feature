Feature: deneme
  Scenario:TC001 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.

Given  Kullanici Medunna "https://www.medunna.com" adresine gider
And  Kullanici Sing in simgesine tiklar
And  Kullanici Sing in e tiklar
And  Kullanici Username girer
And  Kullanici Password girer
And  Kullanici Sing in butonuna tiklar
And  Kullanici account-menu (Efe Efe) tiklar
And  Kullanici Settings i tiklar
And  User settings sayfasinda oldugunu dogrular
And  Firstname kayit olurken girilen firstname ile ayni olmalidir
When  Lastname kayit olurken girilen lastname ile ayni olmalidir
Then  Email kayit olurken girilen email ile ayni olmalidir