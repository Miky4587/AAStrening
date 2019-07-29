package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SavingCalculatorTest {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/savingscalculator.php");
    }

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

    @After
    public void TearDown() {
 /*       driver.close();
          driver.quit(); */
    }

}

