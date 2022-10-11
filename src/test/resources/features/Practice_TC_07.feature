@calistir
Feature: TC Verify Test Cases

  Scenario: TC_07_Test Cases

 Given Tarayiciyi baslatarak "http://automationexercise.com" url'sine gidin
 Then Ana sayfanin basariyla gorunur oldugunu dogrulayin
 And Test Case buttonu na tiklayin
 Then Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin
 And Ilgili sayfanin ekran goruntusunu alin

 #Given :verildiğinde demek,
#When : --zaman ,given dan sonra yazılır.
#Then : genelde aseertion yapıldıgında kullanılır.
#And :tekrarlayan adımlarda kullanılır
  #Given, giris kısmında, -verilen, gidilen vs  anlamında kullanılıyor,
  # Then assertion yani doğrulamalarda kullanıyoruz,
  # and tekrarlayanlarda kullanılıyor.
  # When zaman anlamında givenden sonra bu -dığında, -dığı zaman anlamında.