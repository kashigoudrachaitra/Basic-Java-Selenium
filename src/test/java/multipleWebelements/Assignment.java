package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    WebElement key = driver.findElement(By.id("email"));
	    
	    WebElement key1 = driver.findElement(By.id("pass"));
	    key.sendKeys("chaitra",Keys.TAB);
	    key1.sendKeys("dfuuijoij",Keys.TAB);
		   
	   

	}

}
