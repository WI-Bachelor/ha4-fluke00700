package htw.berlin.domain;

import java.math.BigDecimal;

public class Bun extends AbstractIngredient{
     String name;
     BigDecimal price;
     double calories;

      public Bun(int id){
        if(id==100)
          setPriceAndCalories("normalem Burgerbrot", new BigDecimal("1.50"), 300);
        if(id==200)
          setPriceAndCalories("Ciabatta", new BigDecimal("1.90"), 250);

      }
      public boolean setPriceAndCalories(String name, BigDecimal price, double calories)
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
        return  this.name;
    }
}
