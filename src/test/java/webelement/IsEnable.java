package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login.isEnabled());   // false
		driver.findElement(By.name("username")).sendKeys("varsh");
		driver.findElement(By.name("password")).sendKeys("123456");
		System.out.println("after entering un and pw");
		System.out.println(login.isEnabled());   // true



	}

}
