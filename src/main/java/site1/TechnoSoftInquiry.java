
package site1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class TechnoSoftInquiry {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    private String baseURL="http://technosoftconsultants.co.in/technosoft-consultants-dehradun-online-inquiry.aspx";
    
    
    public TechnoSoftInquiry() {
    }

    public TechnoSoftInquiry(WebDriver driver) {
        this();
        this.driver = driver;
        driver.get(baseURL);
    }

    public TechnoSoftInquiry(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TechnoSoftInquiry(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(1) a.botlinks")
    @CacheLookup
    private WebElement applicationDevelopment;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(9) a.botlinks")
    @CacheLookup
    private WebElement businessSolutions;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-career-with-us.aspx']")
    @CacheLookup
    private WebElement careerWithUs;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement careers;

   

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) a")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "TextBox1")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft1;

    @FindBy(id = "TextBox2")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft2;

    @FindBy(id = "TextBox3")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft3;

    @FindBy(id = "TextBox4")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft4;

    @FindBy(id = "TextBox5")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft5;

    @FindBy(id = "TextBox6")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft6;

    @FindBy(id = "bt_Sendnow")
    @CacheLookup
    private WebElement designedAndDevelopedByTechnosoft7;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-products-desktop-applications.aspx']")
    @CacheLookup
    private WebElement desktopstandaloneApplications;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(7) a.botlinks")
    @CacheLookup
    private WebElement ecommerceApplications;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(8) a.botlinks")
    @CacheLookup
    private WebElement enterpriseSolutions;

    @FindBy(id = "StayFocusd-infobar-never-show")
    @CacheLookup
    private WebElement hideForever;

    @FindBy(id = "StayFocusd-infobar-hide")
    @CacheLookup
    private WebElement hideOnce;

    @FindBy(css = "a[href='Default.aspx']")
    @CacheLookup
    private WebElement home;


    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(12) a.botlinks")
    @CacheLookup
    private WebElement itEducation;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(7) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement liveProjectTraining1;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(11) a.botlinks")
    @CacheLookup
    private WebElement liveProjectTraining2;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-location-roadmap.aspx']")
    @CacheLookup
    private WebElement locationRoadmap;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-mobile-apps.aspx']")
    @CacheLookup
    private WebElement mobileApplications;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-multimedia-presentations.aspx']")
    @CacheLookup
    private WebElement multimediaApplications;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-news.aspx']")
    @CacheLookup
    private WebElement news;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement onlineInquiry1;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(7) a.botlinks")
    @CacheLookup
    private WebElement onlineInquiry2;

    private final String pageLoadedText = "IT Company Dehradun | Software Development Dehradun | IT Company Uttarakhand | Website Development Uttarakhand | Software Company Dehradun | Software Development Uttarakhand | IT Companies Dehradun | Software Companies Dehradun | MCA Project Training Dehradun | Btech Project Trainingin Dehradun | Software Development | Website Development | Web portal Development | Website Development Dehradun | Software Consultant Dehradun";

    private final String pageUrl = "/technosoft-consultants-dehradun-online-inquiry.aspx";

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(2) a.botlinks")
    @CacheLookup
    private WebElement portalDevelopment;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement portfolio;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(4) a.botlinks")
    @CacheLookup
    private WebElement portfolios;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement requestCallBack;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(9) a.botlinks")
    @CacheLookup
    private WebElement requestCallback;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-search-engine-optimization.aspx']")
    @CacheLookup
    private WebElement searchEngineOptimization;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-featured-services.aspx']")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(9) a")
    @CacheLookup
    private WebElement sitemap1;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(10) a.botlinks")
    @CacheLookup
    private WebElement sitemap2;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement supportChat1;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(8) a.botlinks")
    @CacheLookup
    private WebElement supportChat2;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-technical-expertiese.aspx']")
    @CacheLookup
    private WebElement technicalExpertise;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement technosoftConsultants;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(3) a.botlinks")
    @CacheLookup
    private WebElement webApplicationDevelopment;

    @FindBy(css = "a[href='technosoft-consultants-dehradun-products.aspx']")
    @CacheLookup
    private WebElement webApplications;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(5) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement webPortalsAndWebsites;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(4) a.botlinks")
    @CacheLookup
    private WebElement websiteDesigning;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement whyTechnosoftConsultants1;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(3) a.botlinks")
    @CacheLookup
    private WebElement whyTechnosoftConsultants2;

   


    /**
     * Click on About Us Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Application Development Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickApplicationDevelopmentLink() {
        applicationDevelopment.click();
        return this;
    }

    /**
     * Click on Business Solutions Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickBusinessSolutionsLink() {
        businessSolutions.click();
        return this;
    }

    /**
     * Click on Career With Us Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickCareerWithUsLink() {
        careerWithUs.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickCareersLink() {
        careers.click();
        return this;
    }

    
    /**
     * Click on Contact Us Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Contacts Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickContactsLink() {
        contacts.click();
        return this;
    }

    /**
     * Click on Designed And Developed By Technosoft Consultants Dehradun Button.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickDesignedAndDevelopedByTechnosoft7Button() {
        designedAndDevelopedByTechnosoft7.click();
        return this;
    }

    /**
     * Click on Desktopstandalone Applications Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickDesktopstandaloneApplicationsLink() {
        desktopstandaloneApplications.click();
        return this;
    }

    /**
     * Click on Ecommerce Applications Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickEcommerceApplicationsLink() {
        ecommerceApplications.click();
        return this;
    }

    /**
     * Click on Enterprise Solutions Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickEnterpriseSolutionsLink() {
        enterpriseSolutions.click();
        return this;
    }

    /**
     * Click on Hide Forever Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickHideForeverLink() {
        hideForever.click();
        return this;
    }

    /**
     * Click on Hide Once Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickHideOnceLink() {
        hideOnce.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on It Education Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickItEducationLink() {
        itEducation.click();
        return this;
    }

    /**
     * Click on Live Project Training Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickLiveProjectTraining1Link() {
        liveProjectTraining1.click();
        return this;
    }

    /**
     * Click on Live Project Training Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickLiveProjectTraining2Link() {
        liveProjectTraining2.click();
        return this;
    }

    /**
     * Click on Location Roadmap Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickLocationRoadmapLink() {
        locationRoadmap.click();
        return this;
    }

    /**
     * Click on Mobile Applications Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickMobileApplicationsLink() {
        mobileApplications.click();
        return this;
    }

    /**
     * Click on Multimedia Applications Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickMultimediaApplicationsLink() {
        multimediaApplications.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Online Inquiry Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickOnlineInquiry1Link() {
        onlineInquiry1.click();
        return this;
    }

    /**
     * Click on Online Inquiry Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickOnlineInquiry2Link() {
        onlineInquiry2.click();
        return this;
    }

    /**
     * Click on Portal Development Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickPortalDevelopmentLink() {
        portalDevelopment.click();
        return this;
    }

    /**
     * Click on Portfolio Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickPortfolioLink() {
        portfolio.click();
        return this;
    }

    /**
     * Click on Portfolios Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickPortfoliosLink() {
        portfolios.click();
        return this;
    }

    /**
     * Click on Request Call Back Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickRequestCallBackLink() {
        requestCallBack.click();
        return this;
    }

    /**
     * Click on Request Callback Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickRequestCallbackLink() {
        requestCallback.click();
        return this;
    }

    /**
     * Click on Search Engine Optimization Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickSearchEngineOptimizationLink() {
        searchEngineOptimization.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickSitemap1Link() {
        sitemap1.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickSitemap2Link() {
        sitemap2.click();
        return this;
    }

    /**
     * Click on Support Chat Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickSupportChat1Link() {
        supportChat1.click();
        return this;
    }

    /**
     * Click on Support Chat Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickSupportChat2Link() {
        supportChat2.click();
        return this;
    }

    /**
     * Click on Technical Expertise Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickTechnicalExpertiseLink() {
        technicalExpertise.click();
        return this;
    }

    /**
     * Click on Technosoft Consultants Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickTechnosoftConsultantsLink() {
        technosoftConsultants.click();
        return this;
    }

    /**
     * Click on Web Application Development Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWebApplicationDevelopmentLink() {
        webApplicationDevelopment.click();
        return this;
    }

    /**
     * Click on Web Applications Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWebApplicationsLink() {
        webApplications.click();
        return this;
    }

    /**
     * Click on Web Portals And Websites Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWebPortalsAndWebsitesLink() {
        webPortalsAndWebsites.click();
        return this;
    }

    /**
     * Click on Website Designing Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWebsiteDesigningLink() {
        websiteDesigning.click();
        return this;
    }

    /**
     * Click on Why Technosoft Consultants Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWhyTechnosoftConsultants1Link() {
        whyTechnosoftConsultants1.click();
        return this;
    }

    /**
     * Click on Why Technosoft Consultants Link.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry clickWhyTechnosoftConsultants2Link() {
        whyTechnosoftConsultants2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry fill() {
        setDesignedAndDevelopedByTechnosoft1TextareaField();
        setDesignedAndDevelopedByTechnosoft2TextareaField();
        setDesignedAndDevelopedByTechnosoft3TextField();
        setDesignedAndDevelopedByTechnosoft4TextField();
        setDesignedAndDevelopedByTechnosoft5TextField();
        setDesignedAndDevelopedByTechnosoft6TextareaField();
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft1TextareaField() {
        return setDesignedAndDevelopedByTechnosoft1TextareaField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_1"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft1TextareaField(String designedAndDevelopedByTechnosoft1Value) {
        designedAndDevelopedByTechnosoft1.sendKeys(designedAndDevelopedByTechnosoft1Value);
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft2TextareaField() {
        return setDesignedAndDevelopedByTechnosoft2TextareaField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_2"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft2TextareaField(String designedAndDevelopedByTechnosoft2Value) {
        designedAndDevelopedByTechnosoft2.sendKeys(designedAndDevelopedByTechnosoft2Value);
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft3TextField() {
        return setDesignedAndDevelopedByTechnosoft3TextField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_3"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft3TextField(String designedAndDevelopedByTechnosoft3Value) {
        designedAndDevelopedByTechnosoft3.sendKeys(designedAndDevelopedByTechnosoft3Value);
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft4TextField() {
        return setDesignedAndDevelopedByTechnosoft4TextField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_4"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft4TextField(String designedAndDevelopedByTechnosoft4Value) {
        designedAndDevelopedByTechnosoft4.sendKeys(designedAndDevelopedByTechnosoft4Value);
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft5TextField() {
        return setDesignedAndDevelopedByTechnosoft5TextField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_5"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Text field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft5TextField(String designedAndDevelopedByTechnosoft5Value) {
        designedAndDevelopedByTechnosoft5.sendKeys(designedAndDevelopedByTechnosoft5Value);
        return this;
    }

    /**
     * Set default value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft6TextareaField() {
        return setDesignedAndDevelopedByTechnosoft6TextareaField(data.get("DESIGNED_AND_DEVELOPED_BY_TECHNOSOFT_6"));
    }

    /**
     * Set value to Designed And Developed By Technosoft Consultants Dehradun Textarea field.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry setDesignedAndDevelopedByTechnosoft6TextareaField(String designedAndDevelopedByTechnosoft6Value) {
        designedAndDevelopedByTechnosoft6.sendKeys(designedAndDevelopedByTechnosoft6Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry verifyPageLoaded() {
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
     * @return the TechnoSoftInquiry class instance.
     */
    public TechnoSoftInquiry verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
