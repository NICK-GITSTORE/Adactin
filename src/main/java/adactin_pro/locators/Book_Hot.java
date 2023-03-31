package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Book_Hot extends Base{
	
	public Book_Hot(WebDriver bh) {
		this.nv=bh;
		PageFactory.initElements(nv, this);
	}

	@FindBy(xpath="(//input[@value='Hotel Creek'])[1]")
	private WebElement Vf_Hotel;
	public WebElement getVf_Hotel() {
		return Vf_Hotel;
	}
	
	
}
