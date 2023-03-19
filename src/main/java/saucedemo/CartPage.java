package saucedemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    final WebDriver driver;

    public CartPage(WebDriver driver) { this.driver = driver; }

    public void checkout() {

        driver.findElement(By.cssSelector("#checkout")).click();
    }

    public void checkYourInfo() {

        driver.findElement(By.cssSelector("#first-name")).sendKeys("test");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("test");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("test");
        driver.findElement(By.cssSelector("#continue")).click();
    }

    public void finish() {
        driver.findElement(By.cssSelector("#finish")).click();
    }

    public String checkComplete() {
        WebElement complete = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        return complete.getText();
    }
}
