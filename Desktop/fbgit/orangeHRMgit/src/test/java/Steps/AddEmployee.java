package Steps;

import org.openqa.selenium.By;

import BaseLayerPackage.BaseClass;
import io.cucumber.java.en.When;

public class AddEmployee extends BaseClass{

	@When("user is on PIM page")
	public void user_is_on_pim_page() {
	    
	}

	@When("Click Add Employee")
	public void click_add_employee() {
	    
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}

	@When("Enter Creditionals of new Employee")
	public void enter_creditionals_of_new_employee() {
	    driver.findElement(By.name("firstName")).sendKeys("vishal");
	    driver.findElement(By.name("lastName")).sendKeys("patil");
		
	}

	@When("Click on save Button")
	public void click_on_save_button() {
	    driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

}
