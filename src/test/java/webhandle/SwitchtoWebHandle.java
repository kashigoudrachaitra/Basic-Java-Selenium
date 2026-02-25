package webhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWebHandle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);

		String parentId = driver.getWindowHandle();               // 1

		driver.findElement(By.id("compare")).click();             // opens new window(s)
		Set<String> allWindowIds = driver.getWindowHandles();     // 4
		//allWindowIds.remove(parentId);                            // 3

		for (String windowId : allWindowIds) {
		    driver.switchTo().window(windowId);                   // go to each child
		    Thread.sleep(2000);
		    driver.close();                                       // close the child
		}


	}

}
