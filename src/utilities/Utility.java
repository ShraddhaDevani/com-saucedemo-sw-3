package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) { //Locator return type is By and by is variable
        driver.findElement(by).click();
    }

    /**
     * This method will send keys on Element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    /**
     * This method will get text from element
     */


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method is for verifying the text
     */
    public void verifyElements(String displayMessage, String expectedMessage, By by) {
        String Message = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, Message);
    }
    public boolean getNumberFromElement(By by,int expectedNumber){
        int actualNumber = driver.findElements(by).size();
        Assert.assertEquals(expectedNumber,actualNumber);
        return true;
    }
}





