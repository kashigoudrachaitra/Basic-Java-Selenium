package multipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectorMethod2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/select-menu ");
	    WebElement ref = driver.findElement(By.id("cars"));
	    
	    Select sel=new Select(ref);
	    sel.selectByIndex(0);
	    sel.selectByValue("saab");
	    sel.selectByContainsVisibleText("Opel");
	    Thread.sleep(2000);
	    sel.deselectAll();
	    boolean boll = sel.isMultiple();
        System.out.println(boll);
	   
	  //  sel.deselectByIndex(0);
	    //Thread.sleep(2000);
	    //sel.deselectByValue("saab");
	    //Thread.sleep(2000);
	    //sel.deSelectByContainsVisibleText("Opel");
	    //String get=sel.getFirstSelectedOption().getText();
	    //System.out.println(get);
	    // List<WebElement> options = sel.getAllSelectedOptions();
	    // for(WebElement one:options)
	    // {
	    	// System.out.println(one.getText());
	   //  }
	     List<WebElement> options1 = sel.getOptions();
	     for(WebElement one:options1)
	     {
	    	 System.out.println(one.getText());
	     }
          
          
	}

}
