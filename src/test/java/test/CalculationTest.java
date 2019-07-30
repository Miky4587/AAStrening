package test;

import base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.CalculatorPage;

public class CalculationTest extends TestBase {



    @Test
    public void itShouldCalculateTotalIncome() {
        CalculatorPage calPage = new CalculatorPage(driver);
        calPage.selectFund("McDuck's safe");
        calPage.oneTimeInvestmentInput("5000");
        calPage.enterYears("10");
        calPage.enterEmail("aaa@bbb.ccc");
        driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText();
        Assert.assertFalse(driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText().contains("kr"));
    }

    @Test
    public void itShouldCalculateInterestIncome() {
        CalculatorPage calPage = new CalculatorPage(driver);
        calPage.selectFund("McDuck's safe");
        calPage.oneTimeInvestmentInput("5000");
        calPage.enterYears("10");
        calPage.enterEmail("aaa@bbb.ccc");
    }

    @Test
    public void itShouldCalculateRisk() {
        CalculatorPage calPage = new CalculatorPage(driver);
        calPage.selectFund("McDuck's safe");
        calPage.oneTimeInvestmentInput("5000");
        calPage.enterYears("10");
        calPage.enterEmail("aaa@bbb.ccc");

    }

    @Test
    public void itShouldCalculateTotoalForEachFund(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        String[] arrayOfFunds = {"Batman's Cave Development", "McDuck's safe", "Tom & Jerry corp"};
        for (String arrayOfFund : arrayOfFunds) {
            calculatorPage.selectfund(arrayOfFund);
            calculatorPage.oneTimeInvestmentInput("5000");
            calculatorPage.enterYears( "10");
            calculatorPage.enterEmail("aaa@bbb.ccc");
            Assert.assertFalse(calculatorPage.getTotalIncome().isEmpty());
            Assert.assertTrue(calculatorPage.getTotalIncome().contains("kr"));
        }
    }

}

