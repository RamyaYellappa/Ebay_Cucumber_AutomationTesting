package POMPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ScenarioPage1 {
	
	WebDriver driver;
	Actions action;
	
	
	
	By Shop_By_Categary=By.xpath("//button[@id='gh-shop-a']");
	By CellPhone_Accessories=By.xpath("//a[normalize-space()='Cell phones & accessories']");
	By CellPhone_Smartphone=By.xpath("//a[contains(text(),'Cell Phones & Smartphones')]");
	By All_Filter=By.cssSelector("button[aria-label='All Filters']");
	By Condition_Filter=By.cssSelector("div[class='x-overlay__wrapper--left']>div>div:nth-child(22)>span[class='x-overlay-aspect__label']");
	By NewCondition=By.id("c3-subPanel-LH_ItemCondition_New_cbx");
	By Price_Filter=By.cssSelector("div[class='x-overlay__wrapper--left']>div>div:nth-child(23)>span");
	By MinPrice=By.cssSelector("input[aria-label='Minimum Value, US Dollar']");
	By MaxPrice=By.cssSelector("input[aria-label='Maximum Value, US Dollar']");
	By ItemLocation_Filter=By.cssSelector("div[class='x-overlay__wrapper--left']>div>div:nth-child(25)>span");
	By USLocation=By.xpath("//input[@value='US Only']");
	By Apply=By.xpath("//button[normalize-space()='Apply']");
	By VerifyConditionFilter=By.xpath("//span[@data-aspecttitle='LH_ItemCondition']");
	By VerifyPriceFilter=By.xpath("//span[@data-aspecttitle='price']");
	By VerifyLocationFilter=By.xpath("//span[@data-aspecttitle='location']");
	
	
	public ScenarioPage1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void  Shop_By_Categary() {
		driver.findElement(Shop_By_Categary).click();
	}
	
	public void CellPhone_Accessories() {
		driver.findElement(CellPhone_Accessories).isDisplayed();
		driver.findElement(CellPhone_Accessories).click();
	}
	
	public void Cellphone_Smartphone() {
		driver.findElement(CellPhone_Smartphone).click();
	}
	
	public void Filter() {
		driver.findElement(All_Filter).click();
		
	}

	
	public void Condition_Filter() {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement conditionFilter=driver.findElement(Condition_Filter);
		
		action = new Actions(driver); 
		
		action.moveToElement(conditionFilter);
		System.out.println("Condition filter is displayed : "+conditionFilter.isDisplayed());
		conditionFilter.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(NewCondition).click();  
		
	}
	public void Price_Filter() {
		
		driver.findElement(Price_Filter).click();
		WebElement minPrice=driver.findElement(MinPrice);
		minPrice.sendKeys("100");
		WebElement maxPrice=driver.findElement(MaxPrice);
		maxPrice.sendKeys("300");
		
	}
	public void ItemLocation_Filter() {
		driver.findElement(ItemLocation_Filter).click();
		driver.findElement(USLocation).click();
	}
	public void VerifyFiltertags() {
		driver.findElement(VerifyConditionFilter).isDisplayed();
		driver.findElement(VerifyPriceFilter).isDisplayed();
		driver.findElement(VerifyLocationFilter).isDisplayed();
	}
	public void Apply() {
		driver.findElement(Apply).click();
	}
	public void BrowserZoom() throws AWTException {
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		  }
		 
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		  }
	}
	
	
	

}
