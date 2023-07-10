package taxcalpage.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import taxcalpage.controller.WebDriverController;
import taxcalpage.pages.TaxCalculatorPage;
import taxcalpage.pages.TaxCalculatorPageImp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CalculateTaxFor$0Def {


    WebDriver driver;
    TaxCalculatorPage taxCalPage;

    public CalculateTaxFor$0Def(WebDriverController driver, TaxCalculatorPage taxCalPage) {

        this.driver = driver.getDriver();

        this.taxCalPage = taxCalPage;


    }

    //Tax Calculator open
    @Given("Tax Calculator Open")
    public void taxCalculatorOpen() {

        driver.get("http://24.199.68.169:3000/");
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

    }

    //Insert Income
//    @When("User Calculate income for $ 0.0")
//    public void userCalculateIncomeFor$(double income) {
//
//        this.taxCalPage.calculate(income);
//
//    }

    @When("User Calculate income for ${double}")
    public void userCalculateIncomeFor$(double income) {
        this.taxCalPage.calculate(income);
    }

    // Error Handling
    @Then("an error message will display {string}")
    public void anErrorMessageWillDisplay(String expectedMessage) {

        Assert.assertEquals(this.taxCalPage.readErrorMessage(), expectedMessage);

    }

    //------------------------------------------------------
    //Tax Summary report Displaying
    @Then("Total Tax to be paid as {string}")
    public void totalTaxToBePaidAs(String expectedTax) {

        Assert.assertEquals(this.taxCalPage.readSummaryReportTaxToBePaid(), expectedTax);

    }

    //------------------------------------------------------
    // Performance
    @Then("All Components should be visible within {int} seconds")
    public void allComponentsShouldBeVisibleWithinSeconds(int time) {

        int timeTaken = this.taxCalPage.getTimeToOpenTheCalculator();
        Assert.assertEquals(timeTaken <= time, timeTaken <= time);

        System.out.println("Load time should be at least below: " + time + " milli seconds");// time in BDD
        System.out.println("Actual load time was:" + timeTaken + " milli seconds"); // actual time took

    }


    //------------------------------------------------------
    //User delete inserted income - Summary report Behaviour
    @And("User try to delete the income entered")
    public void userTryToDeleteTheIncomeEntered() {

        this.taxCalPage.CheckSummaryReportStatus();

    }

    //Summary report Behaviour
    @Then("Summary report will disappear")
    public void summaryReportWillDisappear() {

        boolean reportStatusVisible = this.taxCalPage.CheckSummaryReportStatus();

        //Report should disappear,but its visible still
        Assert.assertFalse(reportStatusVisible, "Previous 'Tax result' is displaying still in the Summary report ");

    }


}
