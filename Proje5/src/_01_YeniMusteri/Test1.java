package _01_YeniMusteri;

import Utility.BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseDriver {
    Elements loca = new Elements();
    WebDriverWait wait;

    @Test
    void Case1() {
        driver.get("https://itera-qa.azurewebsites.net/");

        loca.signUp.click();

        loca.firstName.sendKeys("Yasin");

        loca.surname.sendKeys("Tufan");

        loca.epost.sendKeys("yasin123@gmail.com");

        loca.mobile.sendKeys("54585978");

        loca.username.sendKeys("yasin234");

        loca.password.sendKeys("1234567");

        loca.ConfirmPassword.sendKeys("1234567");

        loca.submit.click();

    }


    @Test
    void Case2() {
        driver.get("https://itera-qa.azurewebsites.net");

        loca.login.click();

        loca.username.sendKeys("yasin234");

        loca.password.sendKeys("1234567");

        loca.login1.click();

        WebElement assert1 = driver.findElement(By.cssSelector("div>h3"));
        System.out.println(assert1.getText());

        Assert.assertEquals("Welcome yasin234", assert1.getText());

    }

    @Test
    void Case3() {

       loca.logout.click();

        loca.login.click();

        loca.username.sendKeys("yasin234");

        loca.password.sendKeys("1234567");

        loca.login1.click();

        WebElement createNew = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        createNew.click();

        loca.name.sendKeys("yasin");

        loca.company.sendKeys("Techno Study");

        loca.adres.sendKeys("Türkiye");

        loca.city.sendKeys("Ankara");

        loca.phone.sendKeys("5631341");

        loca.email.sendKeys("yasdni@gmail.com");

        loca.create.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard"));



    }

}
