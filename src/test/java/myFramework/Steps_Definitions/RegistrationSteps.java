package myFramework.Steps_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myFramework.pages.RegistrationPage;
import myFramework.utils.CommonUtils;
import myFramework.utils.ConfigurationsReader;
import myFramework.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RegistrationSteps {

    RegistrationPage rpage=new RegistrationPage();

    @Given("The user wants to go to the tutorialspoint registration page")
    public void the_user_wants_to_go_to_the_tutorialspoint_registration_page() {
        Driver.getDriver().get(ConfigurationsReader.getProperty("environmentUrl"));

    }
    @When("The user wants to enter the {string}")
    public void the_user_wants_to_enter_the(String FirstName) {
        rpage.firstName.sendKeys(FirstName);
    }
    @Then("The user wants to enter {string}")
    public void the_user_wants_to_enter(String LastName) {
        rpage.lastName.sendKeys(LastName);
    }
    @Then("The user wants to select Gender")
    public void the_user_wants_to_select_gender() {
        rpage.genderMale.click();
    }
    @Then("The user wants to select Years of Experience")
    public void the_user_wants_to_select_years_of_experience() {
        rpage.radioExperienceYear.click();
    }
    @Then("The user wants to enter the Date")
    public void the_user_wants_to_enter_the_date() {
       rpage.date.sendKeys("02/05/2018");
    }
    @Then("The user wants to select the Profession")
    public void the_user_wants_to_select_the_profession() {
        WebElement expWait =new WebDriverWait(Driver.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(rpage.professionAutomation));
        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(expWait).click().build().perform();
    }
    @Then("The user wants to upload a Profile Picture")
    public void the_user_wants_to_upload_a_profile_picture() {
        rpage.profilePhoto.sendKeys("C:\\Users\\berka\\OneDrive\\Masaüstü");

    }
    @Then("The user wants to select Flavors of Selenium")
    public void the_user_wants_to_select_flavors_of_selenium() {
        rpage.flavorsSelenium3.click();
    }
    @Then("The user wants to choose the Continent")
    public void the_user_wants_to_choose_the_continent() {
        Select select= new Select(rpage.continent);
        select.selectByVisibleText("North America");
    }
    @Then("The user wants to choose Selenium Commands")
    public void the_user_wants_to_choose_selenium_commands() {
        Select select= new Select(rpage.seleniumCommands);
        select.selectByIndex(4);
    }
    @Then("The user wants to click the Button")
    public void the_user_wants_to_click_the_button() {
        rpage.button.click();
    }

}
