package taxcalpage.controller;

import org.openqa.selenium.WebDriver;

public interface WebDriverController {

    public WebDriver getDriver();

    public void setDriver(WebDriver driver);

    public void setupController();

    public default void teardownController() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
