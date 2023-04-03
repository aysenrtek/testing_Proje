package Proje5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements1 {


    public Elements1(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;


    @FindBy(xpath = "(//*[@class='right fas fa-angle-left '])[4]")
    public WebElement customers;


    @FindBy(xpath = "(//a[@href='/Admin'])[3]/..//following-sibling::li")
    public List<WebElement> sekmeler;

    @FindBy(css = "[class='nav nav-treeview']")
    public List<WebElement> sekmeler2;

    //*[text()='Customers']

    @FindBy(css = "a[href='/Admin/Customer/List']")
    public WebElement customers1;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement addNew;

    @FindBy(css = "#Email")
    public WebElement email;

    @FindBy(css = "[id='Gender_Male']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='DateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "(//input[@name='IsTaxExempt'])[1]")
    public WebElement exempyt;


    @FindBy(css= "[name='save']")
    public WebElement save;

    @FindBy(css = "#Password")
    public WebElement password;


    @FindBy(css = "#AdminComment")
    public WebElement adminComment;


    @FindBy(xpath = "(//*[text()='Test store 2'])[1]")
    public WebElement newsletter;

    @FindBy(xpath = "(//*[@class='k-multiselect-wrap k-floatwrap'])[2]")
    public WebElement customerRoles;

    @FindBy(css = "#VendorId")
    public WebElement managerOfVendor;


    @FindBy(css = "#SearchEmail")
    public WebElement searchEmail;



    @FindBy(css = "#search-customers")
    public WebElement search;

    @FindBy(xpath = "//*[text()='ismail@gmaiil.com']")
    public WebElement mail;



    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement edit;

    //[class='alert alert-success alert-dismissable']
    @FindBy(css = "[class='alert alert-success alert-dismissable']")
    public WebElement succesMesage;

    @FindBy(name = "save-continue")
    public WebElement saveContine;


    @FindBy(css = "#customer-delete")
    public WebElement delete;


    @FindBy(css = " [class='btn btn-danger float-right']")
    public WebElement delete2;


    @FindBy(css = "[dir='auto']")
    public WebElement searchTest;
}
