package selenium.week2d1;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		//TO setup the browser
		WebDriverManager.chromedriver().setup();
		
		//To launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//To maximise the browser
		driver.manage().window().maximize();
		
		//To get title
		driver.get("http://leaftaps.com/opentaps/");
		
		//To enter username
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("DemoSalesManager");
		
		//To enter password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//TO click on login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click on CRMSFA link
		driver.findElement(By.className("crmsfa")).click();
		
		//To close the browser
		
		//driver.close();
		
		//to click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//to click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//to ENter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Emerson");
		
		//To Enter First name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ish");
		
		//To Enter Last NAme
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasi");
		
	
		
		//To select dropdown
		
	      
	  //Locate the element with the dd tag
		
		WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Create obj for dd class
		Select dropdown=new Select(dd);
		
			//By value
		
		dropdown.selectByIndex(2);
		
		
		// By name
		//dropdown.selectByVisibleText("Existing Customer");
		
		
	//To click create lead
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
			
		
	}

}
