package site1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class TravelHomePAge {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;




    @FindBy(id = "switchToAllEscaleOptionLink")
    @CacheLookup
    private WebElement allFlights;

    @FindBy(id = "PageLink")
    @CacheLookup
    private WebElement allTrips;

    @FindBy(css = "button.ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
    @CacheLookup
    private WebElement back;

    @FindBy(id = "primary-nav-book")
    @CacheLookup
    private WebElement book;

    @FindBy(id = "book-car")
    @CacheLookup
    private WebElement cars1;

    @FindBy(css = "a.picto-car")
    @CacheLookup
    private WebElement cars2;

    @FindBy(id = "Tapestry5Link_1")
    @CacheLookup
    private WebElement clickHereToSeeTheLatest;

    @FindBy(css = "a.ui-dialog-titlebar-close.ui-corner-all")
    @CacheLookup
    private WebElement close;

    @FindBy(id = "DirectLink_0")
    @CacheLookup
    private WebElement completedTrips;

    @FindBy(id = "customerCare")
    @CacheLookup
    private WebElement contactYourInvoiceCare;

    @FindBy(id = "country-watch")
    @CacheLookup
    private WebElement countryWatch;

    @FindBy(id = "tabs_current")
    @CacheLookup
    private WebElement currentTrips;

    @FindBy(id = "customer-invoice-care")
    @CacheLookup
    private WebElement customerInvoiceCare;

    @FindBy(id = "airFirstSuggestLocation_id")
    @CacheLookup
    private WebElement departingFrom;

    @FindBy(id = "departureDate")
    @CacheLookup
    private WebElement departureDate1;

    @FindBy(id = "departTimeType")
    @CacheLookup
    private WebElement departureDate2;

    @FindBy(id = "switchToNonStopEscaleOptionLink")
    @CacheLookup
    private WebElement direct;

    @FindBy(id = "promise")
    @CacheLookup
    private WebElement egenciaPromise;

    @FindBy(css = "a[href='http://www.egencia.fr/public/fr/en/egencia-solutions/technology-solutions/egencia-mobile/']")
    @CacheLookup
    private WebElement exploreOurMobileAppFor;

    @FindBy(id = "book-flight")
    @CacheLookup
    private WebElement flights1;

    @FindBy(id = "tabs_current")
    @CacheLookup
    private WebElement flights2;

    @FindBy(id = "locale-chooser")
    @CacheLookup
    private WebElement franaisEnglish;

    @FindBy(id = "airSecondSuggestLocation_id")
    @CacheLookup
    private WebElement goingTo;

    @FindBy(id = "StayFocusd-infobar-never-show")
    @CacheLookup
    private WebElement hideForever;

    @FindBy(id = "StayFocusd-infobar-hide")
    @CacheLookup
    private WebElement hideOnce;

    @FindBy(id = "book-hotel")
    @CacheLookup
    private WebElement hotels1;

    @FindBy(id = "Tapestry5Link")
    @CacheLookup
    private WebElement hotels2;

    @FindBy(id = "ExternalLink")
    @CacheLookup
    private WebElement howDoINavigateOn;

    @FindBy(id = "ExternalLink_1")
    @CacheLookup
    private WebElement howDoISpecifyAn;

    @FindBy(id = "ExternalLink_5")
    @CacheLookup
    private WebElement howToStartASearch;

    @FindBy(id = "ExternalLink_0")
    @CacheLookup
    private WebElement isThereATimeTo;

    @FindBy(id = "primary-nav-account")
    @CacheLookup
    private WebElement mrParveenRawatSite;

    @FindBy(id = "switchToMultiTripLink")
    @CacheLookup
    private WebElement multipleDestinations;

    @FindBy(css = "a.ui-datepicker-next.ui-corner-all")
    @CacheLookup
    private WebElement next;

    @FindBy(css = "#Body div:nth-of-type(6) div:nth-of-type(11) button.ui-state-default.ui-corner-all")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "switchToSingleTrip")
    @CacheLookup
    private WebElement oneWay;

    @FindBy(id = "online-checkIn")
    @CacheLookup
    private WebElement onlineCheckin;

    private final String pageLoadedText = "Please contact your Travel Director or your Customer Service - your company is not opened for invoicing";

    private final String pageUrl = "/app;jsessionid=467F0CA21AF0187C43B66FC807586011.cheiwbtect001?service=ContinuationService&continuationClass=com.egencia.frontend.air.workflow.AirShoppingContinuation&sp=SWelcome&e_ts=1473264206182";

    @FindBy(css = "a.ui-datepicker-prev.ui-corner-all.ui-state-disabled")
    @CacheLookup
    private WebElement prev;

    @FindBy(id = "privacy-policy")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(id = "user-profile")
    @CacheLookup
    private WebElement profile;

   

    @FindBy(id = "airlineSelection")
    @CacheLookup
    private WebElement returnDate10;

    @FindBy(id = "alliance")
    @CacheLookup
    private WebElement returnDate11;

    @FindBy(name = "flightType")
    @CacheLookup
    private List<WebElement> returnDate2;

    @FindBy(name = "flightType")
    @CacheLookup
    private List<WebElement> returnDate3;

    @FindBy(id = "arriveDate")
    @CacheLookup
    private WebElement returnDate4;

    @FindBy(id = "arriveTimeType")
    @CacheLookup
    private WebElement returnDate5;

    @FindBy(name = "escaleOption")
    @CacheLookup
    private List<WebElement> returnDate6;

    @FindBy(name = "escaleOption")
    @CacheLookup
    private List<WebElement> returnDate7;

    @FindBy(name = "escaleOption")
    @CacheLookup
    private List<WebElement> returnDate8;

    @FindBy(id = "select_cabin1")
    @CacheLookup
    private WebElement returnDate9;


    @FindBy(id = "submitSearch")
    @CacheLookup
    private WebElement search;

    @FindBy(id = "log-out")
    
    private WebElement signOut;

    @FindBy(id = "switchToViaEscaleOptionLink")
    @CacheLookup
    private WebElement stop1;

    @FindBy(id = "terms-use")
    @CacheLookup
    private WebElement termsOfUse;

    @FindBy(id = "primary-nav-tools")
    @CacheLookup
    private WebElement tools;

    @FindBy(id = "book-train")
    @CacheLookup
    private WebElement trains1;

    @FindBy(id = "trainButtonLink")
    @CacheLookup
    private WebElement trains2;

    @FindBy(id = "travel-news")
    @CacheLookup
    private WebElement travelNews;

    @FindBy(id = "primary-nav-trips")
    @CacheLookup
    private WebElement trips;

    @FindBy(id = "visa-passport")
    @CacheLookup
    private WebElement visas;

    @FindBy(id = "ExternalLink_4")
    @CacheLookup
    private WebElement whatAreTheTotalNumber;

    @FindBy(id = "ExternalLink_3")
    @CacheLookup
    private WebElement whatIsThePremiumEconomy;

    @FindBy(id = "ExternalLink_2")
    @CacheLookup
    private WebElement whyDoIHaveTo;

    public TravelHomePAge() {
    }

    public TravelHomePAge(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);

        driver.get("http://cheiwbtect001.karmalab.net:8080/app;jsessionid=467F0CA21AF0187C43B66FC807586011.cheiwbtect001?service=ContinuationService&continuationClass=com.egencia.frontend.air.workflow.AirShoppingContinuation&sp=SWelcome&e_ts=1473264206182");
    }

    public TravelHomePAge(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TravelHomePAge(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }



    /**
     * Click on All Flights Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickAllFlightsLink() {
        allFlights.click();
        return this;
    }

    /**
     * Click on All Trips Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickAllTripsLink() {
        allTrips.click();
        return this;
    }

    /**
     * Click on Back Button.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickBackButton() {
        back.click();
        return this;
    }

    /**
     * Click on Book Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickBookLink() {
    	elementsvisible(book);
    	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(book));
    	book.click();
        return this;
    }

    /**
     * Click on Cars Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCars1Link() {
        cars1.click();
        return this;
    }

    /**
     * Click on Cars Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCars2Link() {
        cars2.click();
        return this;
    }

    /**
     * Click on Click Here To See The Latest Travel News Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickClickHereToSeeTheLatestLink() {
        clickHereToSeeTheLatest.click();
        return this;
    }

    /**
     * Click on Close Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCloseLink() {
        close.click();
        return this;
    }

    /**
     * Click on Completed Trips Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCompletedTripsLink() {
        completedTrips.click();
        return this;
    }

    /**
     * Click on Contact Your Invoice Care Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickContactYourInvoiceCareLink() {
        contactYourInvoiceCare.click();
        return this;
    }

    /**
     * Click on Country Watch Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCountryWatchLink() {
        countryWatch.click();
        return this;
    }

    /**
     * Click on Current Trips Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCurrentTripsLink() {
        currentTrips.click();
        return this;
    }

    /**
     * Click on Customer Invoice Care Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickCustomerInvoiceCareLink() {
        customerInvoiceCare.click();
        return this;
    }

    /**
     * Click on Direct Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickDirectLink() {
        direct.click();
        return this;
    }

    /**
     * Click on Egencia Promise Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickEgenciaPromiseLink() {
        egenciaPromise.click();
        return this;
    }

    /**
     * Click on Explore Our Mobile App For Ios And Android Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickExploreOurMobileAppForLink() {
        exploreOurMobileAppFor.click();
        return this;
    }

    /**
     * Click on Flights Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickFlights1Link() {
        flights1.click();
        return this;
    }

    /**
     * Click on Flights Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickFlights2Link() {
        flights2.click();
        return this;
    }

    /**
     * Click on Hide Forever Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHideForeverLink() {
        hideForever.click();
        return this;
    }

    /**
     * Click on Hide Once Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHideOnceLink() {
        hideOnce.click();
        return this;
    }

    /**
     * Click on Hotels Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHotels1Link() {
        hotels1.click();
        return this;
    }

    /**
     * Click on Hotels Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHotels2Link() {
        hotels2.click();
        return this;
    }

    /**
     * Click on How Do I Navigate On My Egencia Private Website Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHowDoINavigateOnLink() {
        howDoINavigateOn.click();
        return this;
    }

    /**
     * Click on How Do I Specify An Airline Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHowDoISpecifyAnLink() {
        howDoISpecifyAn.click();
        return this;
    }

    /**
     * Click on How To Start A Search Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickHowToStartASearchLink() {
        howToStartASearch.click();
        return this;
    }

    /**
     * Click on Is There A Time To Book Online Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickIsThereATimeToLink() {
        isThereATimeTo.click();
        return this;
    }

    /**
     * Click on Mr. Parveen Rawat Site Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickMrParveenRawatSiteLink() {
        mrParveenRawatSite.click();
        return this;
    }

    /**
     * Click on Multiple Destinations Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickMultipleDestinationsLink() {
        multipleDestinations.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickNextLink() {
        next.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on One Way Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickOneWayLink() {
        oneWay.click();
        return this;
    }

    /**
     * Click on Online Checkin Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickOnlineCheckinLink() {
        onlineCheckin.click();
        return this;
    }

    /**
     * Click on Prev Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickPrevLink() {
        prev.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Profile Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickProfileLink() {
        profile.click();
        return this;
    }


    /**
     * Click on Search Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickSignOutLink() {
    	
    	
    	
    	
    	
    	signOut.click();
        return this;
    }
    
    
public TravelHomePAge clickSignOutLink_moveTo() {
    	
    	
    	
	moveToelement(    	signOut);
    	
    	signOut.click();
        return this;
    }

    
    public TravelHomePAge moveToelement(WebElement element)
    {
new Actions(driver).moveToElement(element);
    	
return this;
    }
    
    
    
    public TravelHomePAge elementsvisible(WebElement element)
    {
    	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
    	
return this;
    }
    
    /**
     * Click on 1 Stop Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickStopLink1() {
        stop1.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickTermsOfUseLink() {
        termsOfUse.click();
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickToolsLink() {
        tools.click();
        return this;
    }

    /**
     * Click on Trains Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickTrains1Link() {
        trains1.click();
        return this;
    }

    /**
     * Click on Trains Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickTrains2Link() {
        trains2.click();
        return this;
    }

    /**
     * Click on Travel News Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickTravelNewsLink() {
        travelNews.click();
        return this;
    }

    /**
     * Click on Trips Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickTripsLink() {
        trips.click();
        return this;
    }

    /**
     * Click on Visas Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickVisasLink() {
        visas.click();
        return this;
    }

    /**
     * Click on What Are The Total Number Of Travellers For Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickWhatAreTheTotalNumberLink() {
        whatAreTheTotalNumber.click();
        return this;
    }

    /**
     * Click on What Is The Premium Economy Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickWhatIsThePremiumEconomyLink() {
        whatIsThePremiumEconomy.click();
        return this;
    }

    /**
     * Click on Why Do I Have To Choose A Cabin Class Link.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge clickWhyDoIHaveToLink() {
        whyDoIHaveTo.click();
        return this;
    }


    /**
     * Set default value to Departing From Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartingFromTextField() {
        return setDepartingFromTextField(data.get("DEPARTING_FROM"));
    }

    /**
     * Set value to Departing From Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartingFromTextField(String departingFromValue) {
        departingFrom.sendKeys(departingFromValue);
        return this;
    }

    /**
     * Set default value to Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartureDate1DropDownListField() {
        return setDepartureDate1DropDownListField(data.get("DEPARTURE_DATE_1"));
    }

    /**
     * Set value to Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartureDate1DropDownListField(String departureDate1Value) {
        departureDate1.sendKeys(departureDate1Value);
        return this;
    }

    /**
     * Set default value to Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartureDate2DropDownListField() {
        return setDepartureDate2DropDownListField(data.get("DEPARTURE_DATE_2"));
    }

    /**
     * Set value to Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setDepartureDate2DropDownListField(String departureDate2Value) {
        new Select(departureDate2).selectByVisibleText(departureDate2Value);
        return this;
    }

    /**
     * Set default value to Franais English Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setFranaisEnglishDropDownListField() {
        return setFranaisEnglishDropDownListField(data.get("FRANAIS_ENGLISH"));
    }

    /**
     * Set value to Franais English Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setFranaisEnglishDropDownListField(String franaisEnglishValue) {
        new Select(franaisEnglish).selectByVisibleText(franaisEnglishValue);
        return this;
    }

    /**
     * Set default value to Going To Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setGoingToTextField() {
        return setGoingToTextField(data.get("GOING_TO"));
    }

    /**
     * Set value to Going To Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setGoingToTextField(String goingToValue) {
        goingTo.sendKeys(goingToValue);
        return this;
    }

    /**
     * Set default value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate10DropDownListField() {
        return setReturnDate10DropDownListField(data.get("RETURN_DATE_10"));
    }

    /**
     * Set value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate10DropDownListField(String returnDate10Value) {
        new Select(returnDate10).selectByVisibleText(returnDate10Value);
        return this;
    }

    /**
     * Set default value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate11DropDownListField() {
        return setReturnDate11DropDownListField(data.get("RETURN_DATE_11"));
    }

    /**
     * Set value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate11DropDownListField(String returnDate11Value) {
        new Select(returnDate11).selectByVisibleText(returnDate11Value);
        return this;
    }

    /**
     * Set default value to Return Date Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate4TextField() {
        return setReturnDate4TextField(data.get("RETURN_DATE_4"));
    }

    /**
     * Set value to Return Date Text field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate4TextField(String returnDate4Value) {
        returnDate4.sendKeys(returnDate4Value);
        return this;
    }

    /**
     * Set default value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate5DropDownListField() {
        return setReturnDate5DropDownListField(data.get("RETURN_DATE_5"));
    }

    /**
     * Set value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate5DropDownListField(String returnDate5Value) {
        new Select(returnDate5).selectByVisibleText(returnDate5Value);
        return this;
    }

   
    /**
     * Set default value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate9DropDownListField() {
        return setReturnDate9DropDownListField(data.get("RETURN_DATE_9"));
    }

    /**
     * Set value to Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge setReturnDate9DropDownListField(String returnDate9Value) {
        new Select(returnDate9).selectByVisibleText(returnDate9Value);
        return this;
    }

    /**
     * Unset default value from Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetDepartureDate2DropDownListField() {
        return unsetDepartureDate2DropDownListField(data.get("DEPARTURE_DATE_2"));
    }

    /**
     * Unset value from Departure Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetDepartureDate2DropDownListField(String departureDate2Value) {
        new Select(departureDate2).deselectByVisibleText(departureDate2Value);
        return this;
    }

    /**
     * Unset default value from Franais English Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetFranaisEnglishDropDownListField() {
        return unsetFranaisEnglishDropDownListField(data.get("FRANAIS_ENGLISH"));
    }

    /**
     * Unset value from Franais English Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetFranaisEnglishDropDownListField(String franaisEnglishValue) {
        new Select(franaisEnglish).deselectByVisibleText(franaisEnglishValue);
        return this;
    }

    /**
     * Unset default value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate10DropDownListField() {
        return unsetReturnDate10DropDownListField(data.get("RETURN_DATE_10"));
    }

    /**
     * Unset value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate10DropDownListField(String returnDate10Value) {
        new Select(returnDate10).deselectByVisibleText(returnDate10Value);
        return this;
    }

    /**
     * Unset default value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate11DropDownListField() {
        return unsetReturnDate11DropDownListField(data.get("RETURN_DATE_11"));
    }

    /**
     * Unset value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate11DropDownListField(String returnDate11Value) {
        new Select(returnDate11).deselectByVisibleText(returnDate11Value);
        return this;
    }

    /**
     * Unset default value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate5DropDownListField() {
        return unsetReturnDate5DropDownListField(data.get("RETURN_DATE_5"));
    }

    /**
     * Unset value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate5DropDownListField(String returnDate5Value) {
        new Select(returnDate5).deselectByVisibleText(returnDate5Value);
        return this;
    }

    /**
     * Unset default value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate9DropDownListField() {
        return unsetReturnDate9DropDownListField(data.get("RETURN_DATE_9"));
    }

    /**
     * Unset value from Return Date Drop Down List field.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge unsetReturnDate9DropDownListField(String returnDate9Value) {
        new Select(returnDate9).deselectByVisibleText(returnDate9Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge verifyPageLoaded() {
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
     * @return the HomepageTravel class instance.
     */
    public TravelHomePAge verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
    
    
}
