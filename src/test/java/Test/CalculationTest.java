package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/savingscalculator.php");
    }

    @Test
    public void itShouldCalculateTotalIncome() {
        new Select(driver.findElement(By.id("fundSelect"))).selectByVisibleText("McDuck's safe");
        driver.findElement(By.id("oneTimeInvestmentInput")).sendKeys("5000");
        driver.findElement(By.id("yearsInput")).sendKeys("10");
        driver.findElement(By.id("emailInput")).sendKeys("aaa@bbb.ccc");
        driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText();
        Assert.assertFalse(driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.cssSelector("div.result > div:nth-child(1) > p")).getText().contains("kr"));
    }

    @Test
    public void itShouldCalculateInterestIncome() {
        new Select(driver.findElement(By.id("fundSelect"))).selectByVisibleText("McDuck's safe");
        driver.findElement(By.id("oneTimeInvestmentInput")).sendKeys("5000");
        driver.findElement(By.id("yearsInput")).sendKeys("10");
        driver.findElement(By.id("emailInput")).sendKeys("aaa@bbb.ccc");
    }

    @Test
    public void itShouldCalculateRisk() {
        new Select(driver.findElement(By.id("fundSelect"))).selectByVisibleText("McDuck's safe");
        driver.findElement(By.id("oneTimeInvestmentInput")).sendKeys("5000");
        driver.findElement(By.id("yearsInput")).sendKeys("10");
        driver.findElement(By.id("emailInput")).sendKeys("aaa@bbb.ccc");
    }


    @After
    public void TearDown() {
        driver.close();
        driver.quit();
    }

}

