package adactin_pro.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin_pro.base.Base;

public class Book_Confirm extends Base{
	public Book_Confirm(WebDriver bc) {
		this.nv=bc;
		PageFactory.initElements(nv,this);
	}
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement l_out;
	public WebElement getL_out() {
		return l_out;
	}

}
