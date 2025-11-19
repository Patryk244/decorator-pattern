package decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BasicPizza implements PizzaOrder {
    private ArrayList<String> basicGradients() {
        ArrayList<String> gradients = new ArrayList<>();
        gradients.add("dough");
        gradients.add("tomato sauce");
        gradients.add("cheese");
        return gradients;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15.00);
    }

    @Override
    public ArrayList<String> getGradients() {
        return basicGradients();
    }
}
