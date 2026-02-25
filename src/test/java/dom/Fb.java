package dom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		LoginPge lp=new LoginPge(driver);
		lp.getEmail().sendKeys("chait");
		lp.getPswd().sendKeys("dfg");
		lp.getLogin().click();

	}

}
