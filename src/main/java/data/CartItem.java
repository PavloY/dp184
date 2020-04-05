package data;

import jdk.nashorn.internal.objects.annotations.Getter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//@AllArgsConstructor

public class CartItem {
    private WebElement name;
    private WebElement price;


    public CartItem(WebElement name, WebElement price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "name=" + name.findElement(By.tagName("a")).getAttribute("href") +
                 ", price=" + price.getText() +
                '}';
    }
}

