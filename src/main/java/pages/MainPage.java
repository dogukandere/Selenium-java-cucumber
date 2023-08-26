package pages;

import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class MainPage extends ReusableMethods {

    private static final By BUS_BUTTON = By.xpath("//a[@data-event-action='Bus']");
    private static final By PLANE_BUTTON = By.xpath("//a[@data-event-action='Flight']");
    private static final By HOTEL_BUTTON = By.xpath("//a[@data-event-action='Hotel']");
    private static final By CAR_BUTTON = By.xpath("//a[@data-event-action='RentCar']");
    private static final By FERRYBOAT_BUTTON = By.xpath("//a[@data-event-action='Sea']");
    private static final By FIND_TICKET_BUTTON = By.xpath("//button[@id='search-button']");
    private static final By MORNING_BUTTON = By.xpath("//button[@data-item='m']");
    private static final By NOON_BUTTON = By.xpath("//button[@data-item='a']");
    private static final By EVENING_BUTTON = By.xpath("//button[@data-item='e']");

    public boolean isBusButtonDisplayed(){

        return isDisplayed(BUS_BUTTON);
    }

    public boolean isPlaneButtonDisplayed(){

        return isDisplayed(PLANE_BUTTON);
    }

    public boolean isHotelButtonDisplayed(){

        return isDisplayed(HOTEL_BUTTON);
    }

    public boolean isCarButtonDisplayed(){

        return isDisplayed(CAR_BUTTON);
    }

    public boolean isFerryboatButtonDisplayed(){

        return isDisplayed(FERRYBOAT_BUTTON);
    }

    public MainPage clickPlaneButton(){

        click(PLANE_BUTTON);
        return this;
    }

    public MainPage clickFindPlaneTicketButton(){

        click(FIND_TICKET_BUTTON);
        waitFor(6);
        return this;
    }

    public boolean isMorningButtonDisplayed(){

        return isDisplayed(MORNING_BUTTON);
    }

    public boolean isNoonButtonDisplayed(){

        return isDisplayed(NOON_BUTTON);
    }

    public boolean isEveningButtonDisplayed(){

        return isDisplayed(EVENING_BUTTON);
    }
}
