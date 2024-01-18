package StepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMPages.ScenarioPage1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ScenarioStepsPOM1 {
	
    WebDriver driver=null;
    ScenarioPage1 sp;
    
    
	@Before
	public void browsersetup() {
		
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		System.out.println("Browser setup");
	}
	
	@Given("User is on Ebay home page")
	public void user_is_on_ebay_home_page() {
		
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("User is on Ebay Ecommerce page");
        String Actualtitle=driver.getTitle();
        Assert.assertEquals(Actualtitle, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	  
	}

	@When("Navigate to search by category Electronics,Cell Phones & accessories")
	public void navigate_to_search_by_category_electronics_cell_phones_accessories() {
	    sp=new ScenarioPage1(driver);
	    sp.Shop_By_Categary();
	    sp.CellPhone_Accessories();
	    driver.getPageSource().contains("Smartphones & Smartwatches");
	    sp.Cellphone_Smartphone();
	}
	

	@And("User able to add filters Condition, Price and Item location")
	public void user_able_to_add_filters_condition_price_and_item_location() throws AWTException {
		sp.Filter();
		sp.Condition_Filter();
		sp.Price_Filter();
		sp.ItemLocation_Filter();
		sp.BrowserZoom();
			 
	}

	@Then("User able to Verify that the filter tags are applied")
	public void user_able_to_verify_that_the_filter_tags_are_applied() {
		sp.VerifyFiltertags();
		sp.Apply();
	    
	}
	
	@After
	public void tearDown() {
		System.out.println("Scenario 1 and Scenario 2 ");
		System.out.println("---------Test Passed----------");
		driver.close();
		driver.quit();
	}



}
