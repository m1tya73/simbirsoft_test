package saucedemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {

    final WebDriver driver;

    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void singUp(String login, String password) {

        WebElement fieldUserName = driver.findElement(By.id("user-name"));
        fieldUserName.sendKeys(login);

        WebElement fieldPassword = driver.findElement(By.id("password"));
        fieldPassword.sendKeys(password);

        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();
    }
    public String checkError() {
        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
        return errorMsg.getText();
    }
}
