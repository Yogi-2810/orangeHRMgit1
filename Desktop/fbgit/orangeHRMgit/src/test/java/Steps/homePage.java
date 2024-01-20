package Steps;

import org.openqa.selenium.By;

import BaseLayerPackage.BaseClass;
import io.cucumber.java.en.When;

public class homePage extends BaseClass {
	
	

	@When("user click on PIM")
	public void user_click_on_pim() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	   
	}

	@When("click on add employee")
	public void click_on_add_employee() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	   
	}

	@When("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
	  driver.findElement(By.name("firstName")).sendKeys("Nikita");
	  driver.findElement(By.name("lastName")).sendKeys("Patil");
	}

	@When("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}


}
