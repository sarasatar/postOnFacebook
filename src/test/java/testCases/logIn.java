package testCases;

import facebook.com.gui.login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class logIn{

    public WebDriver driver;
    private login login;

    //prepared environment
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().version("77.0.3865.40").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        login = new login(driver);
    }

    @Test
    public void setLogin() {
        System.out.println("Enter the email");
        login.getEmailField().sendKeys(data.success.email());
        System.out.println("Enter the password");
        login.getPasswordField().sendKeys(data.success.password());
        login.clickOnLogin();
    }

   @AfterTest
    public void closeDriver() {
        driver.close();
        driver.quit();

    }

}
