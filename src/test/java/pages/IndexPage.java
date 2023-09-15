package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IndexPage {
    public IndexPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@id='product-455239'])[1]")
    public WebElement safahatImgIndex;

    @FindBy(xpath = "//*[@class='btn border border-1 border-gray-600 rounded-3 py-18px text-gray-800 bg-white w-100 mt-15px fs-18 fw-bold']")
    public WebElement uyeOlmadanDevamEtButonIndex;

    @FindBy(xpath = "//*[@id='shipping-company']")
    public WebElement adreseTeslimEtRadioButonIndex;

    @FindBy(xpath = "(//*[@class='border border-2 rounded-1 border-gray-300 d-flex justify-content-center align-items-center text-green-dark text-decoration-none'])[2]")
    public WebElement adresEkleTextBoxIndex;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement adinizTextBoxIndex;

    @FindBy(xpath = "//*[@id='description_text']")
    public WebElement descriptionSafahatKitap;

    @FindBy(xpath = "//*[@id='continue-button']")
    public WebElement devamEtButonIndex;

    @FindBy(xpath = "//*[@id='btn-modal-country']")
    public WebElement ulkeDropDown1Index;

    @FindBy(xpath = "//*[@id='js-input-search-country']")
    public WebElement ulkeDropDown2Index;

    @FindBy(xpath = "//*[@data-name='Türkiye']")
    public WebElement ulkeDropDown3Index;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[2]")
    public WebElement sehirDropDown1Index;

    @FindBy(xpath = "//*[@id='js-input-search-zone']")
    public WebElement sehirDropDown2Index;

    @FindBy(xpath = "//*[@data-name='Samsun']")
    public WebElement sehirDropDown3Index;

    @FindBy(xpath = "(//a[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[3]")
    public WebElement ilceDropDown1Index;

    @FindBy(xpath = "//*[@id='js-input-search-county']")
    public WebElement ilceDropDown2Index;

    @FindBy(xpath = "//*[@data-name='ÇARŞAMBA']")
    public WebElement ilceDropDown3Index;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[4]")
    public WebElement mahalleDropDown1Index;

    @FindBy(xpath = "//*[@id='js-input-search-district']")
    public WebElement mahalleDropDown2Index;

    @FindBy(xpath = "//*[@data-name='SARICALI MAH']")
    public WebElement mahalleDropDown3Index;

    @FindBy(xpath = "//*[@id='continue-button']")
    public WebElement devamEtButonSeciliAdresIndex;

    @FindBy(xpath = "//*[.='Adres Bilgilerim:']")
    public WebElement textAdresBilgilerimIndex;

    @FindBy(xpath = "//*[@class='fs-14 mb-5px']")
    public WebElement textKartNumarasiIndex;

    @FindBy(xpath = "//*[@class='ky-btn ky-btn-orange w-100 ky-register-btn']")
    public WebElement uyeOlButonIndex;

    @FindBy(xpath = "//div[@class='ky-error']")
    public WebElement hataMesajiHesapOlusturIndex;

    @FindBy(xpath = "//input[@id='register-name']")
    public WebElement textBoxAdHesapOlusturIndex;

    @FindBy(xpath = "//input[@id='register-lastname']")
    public WebElement textBoxSoyadHesapOlusturIndex;

    @FindBy(xpath = "//input[@id='register-email']")
    public WebElement textBoxEmailHesapOlusturIndex;

    @FindBy(xpath = "//input[@id='register-password']")
    public WebElement textBoxSifreHesapOlusturIndex;

    @FindBy(xpath = "//input[@id='register-password-confirm']")
    public WebElement textBoxSifreTekrariHesapOlusturIndex;

    @FindBy(xpath = "(//*[@class='ky-checkbox-input'])[1]")
    public WebElement checkboxKisiselVerilerinKorunmasiHesapOlusturIndex;

    @FindBy(xpath = "//*[.='Ad alanı 2 ile 30 karakter arasında olmalı!']")
    public WebElement adAlaniHataMesajHesapOlusturiIndex;

    @FindBy(xpath = "//*[@class='fa fa-check-circle']")
    public WebElement textHesabinizOlusturulduIndex;

    @FindBy(xpath = "(//*[@class='ky-error-input'])[2]")
    public WebElement soyadAlaniHataMesajHesapOlusturiIndex;

    @FindBy(xpath = "//*[.='Geçerli bir E-Posta adresi yazınız!']")
    public WebElement epostaAlaniHataMesajHesapOlusturiIndex;

    @FindBy(xpath = "//*[.='Şifreniz 8 ile 20 karakter arasında olmalı!']")
    public WebElement sifreAlaniHataMesajHesapOlusturiIndex;

    @FindBy(xpath = "//*[.='Şifreniz birbiriyle uyuşmuyor!']")
    public WebElement sifreTekrariHataMesajHesapOlusturiIndex;

    //*********************************************
    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement textBoxEpostaHosgeldinizIndex;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement textBoxSifreHosgeldinizIndex;

    @FindBy(xpath = "//*[@class='ky-checkbox-input']")
    public WebElement checkBoxBeniHatirlaHosgeldinizIndex;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement girisYapButonHosgeldinizIndex;

    @FindBy(xpath = "(//*[@href=\"https://www.kitapyurdu.com/index.php?route=account/account\"])[1]")
    public WebElement textMerhabaAccountIndex;

    @FindBy(xpath = "//div[@class='ky-error']")
    public WebElement epostaAdresiVeSifreYanlisHataMesajiIndex;

    @FindBy(xpath = "(//*[.='Çıkış'])[2]")
    public WebElement cikisLinkAccountIndex;

    @FindBy(xpath = "(//*[@title='Kavanozda'])[1]")
    public WebElement secilenUrunKitap;

    @FindBy(xpath = "//*[@class='muted']")
    public WebElement secilenUrunKazanacaginizPuanKitap;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement secilenUrunCheckboxUstIndex;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement secilenUrunCheckboxAltIndex;

    @FindBy(xpath = "(//*[@class='quantity'])[1]")
    public WebElement secilenUrunMiktarIndex;

    @FindBy(xpath = "(//*[@class='preparation'])[1]")
    public WebElement secilenUrunTedarikSuresiIndex;

    @FindBy(xpath = "(//*[@class='price'])[1]")
    public WebElement secilenUrunBirimFiyatiIndex;

    @FindBy(xpath = "(//*[@class='total'])[1]")
    public WebElement secilenUrunToplamIndex;

    @FindBy(xpath = "//*[@class='fa fa-times red-icon']")
    public WebElement secilenUrunListedenKaldirIndex;

    @FindBy(xpath = "//h2[@class='swal2-title ky-swal-title-single']")
    public WebElement secilenUrunSepetinizdenCikariliyorAlertIndex;

    @FindBy(xpath = "//*[@id='faceted-search-list-total']")
    public WebElement urunListelendiTextIndex;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11762859/wi:100/wh:true']")
    public WebElement dilVeEdebiyatDergileriIlkUrunIndex;

    @FindBy(xpath = "//*[@class='pr-img-link']")
    public WebElement favorilerimEklenenUrunIndex;

    @FindBy(xpath = "//div[normalize-space()='E-Posta adresi ile daha önce kayıt olunmuştur!']")
    public WebElement ePostaAdresiIleDahaOnceKayitOlunmusturAlertIndex;



    @FindBy(xpath = "//*[@id='address_type_1']")
    public WebElement sahisCheckBoxIndex;

    @FindBy(xpath = "//*[@value='Kaydet']")
    public WebElement kaydetButonIndex;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11750889/wi:100/wh:true']")
    public WebElement dergiSayfasiIlkUrunIndex;

    @FindBy(xpath = "(//*[@href='https://www.kitapyurdu.com/index.php?route=checkout/delivery'])[1]")
    public WebElement satinAlButonIndex;

    @FindBy(xpath = "//*[.='Adres Ekle']")
    public WebElement adresEkleTextIndex;

    @FindBy(xpath = "//input[@id='address-title']")
    public WebElement adresBasligiTextBoxIndex;

    @FindBy(xpath = "//*[@id='address-country-id']")
    public WebElement ulkeDropDownIndex;

    @FindBy(xpath = "//*[@id='address-zone-id']")
    public WebElement sehirDropDownIndex;

    @FindBy(xpath = "//*[@id='address-county-id']")
    public WebElement ilceDropDownIndex;

    @FindBy(xpath = "//*[@id='district']")
    public WebElement mahalleTextBoxIndex;

    @FindBy(xpath = "(//*[@href='https://www.kitapyurdu.com/index.php?route=account/address/insert&is_checkout=1'])[2]")
    public WebElement yeniAdresEkleIndex;

    @FindBy(xpath = "//button[@class='base-accordion-button accordion-button fw-bold p-16px fs-18 text-black border-0 pe-10px bg-white ']")
    public WebElement kartIleOdeCheckboxIndex;

    @FindBy(xpath = "//*[@id='credit_card_number']")
    public WebElement kartNumarasiTextBoxIndex;

    @FindBy(xpath = "//div[normalize-space(text())='Toplam Tutar:']")
    public WebElement toplamTutarTextIndex;












}
