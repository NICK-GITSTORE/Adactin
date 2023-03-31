package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Select_Hotel extends Base{

	public Select_Hotel(WebDriver slh) {
		this.nv=slh;
		PageFactory.initElements(nv, this);
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement Vf_Select_Hot;
	public WebElement getVf_Select_Hot() {
		return Vf_Select_Hot;
	}

	@FindBy(xpath="(//input[@value='Hotel Creek'])[1]")
	private WebElement Vf_Hotel;
	public WebElement getVf_Hotel() {
		return Vf_Hotel;
	}
	
	@FindBy(xpath="(//input[@value='27/03/2023'])[1]")
	private WebElement Vf_Checkin;
	public WebElement getVf_Checkin() {
		return Vf_Checkin;
	}
	
	@FindBy(xpath="(//input[@value='29/03/2023'])[1]")
	private WebElement Vf_Checkout;
	public WebElement getVf_Checkout() {
		return Vf_Checkout;
	}
	
	@FindBy(xpath="(//input[@value='1 Rooms'])[1]")
	private WebElement Vf_Room;
	public WebElement getVf_Room() {
		return Vf_Room;
	}
	
	@FindBy(xpath="(//input[@value='Standard'])[1]")
	private WebElement Vf_Room_Type;
	public WebElement getVf_Room_Type() {
		return Vf_Room_Type;
	}
	
	@FindBy(xpath="//input[@value='AUD $ 260']")
	private WebElement Vf_Price;
	public WebElement getVf_Price() {
		return Vf_Price;
	}
	
	@FindBy(xpath="//input[@value='2 Days']")
	private WebElement Vf_No_Days;
	public WebElement getVf_No_Days() {
		return Vf_No_Days;
	}
	
	@FindBy(xpath="//input[@value='AUD $ 125']")
	private WebElement Vf_Per_Night;
	public WebElement getVf_Per_Night() {
		return Vf_Per_Night;
	}
	
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement Click_Rad;
	public WebElement getClick_Rad() {
		return Click_Rad;
	}
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement Click_Cont;
	public WebElement getClick_Cont() {
		return Click_Cont;
	}
	
	
	
	
}