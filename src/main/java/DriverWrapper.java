import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {

    WebDriver driver;

    public DriverWrapper() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void init() {
        this.driver.get("https://www.saucedemo.com/");
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close() {
        this.driver.quit();
    }
}
