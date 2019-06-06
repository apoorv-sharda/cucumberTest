package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AllElements;
import properties.ReadPropertiesFile;


public class StepDefinitions extends AllElements
{
	
	//AllElements obj = new AllElements();
	ReadPropertiesFile obj1= new ReadPropertiesFile();
	
	
	
	@Given("^I want food in area$")
	public void i_want_food_in_area() throws IOException {
		
		
	 openBrowser();
	 url();
	 
	}
	
	@When("^I search for restaraunts$")
	public void i_search_for_restaraunts() throws IOException {
	    
		 areaCode.sendKeys((obj1).area());
		 submit.click();
	}

	@Then("^I should see some restaraunts in area$")
	public void i_should_see_some_restaraunts_in_area() {
		assertion();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	    
	    


	@Given("^when the user is on the area page$")
	public void when_the_user_is_on_the_area_page() {
	    WebElement box = driver.findElement(By.xpath("//ul[@class='c-sortBy-popoverList']//li[1]//label[1]"));
	    System.out.println("element is selected"+ box);
	    
	}

	@When("^the user selects sort by customer rating$")
	public void the_user_selects_sort_by_customer_rating() {
	    sort.click();
	    
	}

	@Then("^the user should see the list based on ratings$")
	public void the_user_should_see_the_list_based_on_ratings() {
		WebElement box = driver.findElement(By.xpath("//ul[@class='c-sortBy-popoverList']//li[1]//label[1]"));
	    System.out.println("element is selected"+ box);
	}

	@Given("^the user enters a wrong area code$")
	public void the_user_enters_a_wrong_area_code() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement location = driver.findElement(By.linkText("change location"));
	}

	@When("^user wants to change location$")
	public void user_wants_to_change_location() {
	    // Write code here that turns the phrase above into concrete actions
		location.click();
	    
	}

	@Then("^the user should be directed back to the homepage again$")
	public void the_user_should_be_directed_back_to_the_homepage_again() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
	    
	}

}
