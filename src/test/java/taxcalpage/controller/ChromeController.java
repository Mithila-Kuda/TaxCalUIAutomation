package taxcalpage.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeController implements WebDriverController {

    public ChromeController() {
        setupController();
    }

    private WebDriver driver;

    @Override
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void setupController() {
        // setup web driver
        WebDriverManager.chromedriver().setup(); // ( web driver = web site)
        // open web driver
        driver = new ChromeDriver();
    }

}
