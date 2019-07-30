package test;

import base.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CalculatorPage;

public class EmailValidationTest extends TestBase {
    @Test
    public void itShouldDisplayErrorWhenEmailListIsInvalid() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.enterEmail("arsenal");
        System.out.println(driver.findElement(By.xpath("//div[input[@id='emailInput']]")).getAttribute("class").contains("error"));
    };
}

