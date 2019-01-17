/*
package ro.sapientia.mesteri2015.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SCRUMSprintDeleteStepDefinition {

	protected WebDriver driver;

	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}

	@Given("^I delete the scrum list's first story$")
	public void I_delete_the_scrum_list_s_first_story() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/");
	}

	@When("^I select the first element in  the title textbox and I push the delete button$")
	public void I_select_the_first_element_in_the_title_textbox_and_I_push_the_delete_button(String updateTitle) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		WebElement firstItem = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[1]/a"));
		firstItem.click();
		//driver.wait(1000);
		WebElement deleteButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/a[2]"));
		deleteButton.click();
		//driver.wait(1000);
		WebElement deleteStoryButton = driver.findElement(By.id("delete-story-button"));
		deleteStoryButton.click();	
	}
	

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
*/
