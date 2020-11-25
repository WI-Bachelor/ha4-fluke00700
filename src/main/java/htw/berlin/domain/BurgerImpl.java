package htw.berlin.domain;

import java.math.BigDecimal;
import java.util.List;

public class BurgerImpl implements Burger {

    private final List<Ingredient> ingredients;

    public BurgerImpl(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public BigDecimal calculatePrice() {
        // TODO (2): Gesamtpreis des Burgers auf Basis der Preise der Einzelzutaten berechnen

        BigDecimal totalPrice = BigDecimal.ZERO;
        if (ingredients != null) {
            for (int i = 0; i < ingredients.size(); i++) {
                if (ingredients.get(i) != null) {
                    totalPrice = totalPrice.add(ingredients.get(i).getPrice());
                }

            }
        }
        return totalPrice;
    }

    @Override
    public double calculateCalories() {
        // TODO (3): Gesamtkalorien des Burgers auf Basis der Kalorien der Einzelzutaten berechnen
        double totalCalorie = 0;
        if (ingredients != null) {
            for (int i = 0; i < ingredients.size(); i++) {
                if (ingredients.get(i) != null) {
                    totalCalorie = totalCalorie+ingredients.get(i).getCalories();
                }

            }
        }
        return totalCalorie;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
