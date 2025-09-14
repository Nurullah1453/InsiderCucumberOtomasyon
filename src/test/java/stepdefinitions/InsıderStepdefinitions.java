package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.engine.TestExecutionResult;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.UseinsiderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class InsıderStepdefinitions {
    UseinsiderPage useinsiderPage = new UseinsiderPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici useinsider anasayfaya gider")
    public void kullanici_useinsider_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("Company menusu secilir")
    public void Company_menusu_secilir() {
        useinsiderPage.companyButton.click();
    }
    @Then("Careers sekmesi acilir")
    public void Careers_sekmesi_acilir() {
        useinsiderPage.CareersDropDownMenu.click();
        ReusableMethods.bekle(5);
    }

    @When("locations gorunebililirligi test edilir")
    public void locations_test_edilir() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", useinsiderPage.locationsText);
        ReusableMethods.bekle(5);
        Assertions.assertTrue(useinsiderPage.locationsText.isDisplayed());
    }

    @When("life at insider gorunebilirligi test edilir")
    public void life_at_insider_test_edilir() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", useinsiderPage.lifeAtInsiderText);
        ReusableMethods.bekle(5);
        Assertions.assertTrue(useinsiderPage.lifeAtInsiderText.isDisplayed());
    }

    @When("teams gorunebilirligi test edilir")
    public void teams_test_edilir() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", useinsiderPage.locationsText);
        ReusableMethods.bekle(5);
        Assertions.assertTrue(useinsiderPage.lifeAtInsiderText.isDisplayed());
    }

    @Given("useInseder anasayfaya gider")
    public void kullanici_useinsider_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("secondUrl"));
        ReusableMethods.bekle(5);
        if (useinsiderPage.cookieAcceptAll.isDisplayed()){
            useinsiderPage.cookieAcceptAll.click();
        }
    }

    @When("See all QA jobs butonuna tiklar")
    public void seeAll_QA_butonuna_tiklar() {
        useinsiderPage.seeAllQAButton.click();
        ReusableMethods.bekle(10);
    }

    @When("byLocation ve Department gorunurlugu test edilir")
    public void byLocation_ve_Department_test_edilir() {
        Assertions.assertTrue(useinsiderPage.filterByDepartment.isDisplayed());
        Assertions.assertTrue(useinsiderPage.filterByLocation.isDisplayed());
    }

    @When("All dropdown menusu acilir")
    public void All_dropdown_menusu_acilir() {
        actions.sendKeys(Keys.PAGE_DOWN);
        useinsiderPage.filterByLocationAll.click();
        ReusableMethods.bekle(5);

    }
    @When("ıstanbulTurkey bulundugu test edilir")
    public void istanbulTurkey_bulundugu_test_edilir() {
        Assertions.assertTrue(useinsiderPage.IstanbulTurkey.isDisplayed());
        ReusableMethods.bekle(3);
        useinsiderPage.AllOpenPositions.click();
    }

    @When("view rol click ve test edilir")
    public void view_rol_click_ve_test_edilir() {
        // Scroll down
        ReusableMethods.bekle(2);
        //((JavascriptExecutor) Driver.getDriver())
        //        .executeScript("arguments[0].scrollIntoView(true);", useinsiderPage.viewRole);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", useinsiderPage.viewRole);
        ReusableMethods.bekle(1);
        useinsiderPage.viewRole.click();

        ReusableMethods.bekle(1);
        actions.moveToElement(useinsiderPage.seniorSoftwareQuality).perform();
        useinsiderPage.viewRole.click();

        ReusableMethods.bekle(2);

        // Move to the element

        ReusableMethods.bekle(2);

        // Click on "View Role"
        useinsiderPage.viewRole.click();

        // Switch to the new window
        ReusableMethods.urlIleWindowGecisi(Driver.getDriver(), ConfigReader.getProperty("jobUrl"));

        // Assert the element is displayed
        Assertions.assertTrue(useinsiderPage.ApplyForThisJob.isDisplayed());
    }



}
