package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends BaseClass {
	
	
	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //sessionId = dsad23424fsfs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@After
	public void postCondition() {
		driver.close();

	}
	

}
