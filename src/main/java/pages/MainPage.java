package pages;

import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class MainPage extends ReusableMethods {

    private static final By BUS_BUTTON = By.xpath("//a[@data-event-action='Bus']");
    private static final By PLANE_BUTTON = By.xpath("//a[@data-event-action='Flight']");
    private static final By HOTEL_BUTTON = By.xpath("//a[@data-event-action='Hotel']");
    private static final By CAR_BUTTON = By.xpath("//a[@data-event-action='RentCar']");
    private static final By FERRYBOAT_BUTTON = By.xpath("//a[@data-event-action='Sea']");

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
}
