package site1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class TravelLogin {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;



    @FindBy(css = "a[href='https://www.egencia.fr/app?service=external&page=MeetingLogin&mode=form&market=FR&lang=en']")
    
    private WebElement accessYourDedicatedMeetingPortal;

    @FindBy(css = "a[href='javascript:void(0);']")
    
    private WebElement forgotUserNameAndorPassword;

    @FindBy(id = "languages")
    
    private WebElement franaisEnglish;

    @FindBy(id = "StayFocusd-infobar-never-show")
    
    private WebElement hideForever;

    @FindBy(id = "StayFocusd-infobar-hide")
    
    private WebElement hideOnce;

    private final String pageLoadedText = "Forgot user name and/or password";

    private final String pageUrl = "/auth/v1/refreshEgencia";

    @FindBy(id = "userName")
    
    private WebElement password1;

    @FindBy(id = "password")
    
    private WebElement password2;

    @FindBy(id = "authLoginSubmit")
    
    private WebElement signIn;

    public TravelLogin() {
    }

    public TravelLogin(WebDriver driver) {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    
    driver.get("http://cheiwbtect001.karmalab.net:8080/app?service=external&page=Login&mode=form&market=FR");
    }

    public TravelLogin(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TravelLogin(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Access Your Dedicated Meeting Portal Link.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin clickAccessYourDedicatedMeetingPortalLink() {
        accessYourDedicatedMeetingPortal.click();
        return this;
    }

    /**
     * Click on Forgot User Name Andor Password Link.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin clickForgotUserNameAndorPasswordLink() {
        forgotUserNameAndorPassword.click();
        return this;
    }

    /**
     * Click on Hide Forever Link.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin clickHideForeverLink() {
        hideForever.click();
        return this;
    }

    /**
     * Click on Hide Once Link.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin clickHideOnceLink() {
        hideOnce.click();
        return this;
    }

    
    /**
     * Click on Sign In Button.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin fill() {
        setFranaisEnglishDropDownListField();
        setPassword1PasswordField();
        setPassword2PasswordField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Franais English Drop Down List field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setFranaisEnglishDropDownListField() {
        return setFranaisEnglishDropDownListField(data.get("FRANAIS_ENGLISH"));
    }

    /**
     * Set value to Franais English Drop Down List field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setFranaisEnglishDropDownListField(String franaisEnglishValue) {
        new Select(franaisEnglish).selectByVisibleText(franaisEnglishValue);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setPassword1PasswordField() {
        return setPassword1PasswordField(data.get("PASSWORD_1"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setPassword1PasswordField(String password1Value) {
        password1.sendKeys(password1Value);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setPassword2PasswordField() {
        return setPassword2PasswordField(data.get("PASSWORD_2"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin setPassword2PasswordField(String password2Value) {
        password2.sendKeys(password2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin submit() {
        clickSignInButton();
        return this;
    }

    /**
     * Unset default value from Franais English Drop Down List field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin unsetFranaisEnglishDropDownListField() {
        return unsetFranaisEnglishDropDownListField(data.get("FRANAIS_ENGLISH"));
    }

    /**
     * Unset value from Franais English Drop Down List field.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin unsetFranaisEnglishDropDownListField(String franaisEnglishValue) {
        new Select(franaisEnglish).deselectByVisibleText(franaisEnglishValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the loginTravel class instance.
     */
    public TravelLogin verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
