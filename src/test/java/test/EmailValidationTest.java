package test;

import base.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CalculatorPage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmailValidationTest extends TestBase {
    @Test
    public void itShouldDisplayErrorWhenEmailListIsInvalid() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.enterEmail("arsenal");
        System.out.println(driver.findElement(By.xpath("//div[input[@id='emailInput']]")).getAttribute("class").contains("error"));
    };


    private List<String> readInvalidEmails() throws FileNotFoundException {
    FileReader invalidtxt = new FileReader(new File("src/test/resources/invalid.txt"));
    List<String> invalidEmailList = new ArrayList<String>();
    invalidEmailList = new BufferedReader(invalidtxt).lines().collect(Collectors.toList());
    return invalidEmailList;

    }
}