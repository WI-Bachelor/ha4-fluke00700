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
    for (int i = 0; i < ids.size(); i++) {
      switch (ids.get(i)) {
        case 100:
          ingredients.add(new Bun(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 200:
          ingredients.add(new Bun(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 300:
          ingredients.add(new Patty(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 400:
          ingredients.add(new Patty(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 500:
          ingredients.add(new Salad(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 600:
          ingredients.add(new Salad(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 700:
          ingredients.add(new Veggie(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 800:
          ingredients.add(new Veggie(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName()));
          break;
        case 900:
          ingredients.add(new Sauce(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName() ));
          break;
        case 1000:
          ingredients.add(new Sauce(ids.get(i),ArticleInfos.getAllArticles().get(ids.get(i)).getPrice(),ArticleInfos.getAllArticles().get(ids.get(i)).getCalories(),ArticleInfos.getAllArticles().get(ids.get(i)).getName() ));
          break;
        default:
          break;
      }
    }

    return true;
  }

  @Override
  public Burger build() {
    return new BurgerImpl(ingredients);


  }
}
