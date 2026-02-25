package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender"));
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Chaitra");
		driver.findElement(By.id("LastName")).sendKeys("Kashigoudra");
		
		driver.findElement(By.id("Email")).sendKeys("ckKashigoudra@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chaitra");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chaitra");
		
		
		

	}

}
