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

    public void submitrequest() {
    }

    public String getTotalIncome() {
        return pageDriver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText();
    }

    public void selectfund(String fundSelect){
        new Select(pageDriver.findElement(By.id("fundSelect"))).selectByVisibleText(fundSelect);
    }

    public void oneTimeInvestmentInput(String amountToEnter){
        pageDriver.findElement(By.id("oneTimeInvestmentInput")).sendKeys(amountToEnter);
    }

    public void enterYears(String yearsToEnter){
        pageDriver.findElement(By.id("yearsInput")).sendKeys(yearsToEnter);
    }

    public void enterEmail (String emailToEnter) {
        pageDriver.findElement(By.id("emailInput")).clear();
        pageDriver.findElement(By.id("emailInput")).sendKeys("emailToEnter");

    }

    public void submitRequest() {
        pageDriver.findElement(By.cssSelector("button.btn-block")).click();
    }
}


