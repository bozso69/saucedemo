package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nyitoOldal {

	WebDriver driver;
	
//*****************Bevitelei mezők	
	
	@FindBy(id = "user-name")
	WebElement userName;
	
	@FindBy(id = "user-name")
	WebElement txtUserName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement btnLogin;
	
//********************Logok
	@FindBy(xpath = "//div[@class='login_logo']")
	WebElement picLogo;
	
	@FindBy(xpath = "//div[@class='bot_column']")
	WebElement picbabu;
	
//**********************Felíratok
	@FindBy(xpath = "//h4[normalize-space()='Accepted usernames are:']")
	WebElement txtAcceptUser;
	
	@FindBy(xpath = "//h4[normalize-space()='Password for all users:']")
	WebElement txtPassword;

	

	
    public nyitoOldal(WebDriver driver) {
    	super();
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    	
    }
    public void clickLoginButton() {
    	btnLogin.click();
    }
    
    public void setUerName() {
    	userName.sendKeys("standard_user");
    }
    
    public void setPassword() {
    	password.sendKeys("secret_sauce");
    }
    
    public WebElement gettxtAcceptUser() {

    	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAcceptUser));
		
		
		System.out.println("*********************");
		System.out.println(txtAcceptUser.getText());

		
		return element;
    }
}

