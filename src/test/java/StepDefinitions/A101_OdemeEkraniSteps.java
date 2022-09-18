package StepDefinitions;

import Pages.A101Page;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class A101_OdemeEkraniSteps {

    A101Page ap = new A101Page();
    @Given("A101 adresine git")
    public void a101AdresineGit() {
        GWD.getDriver().get("https://www.a101.com.tr/");
        GWD.getDriver().manage().window().maximize();
        ap.findAndClick("cerezKabulButton");

    }

    @When("Giyim Aksesuar_Kadin Ic Giyim_Dizalti Corap bolumune git")
    public void giyimAksesuarKadinIcGiyimDizaltiCorapBolumuneGit() {
        ap.findAndHoverOver("giyimAksesuar");
        ap.findAndClick("dizaltiCorap");
    }

    @And("Acilan urunun siyah oldugunu dogrula")
    public void acilanUrununSiyahOldugunuDogrula() {
        ap.findAndClick("pentiSiyahCorap");
        ap.findAndContainsText("secilenRenkVerify","SİYAH");
    }

    @And("Acilan urunu sepete ekleyerek sepeti onayla")
    public void acilanUrunuSepeteEkleyerekSepetiOnayla() {
        ap.findAndClick("sepeteEkle");
        ap.findAndClick("sepetiGoruntule");
        ap.findAndClick("sepetiOnayla");
    }

    @And("Uye olmadan devam ederek siparisi tamamla")
    public void uyeOlmadanDevamEderekSiparisiTamamla() {
        String randomGenName= RandomStringUtils.randomAlphabetic(5);
        String randomGenCode= RandomStringUtils.randomNumeric(3);

        ap.findAndClick("uyeOlmadanDevamEt");
        ap.findAndSend("emailInput","yunussdeneme@hotmail.com");
        ap.findAndClick("devamEtButton");
        ap.findAndClick("yeniAdresOlustur");
        ap.findAndSend("adresBasligi","Ev");
        ap.findAndSend("ad","Yunuss");
        ap.findAndSend("soyad",randomGenName);
        ap.findAndSend("phoneNumber","5441234567");
        ap.findAndSelect("il","ANKARA");
        ap.findAndSelect("ilce","ÇANKAYA");
        ap.findAndSelect("mahalle","MALTEPE MAH");
        ap.findAndSend("adres","123.Cad No:"+randomGenCode);
        ap.findAndSend("pastaKodu","06400");
        ap.findAndClick("kaydetButton");
        ap.findAndClick("kaydetVeDevamEt");
        ap.findAndClick("garantiPayButton");
        ap.findAndClick("sozlesmeCheck");
        ap.findAndClick("garantiPayOdemeButton");

    }

    @Then("Odeme icin ekrana yonlendirildigini dogrula")
    public void odemeIcinEkranaYonlendirildiginiDogrula() {
        ap.waitUntilUrlContains("garanti");
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("sanalposprov.garant"));
    }
}
