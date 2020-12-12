package htw.berlin.domain;



import htw.berlin.service.ArticleInfos;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static htw.berlin.service.ArticleInfos.*;

public abstract class AbstractIngredient implements Ingredient
    {
        String name;
        BigDecimal price = BigDecimal.ZERO;
        double calories;
        int id;

        public AbstractIngredient(int id,BigDecimal bigDecimal,String name) {
            this.name = name;
            this.price = bigDecimal;
            this.id=id;



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
        if(veggies.containsKey(id))
            this.name=name+" als Gemuesebeilage";
        if(salads.containsKey(id))
            this.name=name+" als Salatbeilage";
        if(sauces.containsKey(id))
            this.name=name+" als Sauce";
        return this.name;
        }
    }



