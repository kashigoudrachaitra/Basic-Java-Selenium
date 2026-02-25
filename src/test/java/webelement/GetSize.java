package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		
		Point loc=driver.findElement(By.name("login")).getLocation();
        System.out.println(loc);
        System.out.println(loc.getX());
        System.out.println(loc.getY());
      
		
		Dimension size=driver.findElement(By.name("login")).getSize();
        System.out.println(size);
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());
        Rectangle rect=driver.findElement(By.name("login")).getRect();
        System.out.println(rect);
        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
        System.out.println(rect.getDimension());
        System.out.println(rect.getPoint());
        


	}

}
