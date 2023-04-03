package _01_YeniMusteri;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(linkText = "Login")
    public WebElement login;


    @FindBy(linkText = "Sign Up")
    public WebElement signUp;

    @FindBy(css = "#FirstName")
    public WebElement firstName;

    @FindBy(css = "#Surname")
    public WebElement surname;

    @FindBy(css = "#E_post")
    public WebElement epost;

    @FindBy(css = "#Mobile")
    public WebElement mobile;

    @FindBy(css = "#Username")
    public WebElement username;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(css = "#ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy(css = "#submit")
    public WebElement submit;

    @FindBy(css = "[value='Login']")
    public WebElement login1;

    @FindBy(linkText = "Log out")
    public WebElement logout;

    @FindBy(css = "#Name")
    public WebElement name;

    @FindBy(css = "#Company")
    public WebElement company;

    @FindBy(css = "#Address")
    public WebElement adres;

    @FindBy(css = "#City")
    public WebElement city;

    @FindBy(css = "#Phone")
    public WebElement phone;

    @FindBy(css = "#Email")
    public WebElement email;

    @FindBy(css = "[value='Create']")
    public WebElement create;


}
