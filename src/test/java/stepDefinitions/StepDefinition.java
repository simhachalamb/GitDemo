package stepDefinitions;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.SignPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class StepDefinition {

	public WebDriver driver;

	@Given("^Initilizer to the browser$")
	public void initilizer_to_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("^Enter the details for First name and lastname and Email and password below data$")
	public void enter_the_details_for_first_name_and_lastname_and_email_and_password_below_data(DataTable table) throws Throwable {
		SignPage sp = new SignPage(driver);
		List<List<String>> tableValue = table.raw();


		sp.getFirstName().sendKeys(tableValue.get(0).get(0));
		sp.getLastName().sendKeys(tableValue.get(0).get(1));
		sp.getEmail().sendKeys(tableValue.get(0).get(2));
		sp.getCreatePassword().sendKeys(tableValue.get(0).get(3));
		sp.getConfirmPassword().sendKeys(tableValue.get(0).get(4));
		sp.getCompanyName().click();

		String actualfirstNameError = sp.getFirstNameErrorMessage().getText();
		String exceptesFirstNameError = "First name is not valid";
		Assert.assertEquals(actualfirstNameError, exceptesFirstNameError);
		System.out.println("firstNameErrormatched");
		String actualLaststNameError = sp.getLastNameErrorMessage().getText();
		String exceptedLaststNameError = "Last name is not valid";
		Assert.assertEquals(actualLaststNameError, exceptedLaststNameError);
		System.out.println("LaststNameErrormatched");
		String actualEmailError = sp.getEmailErrorMessage().getText();
		String exceptedEmailError = "Invalid email.";
		Assert.assertEquals(actualEmailError, exceptedEmailError);
		System.out.println("EmailErrorMatched");
		String actualCreatePasswordError = sp.getCreatePasswordErrorMessage().getText();
		String exceptedCreatePasswordError = "Password is not valid";
		Assert.assertEquals(actualCreatePasswordError, exceptedCreatePasswordError);
		System.out.println("CreatePasswordErrorMatched");
		String actualConfirmPasswordError = sp.getConfirPasswordErrorMessage().getText();
		String exceptedConfirmPasswordError = "Passwords do not match";
		Assert.assertEquals(actualConfirmPasswordError, exceptedConfirmPasswordError);
		System.out.println("ConfirmPasswordErrorMatched");
		Thread.sleep(6000);
		String actualCompanyError = sp.getCompanyNameErrorMessage().getText();
		String exceptCompanyError = "Company Name is required";
		Assert.assertEquals(actualCompanyError, exceptCompanyError);
		System.out.println("CompanyErrorMatched");
		System.out.println("First Time");
		Thread.sleep(3000);

		sp.getFirstName().clear();    	
		sp.getFirstName().sendKeys(tableValue.get(1).get(0));
		sp.getLastName().clear();
		sp.getLastName().sendKeys(tableValue.get(1).get(1));
		sp.getEmail().clear();
		sp.getEmail().sendKeys(tableValue.get(1).get(2));
		sp.getCreatePassword().clear();
		sp.getCreatePassword().sendKeys(tableValue.get(1).get(3));
		sp.getConfirmPassword().clear();
		sp.getConfirmPassword().sendKeys(tableValue.get(1).get(4));
		sp.getCompanyName().clear();
		sp.getCompanyName().sendKeys(tableValue.get(1).get(5));
		System.out.println("second Time");
		//Thread.sleep(3000);

		sp.getFirstName().clear();    	
		sp.getFirstName().sendKeys(tableValue.get(2).get(0));
		sp.getLastName().clear();
		sp.getLastName().sendKeys(tableValue.get(2).get(1));
		sp.getEmail().clear();
		sp.getEmail().sendKeys(tableValue.get(2).get(2));
		sp.getCreatePassword().clear();
		sp.getCreatePassword().sendKeys(tableValue.get(2).get(3));
		sp.getConfirmPassword().clear();
		sp.getConfirmPassword().sendKeys(tableValue.get(2).get(4));
		sp.getCompanyName().clear();
		sp.getCompanyName().sendKeys(tableValue.get(2).get(5));
		System.out.println("Third Time");
		//Thread.sleep(3000);
	}    

	@Then("^select anything form industry drop down and product dropdown$")
	public void select_anything_form_industry_drop_down_and_product_dropdown() throws Throwable {
		Select industryDropDown = new Select(driver.findElement(By.name("Select industry")));
		Select productDropDown = new Select(driver.findElement(By.cssSelector(".hear.form-control.login-input.ng-untouched.ng-pristine.ng-invalid")));
		industryDropDown.selectByIndex(3);
		productDropDown.selectByIndex(3);
	}

	@Then("^select next button and back Button$")
	public void select_next_button_and_back_button() throws Throwable {
		SignPage sp = new SignPage(driver);
		sp.getNextButton().click();
		System.out.println("clicked Next Button");
		sp.getbackButton().click();
		System.out.println("clicked Back Button");
	}

	@And("^Navigate to the \"([^\"]*)\" site$")
	public void navigate_to_the_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@Then("^app will close;$")
	public void app_will_close() throws Throwable {
		System.out.println("Done");
		driver.quit();
	}

}