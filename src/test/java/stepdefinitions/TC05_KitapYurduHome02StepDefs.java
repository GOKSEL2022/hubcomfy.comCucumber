package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC05_KitapYurduHome02StepDefs {
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    CocukKitaplariPage cocukKitaplariPage=new CocukKitaplariPage();
    HaftalikPage haftalikPage=new HaftalikPage();
    KategoriPage kategoriPage=new KategoriPage();
    NeOkusamPage neOkusamPage=new NeOkusamPage();
    SinavKitaplariPage sinavKitaplariPage=new SinavKitaplariPage();
    YayincilarPage yayincilarPage=new YayincilarPage();
    YazarlarPage yazarlarPage=new YazarlarPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici cok satan kitaplar basliginin uzerine gelir")
    public void kullaniciCokSatanKitaplarBasligininUzerineGelir() {
        actions.moveToElement(homePage.cokSatanKitaplarTextHome).perform();
    }

    @When("kullanici haftalik cok satan kitaplar basligina tiklar")
    public void kullaniciHaftalikCokSatanKitaplarBasliginaTiklar() {
        ReusableMethods.clickByJS(haftalikPage.haftalikCokSatanKitaplarTextHome);
    }

    @And("kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikCokSatanKitaplarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(haftalikPage.cokSatanlarHaftalikTextHaftalik.isDisplayed());
    }

    @And("kullanici yeni cikan kitaplar basligini uzerine gelir")
    public void kullaniciYeniCikanKitaplarBasliginiUzerineGelir() {

        actions.moveToElement(homePage.yeniCikanKitaplarTextHome).perform();
    }

    @And("Kullanici haftalik yeni cikan kitaplar basligina tiklar")
    public void kullaniciHaftalikYeniCikanKitaplarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.haftalikYeniCikanKitaplarTextHome);
    }

    @And("kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikYeniCikanKitaplarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(haftalikPage.yeniCikanlarHaftalikTextHaftalik.isDisplayed());
    }

    @And("kullanici tum kitaplar basliginin uzerine gelir")
    public void kullaniciTumKitaplarBasligininUzerineGelir() {
        actions.moveToElement(homePage.tumKitaplarTextHome).perform();
    }

    @And("kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar")
    public void kullaniciTumKitaplarBasligininAltindaEdebiyatSecenegineTiklar() {
        ReusableMethods.clickByJS(homePage.tumKitaplarEdebiyatTextHome);
    }

    @And("kullanici edebiyat sayfasinin acildigini dogrular")
    public void kullaniciEdebiyatSayfasininAcildiginiDogrular() {
        Assert.assertTrue(kategoriPage.edebiyatTextKitap.isDisplayed());
    }

    @And("kullanici yayincilar basligina tiklar")
    public void kullaniciYayincilarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.yayincilarTextHome);
    }

    @And("kullanici yayincilar sayfasinin acildigini dogrular")
    public void kullaniciYayincilarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(yayincilarPage.favoriYayinciniziBulunTextYayincilar.isDisplayed());
    }

    @And("kullanici yazarlar basligina tiklar")
    public void kullaniciYazarlarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.yazarlarTextHome);
    }

    @And("kullanici yazarlar sayfasinin acildigini dogrular")
    public void kullaniciYazarlarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(yazarlarPage.yazarligaMerhabaDiyenlerTextYazarlar.isDisplayed());
    }

    @And("kullanici cocuk kitaplari basligina tiklar")
    public void kullaniciCocukKitaplariBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.cocukKitaplariTextHome);
    }

    @And("kullanici cocuk kitaplari sayfasinin acildigini dogrular")
    public void kullaniciCocukKitaplariSayfasininAcildiginiDogrular() {
        Assert.assertTrue(cocukKitaplariPage.cocukKitaplariTextCocukKitaplari.isDisplayed());
    }

    @And("kullanici sinav kitaplari basligina tiklar")
    public void kullaniciSinavKitaplariBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.sinavKitaplariTextHome);
    }

    @And("kullanici sinav kitaplari sayfasinin acildigini dogrular")
    public void kullaniciSinavKitaplariSayfasininAcildiginiDogrular() {
        Assert.assertTrue(sinavKitaplariPage.sinavKitaplariTextSinavKitaplari.isDisplayed());
    }

    @And("kullanici ne okusam basligina tiklar")
    public void kullaniciNeOkusamBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.neOkusamTextHome);
    }

    @When("kullanici ne okusam sayfasinin acildigini dogrular")
    public void kullaniciNeOkusamSayfasininAcildiginiDogrular() {
        Assert.assertTrue(neOkusamPage.neOkusamListeleriTextNeOkusam.isDisplayed());
    }

    @And("kullanici kitapYurduCom textine tiklar")
    public void kullaniciKitapYurduComTextineTiklar() {
        ReusableMethods.clickByJS(homePage.kitapYurduComTextHome);
    }

    @Given("kullanici dergi linkine tiklar")
    public void kullaniciDergiLinkineTiklar() {
    }

    @When("kullanici dergi ile ilgili alanlarin acildigini dogrular")
    public void kullaniciDergiIleIlgiliAlanlarinAcildiginiDogrular() {
    }

    @And("kullanici hobi_oyuncak linkine tiklar")
    public void kullaniciHobi_oyuncakLinkineTiklar() {
    }

    @And("kullanici hobi_oyuncak ile ilgili alanlarin acildigini dogrular")
    public void kullaniciHobi_oyuncakIleIlgiliAlanlarinAcildiginiDogrular() {
    }

    @And("kullanici kirtasiye linkine tiklar")
    public void kullaniciKirtasiyeLinkineTiklar() {
    }

    @And("kullanici kirtasiye ile ilgili alanlarin acildigini dogrular")
    public void kullaniciKirtasiyeIleIlgiliAlanlarinAcildiginiDogrular() {
    }

    @And("kullanici kirkambar linkine tiklar")
    public void kullaniciKirkambarLinkineTiklar() {
    }

    @And("kullanici temali ve lisansli urunler alaninin acildigini dogrular")
    public void kullaniciTemaliVeLisansliUrunlerAlanininAcildiginiDogrular() {
    }

    @And("kullanici tum kategoriler linkine tiklar")
    public void kullaniciTumKategorilerLinkineTiklar() {
    }

    @And("kullanici tum kategori seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciTumKategoriSeceneklerininGorunurOldugunuDogrular() {
    }

    @And("kullanici kampanyalar linkine tiklar")
    public void kullaniciKampanyalarLinkineTiklar() {
    }

    @And("kullanici one cikan kampanyalari goruntuler")
    public void kullaniciOneCikanKampanyalariGoruntuler() {
    }

    @And("kullanici puan katalogu linkine tiklar")
    public void kullaniciPuanKataloguLinkineTiklar() {
    }

    @When("kullanici puan katalogu sayfasinin acildigini dogrular")
    public void kullaniciPuanKataloguSayfasininAcildiginiDogrular() {
    }
}
