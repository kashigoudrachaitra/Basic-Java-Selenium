package screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws Throwable {
		                                 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.instagram.com/");
			WebElement ts = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		     File temp = ts.getScreenshotAs(OutputType.FILE);
			 File per = new File("./Screenshots/insta2.png");
			 FileHandler.copy(temp,per);
			
	}

}
