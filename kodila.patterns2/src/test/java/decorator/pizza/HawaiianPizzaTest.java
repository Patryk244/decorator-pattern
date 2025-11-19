package decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HawaiianPizzaTest {

    @Test
    void hawaiianPizzaPriceTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        BigDecimal price = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(15).add(new BigDecimal(5)), price);
    }

    @Test
    void hawaiianPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(4, gradients.size());
        assertEquals("pineapple", gradients.get(0));
    }

    @Test
    void hawaiianAndMushroomPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new MushroomPizza(pizzaOrder);

        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(5, gradients.size());
        assertEquals("mushrooms", gradients.get(0));
        assertEquals("pineapple", gradients.get(1));
    }

    @Test
    void mushroomAndHawaiianPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new MushroomPizza(pizzaOrder);
        pizzaOrder = new HawaiianPizza(pizzaOrder);

        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(5, gradients.size());
        assertEquals("pineapple", gradients.get(0));
        assertEquals("mushrooms", gradients.get(1));
    }
}
