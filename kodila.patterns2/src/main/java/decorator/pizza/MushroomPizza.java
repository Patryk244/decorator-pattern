package decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MushroomPizza extends AbstractOrderPizza {
    public MushroomPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public ArrayList<String> getGradients() {
        ArrayList<String> gradients = new ArrayList<>(super.getGradients());
        gradients.add(0, "mushrooms");
        return gradients;
    }
}
