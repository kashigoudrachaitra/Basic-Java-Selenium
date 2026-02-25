package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/iframes.html ");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe1");
		WebElement ref = driver.findElement(By.id("iframe1"));
		driver.switchTo().frame(ref);
		driver.findElement(By.id("email")).sendKeys("fneojf");

	}

}
