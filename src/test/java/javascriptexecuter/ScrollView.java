package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollView {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		WebElement india = driver.findElement(By.xpath("//span[text()='India']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].scrollIntoView(false)",india);
        jse.executeScript("arguments[0].scrollIntoView(true)",india);
 
        
	}

}
