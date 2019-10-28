package facebook.com.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{

/**
 * @Author: gicastano
 * This class contains the elements of the login page
 */


    public static WebElement element = null;

    @FindBy(css="input[name=\"email\"]")
    public WebElement email;

    public WebElement getEmailField() {return email; }


    @FindBy(css="input[name=\"pass\"]")
    public WebElement password;

    public WebElement getPasswordField() {return password; }

    @FindBy(css="[type=\"submit\"]")
    public WebElement loginButton;

    public WebElement getLoginButton() {return loginButton;}

    //constructor
    public login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //actions
    public void clickOnLogin() {
        System.out.println("Click on login button");
        getLoginButton().click();
    }



}


