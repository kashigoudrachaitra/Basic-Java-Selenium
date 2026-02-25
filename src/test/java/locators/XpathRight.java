package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class XpathRight {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement returnsAndOrders=driver.findElement(By.linkText("Returns & Orders"));
		driver.findElement(By.xpath("//a[@id='nav-orders']/following-sibling::a")).click();
        driver.findElement(RelativeLocator.with(By.tagName("a")).straightRightOf(returnsAndOrders)).click();
       //river.findElement(RelativeLocator.with(By.id("nav-cart")).toRightOf(returnsAndOrders)).click();


	}

}
