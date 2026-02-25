package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectorMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/books");
	    WebElement ref = driver.findElement(By.id("products-orderby"));
	    
	    Select sel=new Select(ref);
	    //sel.selectByIndex(1);
	    //sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
	    sel.selectByContainsVisibleText("Name: Z to A");
	}

}
