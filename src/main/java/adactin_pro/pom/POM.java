package adactin_pro.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import adactin_pro.base.Base;
import adactin_pro.locators.Book_Confirm;

import adactin_pro.locators.Book_Hotel;
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
	
	private Book_Hotel b_h;
	public Book_Hotel getB_h() {
		if(b_h==null) {
			b_h= new Book_Hotel(nv);
		}
		return b_h;
	}
	
	private Book_Confirm b_c;
	
	public Book_Confirm getB_c() {
		if(b_c==null) {
			b_c= new Book_Confirm(nv);
		}
		return b_c;
	}
	
	
	
	
}
