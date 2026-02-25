package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NvigationMethod {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://eu.dookan.com/");
		driver.navigate().to("https://www.instagram.com/dookan4all/#");
		driver.navigate().back();
		Thread.sleep(2000);
		
	}

}
