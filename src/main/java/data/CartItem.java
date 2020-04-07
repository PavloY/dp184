package data;

import jdk.nashorn.internal.objects.annotations.Getter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//@AllArgsConstructor

public class CartItem {
    private WebElement name;
    private WebElement price;
    private WebElement quantity;
    private WebElement update;
    private WebElement remove;


    public CartItem(WebElement name, WebElement price, WebElement quantity,WebElement update, WebElement remove) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.update = update;
        this.remove = remove;

    }

    public WebElement getName() {
        return name;
    }

    public WebElement getPrice() {
        return price;
    }

    public WebElement getQuantity() {
        return quantity;
    }

    public WebElement getUpdate() {
        return update;
    }

    public WebElement getRemove() {
        return remove;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "name=" + name.findElement(By.tagName("a")).getAttribute("href") +
                 ", price=" + price.getText() +", quantity=" + quantity.getAttribute("value") +
                '}';
    }


}

