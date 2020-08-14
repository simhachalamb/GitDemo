package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class SignPage {

	public WebDriver driver;

	public SignPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.xpath("//input[@placeholder='First Name']");
	By firstNameErrorMessage = By.xpath("//div[text()=' First name is not valid ']");

	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By lastNameErrorMessage = By.xpath("//div[text()=' Last name is not valid ']");

	By email = By.xpath("//input[@placeholder='Email']");
	By emailErrormessage = By.xpath("//div[text()=' Invalid email. ']");

	By create_password = By.xpath("//input[@placeholder='Create Password']");
	By create_password_errorMessage = By.xpath("//div[text()=' Password is not valid ']");
	By create_password_hideIcon = By.xpath("//img[@toggle='#password-field']");

	By confirm_password = By.xpath("//input[@placeholder='Confirm Password']");
	By confirm_password_Errormessage = By.xpath("//div[text()=' Passwords do not match ']");
	By confirm_Password_HideIcon = By.xpath("//img[@toggle='#confirmPassword']");

	By company_Name = By.xpath("//input[@placeholder='Company Name']");
	By companyNameErrorMessage = By.xpath("//div[text()=' Company Name is required ']");

	By next_button = By.cssSelector(".btn.btn-green");

	By backtoLogInButton = By.xpath("//div[@class='back-login']/a");

	/*Select industryDropDown = new Select(driver.findElement(By.name("Select industry")));
	Select productDropDown = new Select(driver.findElement(By.cssSelector(".hear.form-control.login-input.ng-untouched.ng-pristine.ng-invalid")));*/

	public WebElement getFirstName(){
		return driver.findElement(firstName);
	}

	public WebElement getFirstNameErrorMessage(){
		return driver.findElement(firstNameErrorMessage);
	}

	public WebElement getLastName(){
		return driver.findElement(lastName);
	}

	public WebElement getLastNameErrorMessage(){
		return driver.findElement(lastNameErrorMessage);
	}

	public WebElement getEmail(){
		return driver.findElement(email);
	}

	public WebElement getEmailErrorMessage(){
		return driver.findElement(emailErrormessage);
	}

	public WebElement getCreatePassword(){
		return driver.findElement(create_password);
	}

	public WebElement getCreatePasswordErrorMessage(){
		return driver.findElement(create_password_errorMessage);
	}

	public WebElement getCreatePasswordHideIcon(){
		return driver.findElement(create_password_hideIcon);
	}

	public WebElement getConfirmPassword(){
		return driver.findElement(confirm_password);
	}

	public WebElement getConfirPasswordErrorMessage(){
		return driver.findElement(confirm_password_Errormessage);
	}

	public WebElement getConfirPasswordHideIcon(){
		return driver.findElement(confirm_Password_HideIcon);
	}

	public WebElement getCompanyName(){
		return driver.findElement(company_Name);
	}

	public WebElement getCompanyNameErrorMessage(){
		return driver.findElement(companyNameErrorMessage);
	}

	public WebElement getNextButton(){
		return driver.findElement(next_button);
	}

	public WebElement getbackButton(){
		return driver.findElement(backtoLogInButton);
	}


}
