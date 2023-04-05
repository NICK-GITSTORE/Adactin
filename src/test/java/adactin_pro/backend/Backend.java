package adactin_pro.backend;



import org.junit.Assert;

import adactin_pro.base.Base;
import adactin_pro.locators.Login;
import adactin_pro.pom.POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Backend extends Base{
	
	
    POM ob= new POM(nv);
    
	@Given("User Launch Browser {string}")
	public void user_launch_browser(String string) {
	    Launching(string);
	}
	@Given("User Navigate to Url {string}")
	public void user_navigate_to_url(String string) {
	    Opening(string);
	    
	}
	
	
	@Then("User Enter UserName {string}")
	public void user_enter_user_name(String string) {
	    Sending(ob.getlg().getUser(),string);
	    
	}
	@Then("User Enter Password {string}")
	public void user_enter_password(String string) {
	    Sending(ob.getlg().getPass(), string);
	    
	}
	@Then("Click Login Button")
	public void click_login_button() {
	    Clicking(ob.getlg().getLogin());
	    
	}
	@Then("User Close the Browser")
	public void user_close_the_browser() {
		Waiting();
		Closing();
	     
	}
	
	@Then("User Verify logedin Page")
	public void user_verify_logedin_page() {
	   Assert.assertTrue(IsDis(ob.getSh().getVf_Loged()));
	    
	}
	@Then("User Select Location {string}")
	public void user_select_location(String string) {
	   Selecting(ob.getSh().getLoc(), string);
	}
	@Then("User Select Hotel {string}")
	public void user_select_hotel(String string) {
	  Selecting(ob.getSh().getHot(), string);
	}

	@Then("User Select Roomtype {string}")
	public void user_select_roomtype(String string) {
	    Selecting(ob.getSh().getRtyp(), string);
	}
	@Then("User Select No of rooms {string}")
	public void user_select_no_of_rooms(String string) {
	    Selecting(ob.getSh().getNo_R(), string);
	}
	
	@Then("User Enter Checkin Date {string}")
	public void user_enter_checkin_date(String string) {
	    Clearing(ob.getSh().getChc_in());
	    Waiting();
		Sending(ob.getSh().getChc_in(), string);
	}
	@Then("User Enter Checkout Date {string}")
	public void user_enter_checkout_date(String string) {
		Clearing(ob.getSh().getChc_Outl());
		Waiting();
	    Sending(ob.getSh().getChc_Outl(), string);
	}
	@Then("User Click the Search Button")
	public void user_click_the_search_button() {
	    Clicking(ob.getSh().getSubmit());
	}
	@Then("User Verify Error Message")
	public void user_verify_error_message() {
	    Assert.assertTrue(IsDis(ob.getSh().getErr()));
	}
	

	@Then("User Select Adults Per Room {string}")
	public void user_select_adults_per_room(String string) {
	    ob.getSh().getA_per().click();
	}
	@Then("User Select Childrens Per Room {string}")
	public void user_select_childrens_per_room(String string) {
	    ob.getSh().getC_per().click();
	}
	
	@Then("User Verify Select Hotel page")
	public void user_verify_select_hotel_page() {
	    Assert.assertTrue(IsDis(ob.getSlh().getVf_Select_Hot()));
	}
	
	@Then("User Verify Hotel Name")
	public void user_verify_hotel_name() {
	    Assert.assertTrue(ob.getSlh().getVf_Hotel().getAttribute("value").equalsIgnoreCase("hotel sunshine"));
	}
	  	  
	@Then("User Verify Checkout date")
	  public void user_verify_checkout_date() {
	  		 Assert.assertTrue(ob.getSlh().getVf_Checkout().getAttribute("value").equals("10/04/2023"));
	 }

	
    @Then("User Verify Checkin date")
	public void user_verify_checkin_date() {
		Assert.assertTrue(ob.getSlh().getVf_Checkin().getAttribute("value").equals("05/04/2023"));
	}
    
    @Then("User Verify No of Rooms")
    public void user_verify_no_of_rooms() {
        Assert.assertTrue(ob.getSlh().getVf_Room().getAttribute("value").equals("2 Rooms"));
    }
    
    @Then("User Verify Room Type")
    public void user_verify_room_type() {
      Assert.assertTrue(ob.getSlh().getVf_Room_Type().getAttribute("value").equals("Standard"));

}
    @Then("User Verify Price")
    public void user_verify_price() {
    	
    	String a[]= ob.getSlh().getVf_Price().getAttribute("value").split(" ");
    	int ab =Integer.parseInt(a[2]);
    	
    	String b[]=ob.getSlh().getVf_Room().getAttribute("value").split(" ");
    	int bc =Integer.parseInt(b[0]);
    	
    	String c[]=ob.getSlh().getVf_No_Days().getAttribute("value").split(" ");
    	int cd =Integer.parseInt(c[0]);
    	
    	String d[]=ob.getSlh().getVf_Per_Night().getAttribute("value").split(" ");
    	int de =Integer.parseInt(d[2]);
    	
    	
    	
    	
       if(ab== bc*cd*de) {
    	   System.out.println("price ok");
       }
       else
    	   System.out.println("not ok");
    }
    
    @Then("User Click Radio Button")
    public void user_click_radio_button() {
        ob.getSlh().getClick_Rad().click();
    }
    @Then("User Click Continue Button")
    public void user_click_continue_button() {
        ob.getSlh().getClick_Cont().click();
    }
    @Then("User Enter First Name {string}")
    public void user_enter_first_name(String string) {
       ob.getB_h().getFirst_nm().sendKeys(string);
    }
    @Then("User Enter Last Name {string}")
    public void user_enter_last_name(String string) {
       ob.getB_h().getLast_nm().sendKeys(string);
    }
    @Then("User Enter Billing Address {string}")
    public void user_enter_billing_address(String string) {
        ob.getB_h().getAddr().sendKeys(string);
    }
    @Then("User Enter Credit Card No {string}")
    public void user_enter_credit_card_no(String string) {
        ob.getB_h().getCc_no().sendKeys(string);
    }
    @Then("User Select Credit Card Type {string}")
    public void user_select_credit_card_type(String string) {
        Selecting(ob.getB_h().getCc_typ(), string);
    }
    @Then("User Select Expiry Month {string}")
    public void user_select_expiry_month(String string) {
        Selecting(ob.getB_h().getExp_mon(), string);
    }
    @Then("User Select Expiry Year {string}")
    public void user_select_expiry_year(String string) {
        Selecting(ob.getB_h().getExp_yr(), string);
    }
    @Then("User Enter CVV {string}")
    public void user_enter_cvv(String string) {
        ob.getB_h().getCvv().sendKeys("123");
    }
    
    @Then("User Click Book Now")
    public void user_click_book_now() {
        ob.getB_h().getBook().click();
    }
    
    @Then("User Click Logout")
    public void user_click_logout() {
       ob.getB_c().getL_out().click();
    }
    
    @Then("User Verify Billed Price")
    public void user_verify_billed_price() {
       String c[] = ob.getB_h().getTot_Price().getAttribute("value").split(" ");
       float tt= Float.parseFloat(c[2]);
       
       String b[]=ob.getB_h().getBill_Price().getAttribute("value").split(" ");
       float ss= Float.parseFloat(b[2]);
       
       if(tt*110/100 == ss) {
    	   System.out.println("Billed amount is 10% extra of Total price");
       } else
    	   System.out.println("Not verified");
       
    }

   
    
}




