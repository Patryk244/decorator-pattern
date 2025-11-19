package decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public class HawaiianPizza extends AbstractOrderPizza {
    public HawaiianPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public ArrayList<String> getGradients() {
        ArrayList<String> gradients = new ArrayList<>(super.getGradients());
        gradients.add("pineapple");
        return gradients;
    }
}
