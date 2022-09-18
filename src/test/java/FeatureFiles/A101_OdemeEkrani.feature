Feature: Odeme Fonksiyonu

  @Regression
  Scenario: Sepete eklenen urun icin odeme ekranina ulasilmasi
    Given A101 adresine git
    When Giyim Aksesuar_Kadin Ic Giyim_Dizalti Corap bolumune git
    And Acilan urunun siyah oldugunu dogrula
    And Acilan urunu sepete ekleyerek sepeti onayla
    And Uye olmadan devam ederek siparisi tamamla
    Then Odeme icin ekrana yonlendirildigini dogrula