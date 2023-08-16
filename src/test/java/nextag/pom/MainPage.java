package nextag.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	protected WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//label[normalize-space()='Asset Tagging']")
	protected WebElement txtMainPage;
	
	@FindBy(xpath = "//div[normalize-space()='USER001']")
	protected WebElement txtUsername;
	
	@FindBy(xpath = "//div[normalize-space()='Super Admin']")
	protected WebElement txtNameUser;

	public String getTextMainPage() {
		return txtMainPage.getText();
	}
	
	@FindBy(xpath = "(//img[@alt='right'])[1]")
	protected WebElement btnLockSidebar;
	
	public void clickBtnLockSidebar() {
		btnLockSidebar.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Beranda']")
	protected WebElement btnBeranda;
	
	public void clickBtnBeranda() {
		btnBeranda.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Pemilik Aset']")
	protected WebElement btnPemilikAset;
	
	public void clickBtnPemilikAset() {
		btnPemilikAset.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Akun BTL']")
	protected WebElement btnAkunBTL;
	
	public void clickBtnAkunBTL() {
		btnAkunBTL.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Peran']")
	protected WebElement btnPeran;
	
	public void clickBtnPeran() {
		btnPeran.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Data Group']")
	protected WebElement btnDataGroup;
	
	public void clickBtnDataGroup() {
		btnDataGroup.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Pengguna']")
	protected WebElement btnPengguna;
	
	public void clickBtnPengguna() {
		btnPengguna.click();
	}
	
	@FindBy(xpath = "//label[normalize-space()='Pengaturan']")
	protected WebElement btnPengaturan;
	
	public void clickBtnPengaturan() {
		btnPengaturan.click();
	}
	
	@FindBy(xpath = "//p[normalize-space()='Keluar']")
	protected WebElement btnLogout;
	
	public void clickBtnLogout() {
		btnLogout.click();
	}
	
	public BerandaPage clickBeranda() {
		clickBtnBeranda();
		BerandaPage berandaPage = PageFactory.initElements(driver, BerandaPage.class);
		
		return berandaPage;
	}
	
	public PemilikAsetPage clickPemilikAset() {
		clickBtnPemilikAset();
		PemilikAsetPage pemilikAsetPage = PageFactory.initElements(driver, PemilikAsetPage.class);
		
		return pemilikAsetPage;
	}
	
	public AkunBTLPage clickAkunBTL() {
		clickBtnAkunBTL();
		AkunBTLPage akunBTLPage = PageFactory.initElements(driver, AkunBTLPage.class);
		
		return akunBTLPage;
	}
	
	public PeranPage clickPeran() {
		clickBtnPeran();
		PeranPage peranPage = PageFactory.initElements(driver, PeranPage.class);
		
		return peranPage;
	}
	
	public DataGroupPage clickDataGroup() {
		clickBtnDataGroup();
		DataGroupPage dataGroupPage = PageFactory.initElements(driver, DataGroupPage.class);
		
		return dataGroupPage;
	}
	
	public PenggunaPage clickPengguna() {
		clickBtnPengguna();
		PenggunaPage penggunaPage = PageFactory.initElements(driver, PenggunaPage.class);
		
		return penggunaPage;
	}
	
	public PengaturanPage clickPengaturan() {
		clickBtnPengaturan();
		PengaturanPage pengaturanPage = PageFactory.initElements(driver, PengaturanPage.class);
		
		return pengaturanPage;
	}
}
