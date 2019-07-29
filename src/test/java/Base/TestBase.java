package Base;


import org.junit.After;
import org.junit.Before;
import org.

public class testBase
WebDriver driver;

@Before
public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/savingscalculator.php");
        }
@After
public void TearDown() {
        driver.close();
        driver.quit();
        }
