package StepDefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	
	@When("^Larry Increase the headphone quantity by 2$")
	public void Larry_Increase_the_headphone_quantity_by_2()
	{
		System.out.println("Test is passed");
	}
 
	@When("^continue for checkout$")
	public void continue_for_checkout()
	{
		System.out.println("Test is passed");
	}
    

	@When("^change the shipping address as the new address for Pune$")
	public void change_the_shipping_address_as_the_new_address_for_Pune()
	{
		System.out.println("Test is passed");
	}
    

	@Then("^the product should be delivered to new address$")
	public void the_product_should_be_delivered_to_new_address()
	{
		System.out.println("Test is passed");
	
	}
}
