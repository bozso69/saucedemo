package tests;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.artsok.RepeatedIfExceptionsTest;
import page.nyitoOldal;

public class nyitoOldalTest {
	WebDriver driver = new ChromeDriver();
	
	@RepeatedIfExceptionsTest(repeats = 1)
	//@Test
	@Tag("FooldalTest")
	@Tag("Regression")
	@Tag("ZoltanTest")
	@Order(1)	
	// @Disabled()
	@DisplayName("S02 - Fő oldal szöveg teszt")
    void SauD_02() {
		
//*1*/ - A nyitó oldal betöltése
		
		driver.get("https://www.saucedemo.com/");
		nyitoOldal nyitoOldal = new nyitoOldal(driver);
		
//*2*/ - Az oldalon megjelenő szövegek ellenőrzése
		
		List<String> expectedTextsOnWindow = new ArrayList<>();
		expectedTextsOnWindow.add("Username");	
		expectedTextsOnWindow.add("Password");	
		expectedTextsOnWindow.add("Accepted usernames are:");		
		expectedTextsOnWindow.add("standard_user");		
		expectedTextsOnWindow.add("locked_out_user");
		expectedTextsOnWindow.add("problem_user");
		expectedTextsOnWindow.add("performance_glitch_user");
		expectedTextsOnWindow.add("Login");
		expectedTextsOnWindow.add("Password for all users:");
		expectedTextsOnWindow.add("secret_sauce");
		
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		driver.quit();
    
	}
	
}
