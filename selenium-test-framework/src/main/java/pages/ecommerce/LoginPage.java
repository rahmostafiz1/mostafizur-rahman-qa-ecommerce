package pages.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    WebDriver driver;
    
    @FindBy (id = "user-name")
    WebElement username;

    @FindBy (id = "password")
    WebElement password;
    
    @FindBy (id = "login-button")
    WebElement loginBtn;
    
    @FindBy (css = "[data-test='error']")
    WebElement errorMsg;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // this line initializes @FindBy elements
    }

    public void login(String user, String pass) {

    	username.sendKeys(user);
    	password.sendKeys(pass);
    	loginBtn.click();
    }

    public String getErrorText() {
        return errorMsg.getText();
    }
}
