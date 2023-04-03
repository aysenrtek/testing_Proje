package Proje5;

import Utility.BaseDriverParameter;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Proje5 extends BaseDriverParameter {

    Elements1 el;


    @Test
    void Case1() {
        el = new Elements1(driver);
        driver.get("https://admin-demo.nopcommerce.com/login?");

        el.login.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"));

    }


    @Test
    void Case2() {

        el = new Elements1(driver);

        for (int i = 0; i < el.sekmeler.size(); i++) {
            if (el.sekmeler.get(i) == null) {// tıklanmıyorsa null verir..
                Assert.fail();
            }
            el.sekmeler.get(i).click();
        }
        for (WebElement list : el.sekmeler2) {
            if (list == null) {
                Assert.fail();
            }
        }

    }


    @Test
    void Case3() {

        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", el.customers);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", el.customers1);


        el.addNew.click();

        el.email.sendKeys("Group72_@gmail.com");

        Actions aksiyon = new Actions(driver);
        Tools.Bekle(2);
        aksiyon.moveToElement(el.email).sendKeys(Keys.TAB).sendKeys("1234566")
                .sendKeys(Keys.TAB).sendKeys("Group_7")
                .sendKeys(Keys.TAB).sendKeys("TestNG5").build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(el.gender));
        el.gender.click();

        el.dateOfBirth.sendKeys("1/1/2003");

        aksiyon.sendKeys(Keys.TAB).sendKeys("Techno Study").build().perform();

        el.exempyt.click();

        Tools.Bekle(3);

        Actions actions=new Actions(driver);

        js.executeScript("arguments[0].click();", el.save);


       // actions.moveToElement(el.save).click().build().perform();
        Tools.Bekle(3);

        System.out.println(el.succesMesage.getText());

        Assert.assertTrue(el.succesMesage.getText().toLowerCase().contains("added successfully"));
    }

    @Test
    public void Case4() {
        el = new Elements1(driver);
        el.sekmeler.get(2).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", el.customers1);

        el.searchEmail.sendKeys("Group_7");
        el.search.click();

        // Assert.assertTrue(el.mail.getText().contains("ismail@gmaiil.com"));


        js.executeScript("arguments[0].click();", el.edit);

        // el.edit.click();

        el.adminComment.sendKeys("boss");

        el.saveContine.click();


        Assert.assertTrue(el.succesMesage.getText().contains("successfully."));
        System.out.println(el.succesMesage.getText());


    }


    @Test
    void Case5() {

        el = new Elements1(driver);
        el.sekmeler.get(2).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", el.customers1);

        el.searchEmail.sendKeys("Group_7");
        el.search.click();

        js.executeScript("arguments[0].click();", el.edit);

        el.delete.click();

        wait.until(ExpectedConditions.elementToBeClickable(el.delete2));
        el.delete2.click();

        Assert.assertTrue(el.succesMesage.getText().contains("successfully"));
    }

    @Test
    void Case6() {
        Actions aksiyon=new Actions(driver);
        el = new Elements1(driver);
        el.searchTest.sendKeys("SHIPMENTS");

       aksiyon.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
       wait.until(ExpectedConditions.urlContains("Shipment"));

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("Shipment"));


    }


}
