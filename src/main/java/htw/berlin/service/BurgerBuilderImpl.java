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
    // Redundanz reduzieren //
    for (int i = 0; i < ids.size(); i++) {


       if (ArticleInfos.buns.containsKey(ids.get(i)))
         ingredients.add(new Bun(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));

        if (ArticleInfos.patties.containsKey(ids.get(i)))
          ingredients.add(new Patty(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));

        if (ArticleInfos.salads.containsKey(ids.get(i)))
          ingredients.add(new Salad(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));

        if (ArticleInfos.veggies.containsKey(ids.get(i)))
          ingredients.add(new Veggie(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));

        if (ArticleInfos.sauces.containsKey(ids.get(i)))
          ingredients.add(new Sauce(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getName() ));


    }

    return true;
  }

  @Override
  public Burger build() {
    return new BurgerImpl(ingredients);


  }
}
