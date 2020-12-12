package htw.berlin.domain;



import htw.berlin.service.ArticleInfos;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractIngredient implements Ingredient
    {
        String name;
        BigDecimal price = BigDecimal.ZERO;
        double calories;


        public AbstractIngredient(int id,BigDecimal bigDecimal,String name) {
            this.name = name;
            this.price = bigDecimal;




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
            return this.name;
        }
    }



