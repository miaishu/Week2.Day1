package selenium.week2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {
	public static void main(String[] args) {

	//TO setup the browser
			WebDriverManager.chromedriver().setup();
			
			//To launch the browser
			
			ChromeDriver driver = new ChromeDriver();
			
			//To maximise the browser
			driver.manage().window().maximize();
			
			///To get title
			driver.get("http://leafground.com/pages/Edit.html");
			
			//To enter emailaddress
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("ishu@gmail.com");
			
			//to perform next tab action
			driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Ishu",Keys.TAB);
			
			//to get default text
			String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("Value");
			System.out.println(text);
			
			//to clear the data
			driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
			
			//disabled ornot
			boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
			
			System.out.println(enabled);
			
			driver.close();
			
			
			
			
			
			
			
			
			

}
}
