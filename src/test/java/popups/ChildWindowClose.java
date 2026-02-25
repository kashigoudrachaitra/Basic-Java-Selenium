package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowClose {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/products_page/81");
		driver.findElement(By.id("compare")).click();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();

		for (String handle : allHandles) {
		    if (!handle.equals(parentHandle)) {
		        driver.switchTo().window(handle);
		        driver.close(); // Closes the child window
		    }
		}
	}

}
