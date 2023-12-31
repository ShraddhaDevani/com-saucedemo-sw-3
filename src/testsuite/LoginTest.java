package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    static String baseUrl = "https://www.saucedemo.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        sendTextToElement(By.id("user-name"), "visual_user");
       //Enter “secret_sauce” password
        sendTextToElement(By.id("password"), "secret_sauce");
       //Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));
       //Verify the text “PRODUCTS”
        verifyElements("error","Products",By.xpath("//span[@class='title']"));
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter the email to email field
        sendTextToElement(By.id("user-name"), "standard_user");

        // //Enter the password field
        sendTextToElement(By.id("password"), "secret_sauce");

        //Click on login button
        clickOnElement(By.xpath("//input[@id= 'login-button']"));

        //Verify that six products are displayed on page
        getNumberFromElement(By.className("inventory_item"), 6);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}