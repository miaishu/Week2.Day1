package selenium.week2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("demo");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sale");
		
		WebElement dd1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown1 = new Select(dd1);
		
		dropdown1.selectByValue("LEAD_PARTNER");
		
		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dropdown2 = new Select(dd2);
		
		dropdown2.selectByIndex(6);
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+408");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("777-8765");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("NA");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Dani");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xxx@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("xxxx.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("dani");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("master");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Saratoga ave");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("H118");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Sunnyvale");
		
		WebElement dd3 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dropdown3= new Select(dd3);
		
		dropdown3.selectByValue("CA");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("94086");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
		title.getText();
		System.out.println(title.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
