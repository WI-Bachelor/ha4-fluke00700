package htw.berlin.domain;

import java.math.BigDecimal;

public class Salad extends AbstractIngredient{
      String name;
      BigDecimal price;
      double calories;
      public Salad(int id){
        if(id==500)
          setPriceAndCalories("Eisbergsalat", new BigDecimal("0.40"),20);
        if(id==600)
          setPriceAndCalories("Rucolasalat", new BigDecimal("0.60"),25);

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
        return  this.name + " als Salatbeilage";
    }
    }

