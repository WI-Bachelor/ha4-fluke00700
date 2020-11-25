package htw.berlin.domain;

import java.math.BigDecimal;

public class Sauce extends AbstractIngredient{
      String name;
      BigDecimal price;
      double calories;
      public Sauce (int id){
        if(id==900)
          setPriceAndCalories("Ketchup", new BigDecimal("0.25"), 30);
        if(id==1000)
          setPriceAndCalories("Mayo", new BigDecimal("0.30"), 40);

      }
      public boolean setPriceAndCalories(String name,BigDecimal price, double calories)
      {
        this.name = name;
        this.price = price;
        this.calories = calories;
        return true;
      }
    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public double getCalories() {
        return this.calories;
    }
    @Override
    public String toString() {
    return this.name +" als Sauce";}

}

