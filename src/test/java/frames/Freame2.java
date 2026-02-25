package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freame2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html ");
		driver.switchTo().frame("SingleFrame");
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']")); 
		textField.sendKeys("glgk");
		driver.switchTo().defaultContent();
	}

}
