package practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		//Dimension size= driver.manage().window().getSize();
		//System.out.println(size);
		//System.out.println(size.getHeight());
		//System.out.println(size.getWidth());
		//Dimension size=new Dimension(1500, 500);
		//driver.manage().window().setSize(size);
		//Point pos=driver.manage().window().getPosition();
		//System.out.println(pos);
		//System.out.println(pos.getX());
		//System.out.println(pos.getY());
		Point pos=new Point(100,100);
		driver.manage().window().setPosition(pos);
		
		

	}	

}
