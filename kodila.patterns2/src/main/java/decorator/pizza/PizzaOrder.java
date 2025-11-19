package decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface PizzaOrder {
    BigDecimal getPrice();
    ArrayList<String> getGradients();
}
