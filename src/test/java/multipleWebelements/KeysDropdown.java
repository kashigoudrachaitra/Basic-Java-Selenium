package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?entry_point=login");
	   
	    WebElement day = driver.findElement(By.id("day"));
	    day.click();
	    day.sendKeys(Keys.ARROW_DOWN);
	    day.sendKeys(Keys.ARROW_DOWN);
	    day.sendKeys(Keys.ARROW_DOWN);
	    day.sendKeys(Keys.ARROW_DOWN);

	}

}
