package multipleWebelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControllingKey {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?entry_point=login");
	   
	    WebElement day = driver.findElement(By.id("day"));
	    day.click();
	    Robot rob = new Robot();
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	}

}
