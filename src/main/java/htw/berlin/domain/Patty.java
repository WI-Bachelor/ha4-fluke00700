package htw.berlin.domain;

import java.math.BigDecimal;


   public class Patty extends AbstractIngredient {
      String name;
      BigDecimal price;
      double calories;
      public Patty(int id){
        if(id==300)
          setPriceAndCalories("Rindfleisch", new BigDecimal("4.50"), 200);
        if(id==400)
          setPriceAndCalories("Falafel", new BigDecimal("3.50"), 150);

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
           return  this.name;
       }
    }

