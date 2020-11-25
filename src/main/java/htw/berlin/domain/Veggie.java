package htw.berlin.domain;

import java.math.BigDecimal;

public class Veggie extends AbstractIngredient{
      String name;
      BigDecimal price;
      double calories;
      public Veggie(int id){
        if(id==700)
          setPriceAndCalories("Tomate", new BigDecimal("0.70"), 15);
        if(id==800)
          setPriceAndCalories("Gurke", new BigDecimal("0.65"), 12);

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
        return this.name +" als Gemuesebeilage";}
}

