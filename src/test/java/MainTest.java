import org.junit.*;
import saucedemo.AuthPage;
import saucedemo.CartPage;
import saucedemo.ProductsPage;

public class MainTest {

    final DriverWrapper driverWrapper = new DriverWrapper();

    @Before
    public void setUp() {
        driverWrapper.init();
    }

    @After
    public void tearDown() {
        driverWrapper.close();
    }

    @Test
    public void caseOne() {
        AuthPage authPage = new AuthPage(driverWrapper.driver);
        authPage.singUp("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(driverWrapper.driver);
        productsPage.addToCart();
        productsPage.tapCart();
        CartPage cartPage = new CartPage(driverWrapper.driver);
        cartPage.checkout();
        cartPage.checkYourInfo();
        cartPage.finish();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", cartPage.checkComplete());
    }

    @Test
    public void caseTwo() {
        AuthPage authPage = new AuthPage(driverWrapper.driver);
        authPage.singUp("test", "test");
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", authPage.checkError());
    }
}

