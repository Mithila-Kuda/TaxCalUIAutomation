package taxcalpage.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import taxcalpage.pages.TaxCalculatorPage;
import taxcalpage.controller.WebDriverController;

public class Hooks {

    WebDriverController driver;
    TaxCalculatorPage taxCalPage;

    public Hooks(WebDriverController driver) {
        this.driver = driver;

    }

    @Before
    public void setUp() {


        driver.getDriver().manage().window().maximize();

    }

    @After
    public void wrapUp() {

        driver.getDriver().quit();
    }

}
