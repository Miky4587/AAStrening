package test;

import base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CalculatorPage;

public class NewSavingRequestTest extends TestBase {

    @Test
    public void itShouldDisplayTotalIncomeInNewRequest() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.selectFund("McDuck's safe");
        calculatorPage.oneTimeInvestmentInput("5000");
        calculatorPage.enterYears("10");
        calculatorPage.enterEmail("aaa@bbb.ccc");
        String calculatedIncome = calculatorPage.getTotalIncome();
        calculatorPage.submitRequest();

        Assert.assertEquals(
                calculatedIncome,
                driver.findElement(By.xpath("//ul[contains(@class,'saving-list')]/li//div[contains(@class,'amounts')]/p/span")).getText());


                Assert.assertEquals(
                        calculatedIncome,
                        driver.findElement(By.cssSelector("ul.saving-list > li div.amounts > p > span")).getText());

    }

    @Test
    public void itShouldDisplayTwentyRequest() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        for (int i = 0; i < 20; i++) {
        calculatorPage.selectFund("McDuck's safe");
        calculatorPage.oneTimeInvestmentInput("100");
        calculatorPage.enterYears("14");
        calculatorPage.enterEmail("aaa@bbb.ccc");
        String calculatedIncome = calculatorPage.getTotalIncome();
        calculatorPage.submitRequest();
    }

    }
}

