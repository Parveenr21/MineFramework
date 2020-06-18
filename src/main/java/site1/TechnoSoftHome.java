package site1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class TechnoSoftHome {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private String baseURL="http://technosoftconsultants.co.in/default.aspx";
    
    
    
    public TechnoSoftHome() {
    }

    public TechnoSoftHome(WebDriver driver) {
        this();
        this.driver = driver;
    
    driver.get(baseURL);
    }

    public TechnoSoftHome(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TechnoSoftHome(WebDriver driver, Map<String, String> data, int timeout) {
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

    private final String pageUrl = "/default.aspx";

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(2) ul li:nth-of-type(2) a.botlinks")
    @CacheLookup
    private WebElement portalDevelopment;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement portfolio;

    @FindBy(css = "#form1 div:nth-of-type(4) div div:nth-of-type(1) ul li:nth-of-type(4) a.botlinks")
    @CacheLookup
    private WebElement portfolios;

    @FindBy(css = "#form1 div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(1) a")
    @CacheLookup
    private WebElement readmore;

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
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Application Development Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickApplicationDevelopmentLink() {
        applicationDevelopment.click();
        return this;
    }

    /**
     * Click on Business Solutions Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickBusinessSolutionsLink() {
        businessSolutions.click();
        return this;
    }

    /**
     * Click on Career With Us Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickCareerWithUsLink() {
        careerWithUs.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickCareersLink() {
        careers.click();
        return this;
    }

   

    /**
     * Click on Contact Us Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Contacts Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickContactsLink() {
        contacts.click();
        return this;
    }

    /**
     * Click on Desktopstandalone Applications Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickDesktopstandaloneApplicationsLink() {
        desktopstandaloneApplications.click();
        return this;
    }

    /**
     * Click on Ecommerce Applications Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickEcommerceApplicationsLink() {
        ecommerceApplications.click();
        return this;
    }

    /**
     * Click on Enterprise Solutions Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickEnterpriseSolutionsLink() {
        enterpriseSolutions.click();
        return this;
    }

    /**
     * Click on Hide Forever Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickHideForeverLink() {
        hideForever.click();
        return this;
    }

    /**
     * Click on Hide Once Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickHideOnceLink() {
        hideOnce.click();
        return this;
    }

  

    /**
     * Click on Home Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on It Education Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickItEducationLink() {
        itEducation.click();
        return this;
    }

    /**
     * Click on Live Project Training Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickLiveProjectTraining1Link() {
        liveProjectTraining1.click();
        return this;
    }

    /**
     * Click on Live Project Training Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickLiveProjectTraining2Link() {
        liveProjectTraining2.click();
        return this;
    }

    /**
     * Click on Location Roadmap Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickLocationRoadmapLink() {
        locationRoadmap.click();
        return this;
    }

    /**
     * Click on Mobile Applications Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickMobileApplicationsLink() {
        mobileApplications.click();
        return this;
    }

    /**
     * Click on Multimedia Applications Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickMultimediaApplicationsLink() {
        multimediaApplications.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Online Inquiry Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickOnlineInquiry1Link() {
        onlineInquiry1.click();
        return this;
    }

    /**
     * Click on Online Inquiry Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickOnlineInquiry2Link() {
        onlineInquiry2.click();
        return this;
    }

    /**
     * Click on Portal Development Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickPortalDevelopmentLink() {
        portalDevelopment.click();
        return this;
    }

    /**
     * Click on Portfolio Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickPortfolioLink() {
        portfolio.click();
        return this;
    }

    /**
     * Click on Portfolios Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickPortfoliosLink() {
        portfolios.click();
        return this;
    }

    /**
     * Click on Readmore Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickReadmoreLink() {
        readmore.click();
        return this;
    }

    /**
     * Click on Request Call Back Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickRequestCallBackLink() {
        requestCallBack.click();
        return this;
    }

    /**
     * Click on Request Callback Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickRequestCallbackLink() {
        requestCallback.click();
        return this;
    }

    /**
     * Click on Search Engine Optimization Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickSearchEngineOptimizationLink() {
        searchEngineOptimization.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickSitemap1Link() {
        sitemap1.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickSitemap2Link() {
        sitemap2.click();
        return this;
    }

    /**
     * Click on Support Chat Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickSupportChat1Link() {
        supportChat1.click();
        return this;
    }

    /**
     * Click on Support Chat Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickSupportChat2Link() {
        supportChat2.click();
        return this;
    }

    /**
     * Click on Technical Expertise Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickTechnicalExpertiseLink() {
        technicalExpertise.click();
        return this;
    }

    /**
     * Click on Technosoft Consultants Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickTechnosoftConsultantsLink() {
        technosoftConsultants.click();
        return this;
    }

    /**
     * Click on Web Application Development Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWebApplicationDevelopmentLink() {
        webApplicationDevelopment.click();
        return this;
    }

    /**
     * Click on Web Applications Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWebApplicationsLink() {
        webApplications.click();
        return this;
    }

    /**
     * Click on Web Portals And Websites Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWebPortalsAndWebsitesLink() {
        webPortalsAndWebsites.click();
        return this;
    }

    /**
     * Click on Website Designing Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWebsiteDesigningLink() {
        websiteDesigning.click();
        return this;
    }

    /**
     * Click on Why Technosoft Consultants Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWhyTechnosoftConsultants1Link() {
        whyTechnosoftConsultants1.click();
        return this;
    }

    /**
     * Click on Why Technosoft Consultants Link.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome clickWhyTechnosoftConsultants2Link() {
        whyTechnosoftConsultants2.click();
        return this;
    }

   

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the TechnoSoftHome class instance.
     */
    public TechnoSoftHome verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
