package utilities;

import io.cucumber.java.After;

public class Hooks {

    @After
    public static void tearDown() {
        DriverFactory.closeDriver();
    }
}
