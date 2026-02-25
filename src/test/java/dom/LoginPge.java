package dom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPge {

	public LoginPge(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pswd;

	@FindBy(xpath ="//button[@value='1']")
	private WebElement login;
	

public WebElement getEmail() {
	return email;
}
public WebElement getPswd() {
	return pswd;
}
public WebElement getLogin() {
	return login;
}
}
