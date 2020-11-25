package htw.berlin.service;

import htw.berlin.domain.*;

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
    for(int i=0;i<ids.size();i++) {
      switch (ids.get(i)){
      case (100):
        ingredients.add((Ingredient) new Bun(100) {
        });
        break;
      case (200):
        ingredients.add((Ingredient) new Bun(200));
        break;
      case (300):
        ingredients.add((Ingredient) new Patty(300));
        break;
      case (400):
        ingredients.add((Ingredient) new Patty(400));
        break;
      case (500):
        ingredients.add((Ingredient) new Salad(500));
        break;
      case (600):
        ingredients.add((Ingredient) new Salad(600));
        break;
      case (700):
        ingredients.add((Ingredient) new Veggie(700));
        break;
      case (800):
        ingredients.add((Ingredient) new Veggie(800));
        break;
      case (900):
        ingredients.add((Ingredient) new Sauce(900));
        break;
      case (1000):
        ingredients.add((Ingredient) new Sauce(1000));
        break;
        default:break;
      }
    }



    return true;
  }



  @Override
  public Burger build() {
    return new BurgerImpl(ingredients);
  }
}
