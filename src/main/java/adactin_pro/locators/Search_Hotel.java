package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Search_Hotel extends Base {
	public Search_Hotel(WebDriver sh) {
		this.nv=sh;
		
		PageFactory.initElements(nv, this);
	}

	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement vf_Loged;
	public WebElement getVf_Loged() {
		return vf_Loged;
	}
	
	
	
	@FindBy(id="location")
	private WebElement Loc;
	public WebElement getLoc() {
		return Loc;
	}

	
	@FindBy(id="hotels")
	private WebElement Hot;
	public WebElement getHot() {
		return Hot;
	}
	
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement rtyp;
	public WebElement getRtyp() {
		return rtyp;
	}
	
    @FindBy(xpath="(//select[@class='search_combobox'])[4]")
    private WebElement no_R;
	public WebElement getNo_R() {
		return no_R;
	}
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement Chc_in;
	public WebElement getChc_in() {
		return Chc_in;
	}
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement Chc_Outl;
	public WebElement getChc_Outl() {
		return Chc_Outl;
	}

	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private WebElement A_per;
	public WebElement getA_per() {
		return A_per;
	}
	

	@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	private WebElement C_per;
	public WebElement getC_per() {
		return C_per;
	}
	
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath="//span[contains(text(),'shall be before')]")
	private WebElement err;
	public WebElement getErr() {
		return err;
	}
	
	
	
}
