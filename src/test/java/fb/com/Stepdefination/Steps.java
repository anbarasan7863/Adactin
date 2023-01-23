package fb.com.Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseClass{

	PageObjectManager obj=new PageObjectManager(driver);
	
	@Given("User Launch {string} Browser")
	public void user_launch_browser(String string) {
browserLaunch(string);
	}

	@Given("User naviagte Url {string}")
	public void user_naviagte_url(String string) {
getUrl(string);
	}

	@Given("User Verify page land on login page")
	public void user_verify_page_land_on_login_page() {
Assert.assertTrue(elementIsDisplayed(obj.getLoginPage().getFB_logo()));
	}

	@Given("User Enter Valid Username {string}")
	public void user_enter_valid_username(String string) {
elementSendKeys(obj.getLoginPage().getUsername(), string);
	}

	@Given("User Enter Valid Password {string}")
	public void user_enter_valid_password(String string) {
		elementSendKeys(obj.getLoginPage().getPassword(), string);
	}

	@Given("User Click Login Button")
	public void user_click_login_button() {
elementClick(obj.getLoginPage().getLogin_btn());
	}

	@Then("User Verify loged in Successfull")
	public void user_verify_loged_in_successfull() {

	}

	@Given("Verify land on loginPage")
	public void verify_land_on_login_page() {
	   
	    Assert.assertTrue(elementIsDisplayed(obj.getLoginPage().Adactin_logo));
	}
	@Given("User Enter UserName {string}")
	public void user_enter_user_name(String string) {
	   elementSendKeys(obj.getLoginPage().Adactin_Username, string);
	    
	}
	@Given("User Enter PassWord {string}")
	public void user_enter_pass_word(String string) {
		 elementSendKeys(obj.getLoginPage().Adactin_Password, string);
	    
	}
	@Given("User Click login button")
	public void user_click_Login_button() {
elementClick(obj.getLoginPage().Adactin_login_Btn);	    
	}
	@Then("User Verify Error Message {string}")
	public void user_verify_error_message(String string) {
	  // Assert.assertEquals(string, getText(obj.getLoginPage().Adactin_login_err));
	    Assert.assertTrue(getText(obj.getLoginPage().Adactin_login_err).startsWith(string));
	}
	
}
