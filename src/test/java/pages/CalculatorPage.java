package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CalculatorPage {
    private WebDriver pageDriver;

    public CalculatorPage(WebDriver pageDriver) {
        this.pageDriver = pageDriver;
    }

    public void selectFund(String fundToBeSelected) {
        new Select(pageDriver.findElement(By.id("fundSelect"))).selectByVisibleText(fundToBeSelected);


    }
}


