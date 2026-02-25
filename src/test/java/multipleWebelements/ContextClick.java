package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	    driver.findElement(By.id("password")).sendKeys("gadjhsbkcsdlj");
	   WebElement click = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])"));

	    Actions act=new Actions(driver);
	    act.clickAndHold(click).perform();
	    Thread.sleep(2000);
	    act.release(click).perform();

	}

}
