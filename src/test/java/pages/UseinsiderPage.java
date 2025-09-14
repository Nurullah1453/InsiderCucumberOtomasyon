package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class UseinsiderPage {
    // ARTIK herhangi bir url'deki locate'leri
    // tekrar tekrar yapmayacagiz
    // her url icin bir page class'i olusturup
    // o url deki tum locate'leri Page class'inda kaydedecegiz

    public UseinsiderPage(){
        // locate'lerin calisabilmesi icin, WebDriver objesini page class'ina tanitmamiz gerekir
        // POM WebDriver tanitma islemini constructor icinde yapar
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@id='navbarDropdownMenuLink'])[5]")
    public WebElement companyButton;

    @FindBy(xpath = "//*[text()='Careers']")
    public WebElement CareersDropDownMenu;

    @FindBy(xpath = "//h3[contains(text(),'Our Locations')]")
    public WebElement locationsText;

    @FindBy(xpath = "//*[text()='Life at Insider']")
    public WebElement lifeAtInsiderText;

    @FindBy(xpath = "//*[text()='See all teams']")
    public WebElement teamsText;

    @FindBy(xpath = "//*[text()='See all QA jobs']")
    public WebElement seeAllQAButton;

    @FindBy(xpath = "//*[text()='Filter by Location']")
    public WebElement filterByLocation;

    @FindBy(xpath = "//*[text()='Filter by Department']")
    public WebElement filterByDepartment;

    @FindBy(xpath = "//*[text()='Accept All']")
    public WebElement cookieAcceptAll;

    @FindBy(xpath = "//*[@id='select2-filter-by-location-container']")
    public WebElement filterByLocationAll;

    @FindBy(xpath = "//*[text()='Istanbul, Turkiye']")
    public WebElement IstanbulTurkey;

    @FindBy(xpath = "//*[@id='select2-filter-by-location-results']")
    public WebElement DropDownDown;

    @FindBy(xpath = "//div[@class='position-list-item-wrapper bg-light']")
    public WebElement seniorSoftwareQuality;

    @FindBy(xpath = "(//*[text()='View Role'])[1]")
    public WebElement viewRole;

    @FindBy(xpath = "//*[text()='Apply for this job']")
    public WebElement ApplyForThisJob;

    @FindBy(xpath = "//*[text()='All open positions']")
    public WebElement AllOpenPositions;

}
