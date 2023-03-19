package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    final WebDriver driver;

    public ProductsPage(WebDriver driver) { this.driver = driver; }

    public void addToCart() {
        WebElement buttonAdd = driver.findElement(By.xpath("//div[@class=\"inventory_item\"][1]//button[text()=\"Add to cart\"]"));
        buttonAdd.click();
    }
    public void tapCart(){
        WebElement buttonCart = driver.findElement(By.xpath("//div[@class=\"shopping_cart_container\"]//a[@class = \"shopping_cart_link\"]"));
        buttonCart.click();
    }
}
