package Steps;

import org.openqa.selenium.By;


import BaseLayerPackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationClass extends BaseClass{

	
	

@Given("user is on login page")
public void user_is_on_login_page() {
	
	BaseClass.initialization();
   
}

@When("user add credentials username and password")
public void user_add_credentials_username_and_password() {
   
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	
}

@When("click on login button")
public void click_on_login_button() {
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
}


}
