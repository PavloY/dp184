package test.unitTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.ProductReturnsPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class ProductReturnsPageTest extends BaseTest {
    ProductReturnsPage productReturnsPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productReturnsPage = new ProductReturnsPage(driver);
        driver.get("http://184-dp.tk/index.php?route=account/return/add");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productReturnsPage = null;
    }

    @Test
    public void fillFirstName() {
        productReturnsPage.fillFirstName(" ");
        productReturnsPage.clickOnSubmitButton();
        String expected = "First Name must be between 1 and 32 characters!";
        String actual = productReturnsPage.getWarningForFirstName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillLastName() {
        productReturnsPage.fillLastName(" ");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Last Name must be between 1 and 32 characters!";
        String actual = productReturnsPage.getWarningForLastName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillEmail() {
        productReturnsPage.fillEmail(" ");
        productReturnsPage.clickOnSubmitButton();
        String expected = "E-Mail Address does not appear to be valid!";
        String actual = productReturnsPage.getWarningForEmail().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillTelephone() {
        productReturnsPage.fillTelephone(" ");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Telephone must be between 3 and 32 characters!";
        String actual = productReturnsPage.getWarningForTelephone().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillOrderId() {
        productReturnsPage.fillOrderId("");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Order ID required!";
        String actual = productReturnsPage.getWarningForOrderId().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillProductName() {
        productReturnsPage.fillProductName("");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Product Name must be greater than 3 and less than 255 characters!";
        String actual = productReturnsPage.getWarningForProductName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillProductCode() {
        productReturnsPage.fillProductCode("");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Product Model must be greater than 3 and less than 64 characters!";
        String actual = productReturnsPage.getWarningForProductCode().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillFirstName1() {
        productReturnsPage.fillFirstName("Lorem ipsum dolor sit amet, conse");
        productReturnsPage.clickOnSubmitButton();
        String expected = "First Name must be between 1 and 32 characters!";
        String actual = productReturnsPage.getWarningForFirstName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillLastName1() {
        productReturnsPage.fillLastName("Lorem ipsum dolor sit amet, conse");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Last Name must be between 1 and 32 characters!";
        String actual = productReturnsPage.getWarningForLastName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillTelephone1() {
        productReturnsPage.fillTelephone("Lorem ipsum dolor sit amet, conse");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Telephone must be between 3 and 32 characters!";
        String actual = productReturnsPage.getWarningForTelephone().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillProductName1() {
        productReturnsPage.fillProductName("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A diam sollicitudin tempor id eu nisl nunc. Ac tortor dignissim convallis aenean et tortor at risus viverra. Feugiat vivamus at augue");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Product Name must be greater than 3 and less than 255 characters!";
        String actual = productReturnsPage.getWarningForProductName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillProductCode1() {
        productReturnsPage.fillProductCode("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed does");
        productReturnsPage.clickOnSubmitButton();
        String expected = "Product Model must be greater than 3 and less than 64 characters!";
        String actual = productReturnsPage.getWarningForProductCode().getText();
        assertEquals(expected, actual);
    }
}