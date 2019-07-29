package Test;

import Base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SavingCalculatorTest extends TestBase {


    @Test
    public void itShouldBeTitle() {
        driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertEquals("Savings Calculator", driver.findElement(By.cssSelector("h1")).getText());
    }

    @Test
    public void ItShouldEnableApllyButton() {
        new Select(driver.findElement(By.id("fundSelect"))).selectByVisibleText("McDuck's safe");
        driver.findElement(By.id("fundSelect")).sendKeys("McDuck's safe");
        driver.findElement(By.id("oneTimeInvestmentInput")).sendKeys("5000");
        driver.findElement(By.id("yearsInput")).sendKeys("10");
        driver.findElement(By.id("emailInput")).sendKeys("aaa@bbb.ccc");
    }


    @Test
    public void itShouldByDisableApplyButtonOnPageOpen() {
        driver.findElement(By.cssSelector("button.btn-block")).isEnabled();
    }

    @Test
    public void itShouldNotSelectAnyFoundOnPageOpen(){
        new Select(driver.findElement(By.id("fundSelect"))).getFirstSelectedOption().getText();
        System.out.println(new Select(driver.findElement(By.id("fundSelect"))).getFirstSelectedOption().getText());
        Assert.assertEquals("Select your fund",new Select(driver.findElement(By.id("fundSelect"))).getFirstSelectedOption().getText()
        );

    }

}

