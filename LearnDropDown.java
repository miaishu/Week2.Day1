package selenium.week2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Select using index
		WebElement prog=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select program =new Select(prog);
		program.selectByIndex(3);
		System.out.println(program);
		
		//Select using text
		WebElement prog1=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select program1=new Select(prog1);
		program1.selectByVisibleText("Appium");
				
		
		//Select using value
		WebElement prog2=driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select program2=new Select(prog2);
		program2.selectByValue("2");
		
		
				
		
		//Get the number of dropdown options
		WebElement options=driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select dropdown=new Select(options);
	    System.out.println(dropdown.getOptions().size());
	    
	    
		
		//use sendKeys to select
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']")).sendKeys("Loadrunner");
		//driver.findElement(By.xpath("//option[text()='Loadrunner']")).click();
		
	}

}
