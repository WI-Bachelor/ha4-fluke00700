package htw.berlin.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;

public final class ArticleInfos {
  private static ArticleInfos articleInstance = null;
  private static ArticleInfos getarticleInstance(){
        if(articleInstance==null)
            articleInstance = new ArticleInfos();
    return articleInstance;
  }


  private ArticleInfos() {}

  public static Map<Integer, ArticleData> buns = Map.of(
      123, new ArticleData("Burger", new BigDecimal("1.50")),
      200, new ArticleData("Ciabatta", new BigDecimal("1.90")));
  public static Map<Integer, ArticleData> patties  = Map.of(
      300, new ArticleData("Rindfleisch", new BigDecimal("4.50")),
      400, new ArticleData("Falafel", new BigDecimal("3.50")));
  public static Map<Integer, ArticleData> salads = Map.of(
      500, new ArticleData("Eisbergsalat", new BigDecimal("0.40")),
      600, new ArticleData("Rucolasalat", new BigDecimal("0.60")),
      610, new ArticleData("Feldsalat", new BigDecimal("0.50")) );
  public static Map<Integer, ArticleData> veggies = Map.of(
      700, new ArticleData("Tomate", new BigDecimal("0.70")),
      800, new ArticleData("Gurke", new BigDecimal("0.65")));
  public static Map<Integer, ArticleData> sauces = Map.of(
      900, new ArticleData("Ketchup", new BigDecimal("0.25")),
      1000, new ArticleData("Mayo", new BigDecimal("0.30")));


  public static Map<Integer, ArticleData> getAllArticles() {
    Map<Integer, ArticleData> articles = new HashMap<>();
    articles.putAll(buns);
    articles.putAll(patties);
    articles.putAll(salads);
    articles.putAll(veggies);
    articles.putAll(sauces);
    return articles;
  }
  public static String printAllArticles() {
    return String.join(" ", getAllArticlesNames());
  }
    public static Map<String, Integer> getArticles() {
      NavigableMap <Integer,ArticleData> aData = (NavigableMap<Integer, ArticleData>) getAllArticles();
      Map<String, Integer> articles = new HashMap<>();

      articles.put(aData.get(aData.firstKey()).getName(),aData.firstKey());
        int i = 0;
        int previousKey = aData.firstKey();
        while(i < articles.size()-1)
        {
            articles.put(aData.get(aData.ceilingKey(previousKey)).getName(),aData.ceilingKey(previousKey));
            previousKey = aData.ceilingKey(previousKey);
            i = i + 1;
        }

      return articles;
    }
  
  
  
  public static String[] getAllArticlesNames(){
      Map<Integer, ArticleData> articles = getAllArticles();
      Integer[] articlesKeys = articles.keySet().toArray(new Integer[0]);
      String[] articlesString = new String[articles.size()];
  var i = 0;
  while(i < articles.size())
      {
          articlesString[i]= articles.get(articlesKeys[i]).getName();
          i = i + 1;
      }
   return articlesString;
  }



}

class ArticleData {

  private final String name;
  private final BigDecimal price;
  ;

  ArticleData(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

}
