package htw.berlin.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ArticleInfos {



  private ArticleInfos() {}

  public static Map<Integer, ArticleData> buns = Map.of(
      100, new ArticleData("Burger", new BigDecimal("1.50"), 300),
      200, new ArticleData("Ciabatta", new BigDecimal("1.90"), 250));
  public static Map<Integer, ArticleData> patties  = Map.of(
      300, new ArticleData("Rindfleisch", new BigDecimal("4.50"), 200),
      400, new ArticleData("Falafel", new BigDecimal("3.50"), 150));
  public static Map<Integer, ArticleData> salads = Map.of(
      500, new ArticleData("Eisbergsalat", new BigDecimal("0.40"), 20),
      600, new ArticleData("Rucolasalat", new BigDecimal("0.60"), 25));
  public static Map<Integer, ArticleData> veggies = Map.of(
      700, new ArticleData("Tomate", new BigDecimal("0.70"), 15),
      800, new ArticleData("Gurke", new BigDecimal("0.65"), 12));
  public static Map<Integer, ArticleData> sauces = Map.of(
      900, new ArticleData("Ketchup", new BigDecimal("0.25"), 30),
      1000, new ArticleData("Mayo", new BigDecimal("0.30"), 40));

  public static Map<Integer, ArticleData> getAllArticles() {
    Map<Integer, ArticleData> articles = new HashMap<>();
    articles.putAll(buns);
    articles.putAll(patties);
    articles.putAll(salads);
    articles.putAll(veggies);
    articles.putAll(sauces);
    return articles;
  }
}

class ArticleData {

  private final String name;
  private final BigDecimal price;
  private final double calories;

  ArticleData(String name, BigDecimal price, double calories) {
    this.name = name;
    this.price = price;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public double getCalories() {
    return calories;
  }
}
