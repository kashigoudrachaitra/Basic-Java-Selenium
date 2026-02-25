package multipleWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragCoordinator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
	    WebElement drag = driver.findElement(By.id("draggable"));
	    //WebElement drop = driver.findElement(By.id("droppable"));
	    Actions act=new Actions(driver);
	    act.dragAndDropBy(drag, 800, 600).perform();


	}

}
