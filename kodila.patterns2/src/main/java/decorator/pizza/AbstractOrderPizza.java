package decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class AbstractOrderPizza implements PizzaOrder {
    private final PizzaOrder pizzaOrder;
    protected AbstractOrderPizza(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public ArrayList<String> getGradients() {
        return pizzaOrder.getGradients();
    }
}
