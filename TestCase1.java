package selenium.week2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public static void main(String[] args) {
		
	//setup driver
	WebDriverManager.chromedriver().setup();
	//Launch browser
	ChromeDriver driver=new ChromeDriver();
	
	//open URL
	    driver.get("http://leaftaps.com/opentaps/control/login");
	
	//maximise
		driver.manage().window().maximize();
		
	//Enter Username
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("DemosalesManager");
		
	//Enter Password
		WebElement passWord=driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
	//Click Login
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
	//Click CRM/SFA
		WebElement crmSfa=driver.findElement(By.linkText("CRM/SFA"));
		crmSfa.click();
		
	//select Contacts tab 
		WebElement contacts=driver.findElement(By.linkText("Contacts"));
		contacts.click();
	
	// select Create Contact
		WebElement create=driver.findElement(By.linkText("Create Contact"));
		create.click();
		
	//select First Name
		WebElement firstName=driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("dev");
		
	// Select Last NAme
		WebElement lastName=driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("san");
		
	//Click create contact
		WebElement contact=driver.findElement(By.className("smallSubmit"));
		contact.click();
		
		
	//Print the first name and browser title
		WebElement name = driver.findElement(By.id("viewContact_fullName_sp"));
		name.getText();
				
		System.out.println(name.getText());
	 	
	    System.out.println("http://leaftaps.com/opentaps/control/login");
		
	//Close the browser
		driver.close();
		
	

}
}