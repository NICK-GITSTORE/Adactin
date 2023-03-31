package adactin_pro.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import adactin_pro.base.Base;
import adactin_pro.locators.Book_Hot;
import adactin_pro.locators.Login;
import adactin_pro.locators.Search_Hotel;
import adactin_pro.locators.Select_Hotel;

public class POM extends Base {
	
	public POM(WebDriver pm) {
		this.nv=pm;
	}

	private Login lg;
	public Login getlg() {
		if(lg==null) {
			lg= new Login(nv);
		}
		return lg;
	}
	
	private Search_Hotel sh;
	public Search_Hotel getSh() {
		if(sh==null) {
			sh= new Search_Hotel(nv);
		}
		return sh;
	}
	
	private Select_Hotel slh;
	

	public Select_Hotel getSlh() {
		if(slh==null) {
			slh= new Select_Hotel(nv);
		}
		return slh;
	}
	
	private Book_Hot bh;
	public Book_Hot getBh() {
		if(bh==null) {
			bh= new Book_Hot(nv);
		}
		return bh;
	}
	
	
	
}
