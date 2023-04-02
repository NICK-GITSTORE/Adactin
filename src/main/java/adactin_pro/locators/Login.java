package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Login extends Base{
	
	public Login(WebDriver lg) {
	this.nv=lg;
	PageFactory.initElements(nv,this);
	
	
	}
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")
	private WebElement user;
	public WebElement getUser() {
		return user;
	}

	@FindBy(xpath="(//input[@class='login_input'])[2]")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
}
