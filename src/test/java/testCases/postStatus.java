package testCases;

import facebook.com.gui.login;
import facebook.com.gui.timeLinePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class postStatus {

    public WebDriver driver;
    private  timeLinePage timeLinePage;
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
        timeLinePage = new timeLinePage(driver);
        login =  new login(driver);

    }


    public void setLogin() {
        System.out.println("Enter the email");
        login.getEmailField().sendKeys(data.success.email());
        System.out.println("Enter the password");
        login.getPasswordField().sendKeys(data.success.password());
        login.clickOnLogin();
    }

    @Test
    public void postIt() {
        setLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        timeLinePage.clickOnFacebookIcon();
        System.out.println("Click on the status box");
        timeLinePage.getFocusStatusBox().click();
        System.out.println("Enter data on the status box");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        timeLinePage.getStatusBox().sendKeys(data.success.post1());
        timeLinePage.clickOnPublishButton();
    }


    @AfterTest
    public void closeDriver() {
      driver.close();
      driver.quit();

    }

}
