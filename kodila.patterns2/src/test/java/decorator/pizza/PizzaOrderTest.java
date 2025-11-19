package decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void basisPizzaPrice() {
        PizzaOrder pizzaOrder = new BasicPizza();
        BigDecimal price = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(15), price);
    }

    @Test
    void basisPizzaGradientPrice() {
        PizzaOrder pizzaOrder = new BasicPizza();

        ArrayList<String> gradient = pizzaOrder.getGradients();

        assertEquals(3, gradient.size());
    }

    @Test
    void hawaiianPizzaPrice() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);

        BigDecimal price = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(20), price);
    }

    @Test
    void hawaiianPizzaGradientPrice() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        ArrayList<String> gradient = pizzaOrder.getGradients();

        assertEquals(4, gradient.size());
    }

}