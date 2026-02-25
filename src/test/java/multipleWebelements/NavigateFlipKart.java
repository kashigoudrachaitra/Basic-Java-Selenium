package multipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFlipKart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 //System.out.println(links.size());
		  for(WebElement link:links)
		  {		
            System.out.println(link.getText());
         // Check if the link text contains "About Us" (case-sensitive)
            if (link.getText().contains("About Us")) {
                link.click(); // *** This is the click action ***
                System.out.println("Clicked 'About Us' link.");
                break; // Exit the loop once the link is found and clicked
            }
		  }
		 // boolean aboutFound = false;
		  //for (WebElement link : links) {
		   //   if (link.getText().contains("About Us")) {
		      //    aboutFound = true;
		          //break; 
		    //  }
		 // }
		  //System.out.println(aboutFound);//
		  

	}

}
