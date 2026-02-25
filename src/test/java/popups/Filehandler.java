package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filehandler {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.findElement(By.xpath("//input[@value='Update resume']")).sendKeys("C:\\Users\\nagar\\Downloads\\Acceptance_Testing.pdf");
		//driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\nagar\\Downloads\\Acceptance_Testing.pdf");
	}

}
