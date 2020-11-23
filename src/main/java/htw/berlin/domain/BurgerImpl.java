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
    return new BigDecimal(0);
  }

  @Override
  public double calculateCalories() {
    // TODO (3): Gesamtkalorien des Burgers auf Basis der Kalorien der Einzelzutaten berechnen
    return 0;
  }

  @Override
  public List<Ingredient> getIngredients() {
    return ingredients;
  }
}
