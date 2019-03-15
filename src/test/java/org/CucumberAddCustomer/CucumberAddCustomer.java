package org.CucumberAddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CucumberAddCustomer {
	
	static WebDriver driver;
	@Given("The user is in add customer page")
	public void Customerpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhu\\CucumberGowthaman\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");

	}

	@When("The user fill in the customer details")
	public void customerdetails() {
	   driver.findElement(By.id("fname")).sendKeys("gowthaman");
	   driver.findElement(By.id("lname")).sendKeys("Manoharan");
	   driver.findElement(By.id("email")).sendKeys("gowtham@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("chennai");
	   driver.findElement(By.id("telephoneno")).sendKeys("345678765");;
	 }
	

	@When("The user clicks the submit button")
	public void submitbutton() {
	    driver.findElement(By.name("submit")).click();
	 }
	@Then("The user should see the success message")
	public void SuccessMessage() {
	 Assert.assertEquals("Please Note Down Your CustomerID", driver.findElement(By.xpath("//table//tr[2]//b")).getText());	 
	}

	@Then("The user should see the customer ID")
	public void Customerid() {
		Assert.assertTrue(driver.findElement(By.xpath("//table//tr[1]//b")).isDisplayed());
	}

}
