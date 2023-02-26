package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import page.nyitoOldal;



public class smokeTest {
	WebDriver driver = new ChromeDriver();
	
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	//@RepeatedIfExceptionsTest(repeats = 1)
	@Test
	@Tag("FooldalTest")
	@Tag("ZoltanTest")
	@Tag("Regression")
	@Tag("SmokeTest")
	@Order(1)	
	// @Disabled()
	@DisplayName("S01 - Smoke Test ")
	void smoke() {
		driver.get("https://www.saucedemo.com/");
		nyitoOldal nyitoOldal = new nyitoOldal(driver);
		

		SoftAssertions contentAssert = new SoftAssertions();	
		contentAssert.assertThat(nyitoOldal.gettxtAcceptUser().getText())
				.isEqualToIgnoringCase("Accepted usernames are:");
		
		contentAssert.assertAll();
		
    	
    	
		
		driver.quit();
	}
	
	
}
