package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import page.nyitoOldal;



public class smokeTest {
	WebDriver driver = new ChromeDriver();
	
	
	@RepeatedIfExceptionsTest(repeats = 1)
	//@Test
	@Tag("FooldalTest")
	@Tag("Regression")
	@Tag("SmokeTest")
	@Order(1)	
	// @Disabled()
	@DisplayName("S01 - Smoke Test ")
	void smoke() {
		/*Nyitó oldal megnyílik. „Accepted usernames are:” szöveg 
		 * megjelenik az oldalon. 
		 */
		driver.get("https://www.saucedemo.com/");
		nyitoOldal nyitoOldal = new nyitoOldal(driver);
	
		/*„Accepted usernames are:” szöveg megjelenik az oldalon. */
		
		SoftAssertions contentAssert = new SoftAssertions();	
		contentAssert.assertThat(nyitoOldal.gettxtAcceptUser().getText())
				.isEqualToIgnoringCase("Accepted usernames are:");
		contentAssert.assertAll();
		
		driver.quit();
	}
	
	
}
