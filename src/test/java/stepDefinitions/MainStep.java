package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.*;

import pages.MainPage;
import utilities.DriverFactory;

public class MainStep {

    private static MainPage mainPage;

    @Before
    public static void tearUp(){
        DriverFactory.getDriver();
        mainPage = new MainPage();
    }

    @When("check the bus button")
    public void check_the_bus_button()  {
       assertTrue(mainPage.isBusButtonDisplayed());
    }

    @Then("check the plane button")
    public void check_the_plane_button() {
        assertTrue(mainPage.isPlaneButtonDisplayed());
    }

    @Then("check the hotel button")
    public void check_the_hotel_button() {
        assertTrue(mainPage.isHotelButtonDisplayed());
    }

    @Then("check the car button")
    public void check_the_car_button() {
        assertTrue(mainPage.isCarButtonDisplayed());
    }

    @Then("check the ferryboat button")
    public void check_the_ferryboat_button() {
        assertTrue(mainPage.isFerryboatButtonDisplayed());
    }

    @When("click plane button")
    public void click_plane_button() {
        mainPage.clickPlaneButton();
    }

    @Then("click find ticket button")
    public void clickFindTicketButton() {
        mainPage.clickFindPlaneTicketButton();
    }

    @Then("check morning button")
    public void checkMorningButton() {
        assertTrue(mainPage.isMorningButtonDisplayed());
    }

    @Then("check noon button")
    public void checkNoonButton() {
        assertTrue(mainPage.isNoonButtonDisplayed());
    }

    @Then("check evening button")
    public void checkEveningButton() {
        assertTrue(mainPage.isEveningButtonDisplayed());
    }
}
