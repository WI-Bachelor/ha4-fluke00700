package htw.berlin.service;

import htw.berlin.domain.Burger;
import htw.berlin.domain.BurgerImpl;
import htw.berlin.domain.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilderImpl implements BurgerBuilder {

  private final List<Ingredient> ingredients;

  public BurgerBuilderImpl() {
    this.ingredients = new ArrayList<>();
  }

  @Override
  public boolean addIngredientsById(List<Integer> ids) {
    // TODO (1): Fuer alle Artikel IDs aus `ids` mit Hilfe der Informationen aus `ArticleInfos` eine konkrete Ingredient-Instanz erzeugen und in der Liste `ingredients` ablegen
    return true;
  }

  @Override
  public Burger build() {
    return new BurgerImpl(ingredients);
  }
}
