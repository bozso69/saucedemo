package tests;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.nyitoOldal;




public class loginTest {
	WebDriver driver = new ChromeDriver();
	
	
	@DisplayName("Login - 06")
	//@Tag("ZoltanTest")
	@Test
    void login(){
    	driver.get("https://www.saucedemo.com/");
    	nyitoOldal loginOldal = new nyitoOldal(driver);

    	/*
    	loginOldal.setUerName();
    	loginOldal.setPassword();
    	loginOldal.clickLoginButton();
    	
    	//driver.quit();  
    	
    	*/
    }
  

    
   
    


}
