package nextag.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@class='Login_Title__opLTr']")
	protected WebElement txtLogin;

	public String getTextLogin() {
		return txtLogin.getText();
	}

	@FindBy(id = "username")
	protected WebElement inputUsername;

	@FindBy(id = "password")
	protected WebElement inputPassword;
	
	@FindBy(xpath = "//span[@class='ant-input-suffix']")
	protected WebElement btnViewPassword;
	
	public void clickViewPassword() {
		btnViewPassword.click();
	}
	
	@FindBy(xpath = "//button[@type='button']")
	protected WebElement btnForgotPassword;
	
	public void clickForgotPassword() {
		btnForgotPassword.click();
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement btnLogin;
	
	public void clickLogin() {
		btnLogin.click();
	}

	public MainPage loginToMainPage(String inUser, String inPass) {
		inputUsername.clear();
		inputUsername.sendKeys(inUser);
		inputPassword.clear();
		inputPassword.sendKeys(inPass);
		return PageFactory.initElements(driver, MainPage.class);
	}

	public MainPage loginToMainPage() {
		inputUsername.clear();
		inputUsername.sendKeys("");
		inputPassword.clear();
		inputPassword.sendKeys("");
		btnLogin.click();
		return PageFactory.initElements(driver, MainPage.class);
	}
}
