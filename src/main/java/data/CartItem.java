package data;

import lombok.Builder;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//@AllArgsConstructor
@Getter
@Builder
public class CartItem {
    private WebElement name;
    private WebElement price;
    private WebElement quantity;


    public CartItem(WebElement name, WebElement price, WebElement quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "name=" + name.findElement(By.tagName("a")).getAttribute("href") +
                 ", price=" + price.getText() +", quantity=" + quantity.getAttribute("value") +
                '}';
    }
}

