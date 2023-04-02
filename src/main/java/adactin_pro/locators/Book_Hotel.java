package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Book_Hotel extends Base{
	
	public Book_Hotel(WebDriver bh) {
		this.nv=bh;
		PageFactory.initElements(nv,this);	
	}
	
	@FindBy(xpath = "(//input[@class='reg_input'])[1]")
	private WebElement First_nm;
	public WebElement getFirst_nm() {
		return First_nm;
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement Last_nm;
	public WebElement getLast_nm() {
		return Last_nm;
	}
	
	@FindBy(id= "address")
	private WebElement Addr;
	public WebElement getAddr() {
		return Addr;
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement Cc_no;
	public WebElement getCc_no() {
		return Cc_no;
	}
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement Cc_typ;
	public WebElement getCc_typ() {
		return Cc_typ;
	}
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement Exp_mon;
	public WebElement getExp_mon() {
		return Exp_mon;
	}
	
	@FindBy(xpath ="(//select[@class='select_combobox2'])[2]")
	private WebElement Exp_yr;
	public WebElement getExp_yr() {
		return Exp_yr;
	}

	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	private WebElement Cvv;
	public WebElement getCvv() {
		return Cvv;
	}
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;
	public WebElement getBook() {
		return book;
	}
	
	@FindBy(xpath = "//input[@name='total_price_dis']")
	private WebElement Tot_Price;
	public WebElement getTot_Price() {
		return Tot_Price;
	}
	
	@FindBy(xpath="(//input[@class='disable_text'])[9]")
	private WebElement Bill_Price;
	public WebElement getBill_Price() {
		return Bill_Price;
	}
	

}
