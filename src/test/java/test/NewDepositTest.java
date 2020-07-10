package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewDepositTest {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	}

	@Test
	public void userShouldBeAbleToDeposit() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String expectedTitle = "Dashboard- iBilling";
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Dashboard cant display!!");
		By TRANCSACTION_MENU_LOCATOR = By.xpath("//ul[@id='side-menu']/descendant::span[text()='Transactions']");
		By NEW_DEPOSIT_PAGE_LOCATOR = By.linkText("New Deposit");
		
		driver.findElement(TRANCSACTION_MENU_LOCATOR).click();
		waitForElement(NEW_DEPOSIT_PAGE_LOCATOR, driver, 20);
		driver.findElement(NEW_DEPOSIT_PAGE_LOCATOR).click();
	
	
	
	}

	private void waitForElement(By locator, WebDriver driver2,int time) {
		new WebDriverWait(driver2, time).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}

	
//	  @AfterMethod 
//	  public void closeEverything() { 
//	  driver.close(); 
//	  driver.quit(); 
//	  }
	 

}
