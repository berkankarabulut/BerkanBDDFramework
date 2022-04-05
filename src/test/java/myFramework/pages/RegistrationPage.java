package myFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;
    @FindBy(name = "lastname")
    public WebElement lastName;
    @FindBy(xpath = "//input[@value='Male']")
    public WebElement genderMale;
    @FindBy(xpath = "//input[@value='Female']")
    public WebElement genderFemale;
    @FindBy(xpath = "//input[@value='4']")
    public WebElement radioExperienceYear;
    @FindBy(xpath = "//tbody//tr[5]//input[@type='text']")
    public WebElement date;
    @FindBy(xpath = "//*[text()=' Manual Tester  ']")
    public WebElement professionManual;
    @FindBy(xpath = "//*[text()=' Automation Tester ']")
    public WebElement professionAutomation;
    @FindBy(name = "photo")
    public WebElement profilePhoto;
    @FindBy(xpath = "//input[@value='RC']")
    public WebElement flavorsSelenium1;
    @FindBy(xpath = "//input[@value='Selenium IDE']")
    public WebElement flavorsSelenium2;
    @FindBy(xpath = "//input[@value='Selenium Webdriver']")
    public WebElement flavorsSelenium3;
    @FindBy(name = "continents")
    public WebElement continent;
    @FindBy(xpath = "//select[@name='selenium_commands']")
    public WebElement seleniumCommands;
    @FindBy(name = "submit")
    public WebElement button;



}
