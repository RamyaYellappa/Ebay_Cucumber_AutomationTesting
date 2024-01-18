package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class ScenarioPage2 {
	
	WebDriver driver;
	Actions action;
	String result;
	
	By SearchField=By.id("gh-ac");
	By Selectcategory=By.xpath("//select[@id='gh-cat']");
	By Search=By.xpath("//input[@id='gh-btn']");
	public By Heading=By.xpath("//h1[@class='srp-controls__count-heading']");
	
	
	public ScenarioPage2(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void SearchField() {
		driver.findElement(SearchField).sendKeys("Macbook");
	}
	
	public void SelectCategory() {
		WebElement element=driver.findElement(Selectcategory);
		Select s=new Select(element);
		s.selectByVisibleText("Computers/Tablets & Networking");
	}
	
	public void Search() {
		driver.findElement(Search).click();
	}
	
	
	
	
	

}
