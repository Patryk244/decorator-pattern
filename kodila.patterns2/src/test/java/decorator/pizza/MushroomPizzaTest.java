package decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MushroomPizzaTest {

    @Test
    void mushroomPizzaPriceTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new MushroomPizza(pizzaOrder);
        BigDecimal price = pizzaOrder.getPrice();

        assertEquals(new BigDecimal(18), price);
    }

    @Test
    void mushroomPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new MushroomPizza(pizzaOrder);
        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(4, gradients.size());

    }

    @Test
    void mushroomAndHawaiianPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new MushroomPizza(pizzaOrder);
        pizzaOrder = new HawaiianPizza(pizzaOrder);

        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(5, gradients.size());
    }

    @Test
    void hawaiianAndMushroomPizzaGradientsTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new MushroomPizza(pizzaOrder);

        ArrayList<String> gradients = pizzaOrder.getGradients();

        assertEquals(5, gradients.size());
    }
}
