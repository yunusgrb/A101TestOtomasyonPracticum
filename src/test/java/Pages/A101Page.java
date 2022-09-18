package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A101Page extends Parent{

    public A101Page() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[contains(text(),'Giyim & aksesuar')]")
    private WebElement giyimAksesuar;

    @FindBy(linkText="Dizaltı Çorap")
    private WebElement dizaltiCorap;

    @FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement cerezKabulButton;

    @FindBy(xpath="//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    private WebElement pentiSiyahCorap;

    @FindBy(xpath="//div[contains(text(),'Seçılen Renk')]/span")
    private WebElement secilenRenkVerify;

    @FindBy(css="[class='add-to-basket button green block with-icon js-add-basket']")
    private WebElement sepeteEkle;

    @FindBy(linkText="Sepeti Görüntüle")
    private WebElement sepetiGoruntule;
    @FindBy(linkText="Sepeti Onayla")
    private WebElement sepetiOnayla;

    @FindBy(linkText="ÜYE OLMADAN DEVAM ET")
    private WebElement uyeOlmadanDevamEt;

    @FindBy (name = "user_email")
    private WebElement emailInput;

    @FindBy (css = "[class='button block green']")
    private WebElement devamEtButton;

    @FindBy(linkText="Yeni adres oluştur")
    private WebElement yeniAdresOlustur;

    @FindBy(name="title")
    private WebElement adresBasligi;

    @FindBy(name="first_name")
    private WebElement ad;

    @FindBy(name="last_name")
    private WebElement soyad;

    @FindBy(name="phone_number")
    private WebElement phoneNumber;

    @FindBy(name="city")
    private WebElement il;

    @FindBy(name="township")
    private WebElement ilce;

    @FindBy(name="district")
    private WebElement mahalle;

    @FindBy(name="line")
    private WebElement adres;

    @FindBy(name="postcode")
    private WebElement pastaKodu;

    @FindBy(xpath = "//button[contains(text(),'KAYDET')]")
    private WebElement kaydetButton;

    @FindBy(css = "button[class='button block green js-proceed-button']")
    private WebElement kaydetVeDevamEt;

    @FindBy(css = "[class='payment-tab payment-tab-gpay js-payment-tab '] ")
    private WebElement garantiPayButton;
    @FindBy(xpath = "(//input[@class='checkout__contract__checkbox js-checkout-agreement'])[1]")
    private WebElement sozlesmeCheck;

    @FindBy(linkText = "Garanti Pay ile Öde")
    private WebElement garantiPayOdemeButton;


    WebElement myElement;
    public void findAndHoverOver(String strElement)
    {
        switch (strElement){
            case "giyimAksesuar":myElement=giyimAksesuar;break;

        }
        hoverOverFunction(myElement);

    }

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "emailInput": myElement = emailInput;break;
            case "adresBasligi": myElement = adresBasligi;break;
            case "ad": myElement = ad;break;
            case "soyad": myElement = soyad;break;
            case "phoneNumber": myElement = phoneNumber;break;
            case "adres": myElement = adres;break;
            case "pastaKodu": myElement = pastaKodu;break;

        }

        sendKeysFunction(myElement, value);

    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "dizaltiCorap":myElement=dizaltiCorap;break;
            case "cerezKabulButton": myElement = cerezKabulButton; break;
            case "pentiSiyahCorap": myElement = pentiSiyahCorap;break;
            case "sepeteEkle": myElement = sepeteEkle;break;
            case "sepetiGoruntule": myElement = sepetiGoruntule;break;
            case "sepetiOnayla": myElement = sepetiOnayla;break;
            case "uyeOlmadanDevamEt": myElement = uyeOlmadanDevamEt;break;
            case "devamEtButton": myElement = devamEtButton;break;
            case "yeniAdresOlustur": myElement = yeniAdresOlustur;break;
            case "kaydetButton": myElement = kaydetButton;break;
            case "kaydetVeDevamEt": myElement = kaydetVeDevamEt;break;
            case "garantiPayButton": myElement = garantiPayButton;break;
            case "sozlesmeCheck": myElement = sozlesmeCheck;break;
            case "garantiPayOdemeButton": myElement = garantiPayOdemeButton;break;

        }

        clickFunction(myElement);
    }

    public void findAndSelect(String strElement, String value)
    {
        switch (strElement) {
            case "il": myElement = il;break;
            case "ilce": myElement = ilce;break;
            case "mahalle": myElement = mahalle;break;
        }

        selectByVisibleTextFunction(myElement,value);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "secilenRenkVerify": myElement = secilenRenkVerify; break;

        }

        verifyContainsText(myElement, text);
    }




}

