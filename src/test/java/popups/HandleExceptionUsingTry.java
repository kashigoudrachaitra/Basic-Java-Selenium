package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleExceptionUsingTry {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("ddate")).click();
		for(;;)
		{
		
		try {
			
			driver.findElement(By.id("frth_3_25/03/2026")).click();
			break;
			
		} catch (Exception e) {
			
			driver.findElement(By.id("img2Nex")).click();
			
		}
		

	}
	}
	}


