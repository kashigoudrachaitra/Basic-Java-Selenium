package multipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.swiggy.com/");
		driver.navigate().to("https://www.amazon.es");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		 for(WebElement link:links)
		  {		
         System.out.println(link.getText());
		  }

	}

}
