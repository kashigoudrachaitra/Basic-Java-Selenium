package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysOnAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com ");
	    //WebElement send= driver.findElement(By.xpath("(//form[@action='/search'])"));
	  WebElement key = driver.findElement(By.xpath("(//input[@value='Search store'])"));
	  key.sendKeys("MOBILEstores");
	    Actions act=new Actions(driver);
	   act.setActiveKeyboard("MOBILES").click().perform();
	    //act.scrollToElement(key,"MOBILEstores").perform();
	    
	}

}
