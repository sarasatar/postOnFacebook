package facebook.com.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class timeLinePage{

    /**
     * @Author: gicastano
     * This class contains the elements of the time line page
     */

    public static WebElement element = null;

    @FindBy(css="[class=\"_2md\"]")
    public WebElement facebookIcon;

    @FindBy(css="[class=\"_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1\"][role=\"presentation\"]")
    public WebElement focusStatusBox;

    @FindBy(css="[data-testid=\"status-attachment-mentions-input\"][role=\"textbox\"]")
    public WebElement statusBox;

    @FindBy(css="[data-testid=\"react-composer-post-button\"][type=\"submit\"]")
    public WebElement publishButton;


    public WebElement getFacebookIcon(){return facebookIcon;}
    public WebElement getFocusStatusBox() {return focusStatusBox;}
    public WebElement getStatusBox(){return statusBox;}
    public WebElement getPublishButton(){return publishButton;}


    //constructor
    public timeLinePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //actions
    public void clickOnFacebookIcon(){
        System.out.println("Click on facebook icon");
        getFacebookIcon().click();
    }

    public void clickOnPublishButton(){
        System.out.println("Click on publish button");
        getPublishButton().click();

    }





}
