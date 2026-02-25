
		package screen;

		import java.io.File;
import java.io.IOException;
import java.time.Duration;


		import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
       import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.io.FileHandler;
		

		public class SSWebpage {

			public static void main(String[] args) throws Throwable {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.facebook.com/");
				TakesScreenshot ts=(TakesScreenshot) driver;
				 File temp = ts.getScreenshotAs(OutputType.FILE);
				 File per = new File("./Screenshots/fb.png");
				 FileHandler.copy(temp,per);
			}

	

	}


