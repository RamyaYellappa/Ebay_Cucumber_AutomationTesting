package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPages.ScenarioPage2;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ScenarioStepsPOM2 {

	
	WebDriver driver=null;
	ScenarioPage2 sp2;
	String result;
	WebElement element;
    
    
	@Before
	public void browsersetup() {
		
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		System.out.println("Browser setup");
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("User is on Ebay Ecommerce page");
        String Actualtitle=driver.getTitle();
        Assert.assertEquals(Actualtitle, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	  
	}
	
	@When("User should type MacBook in the search bar")
	public void user_should_type_mac_book_in_the_search_bar() {
		sp2=new ScenarioPage2(driver);
		sp2.SearchField();	   
	}

	@And("User able to change the search category to Computers Tablets & Networking")
	public void user_able_to_change_the_search_category_to_computers_tablets_networking() {
		sp2.SelectCategory();
	}

	@And("Click on Search")
	public void click_on_search() {
		sp2.Search();	   
	}

	@Then("Verify that the page loads completely")
	public void verify_that_the_page_loads_completely() {
		WebElement element=driver.findElement(sp2.Heading);
		String ActualResult=element.getText();
		System.out.println("Heading was :"+ActualResult);
		driver.getPageSource().contains("Macbook");
		
		String expectedSearchString = "Macbook"; 
        assert ActualResult.toLowerCase().contains(expectedSearchString.toLowerCase());
	    
	}
	
	/*@After
	public void tearDown() {
		System.out.println("Access a Product via Search");
		System.out.println("---------Test Passed----------");
		driver.close();
		driver.quit();
	}*/
}
