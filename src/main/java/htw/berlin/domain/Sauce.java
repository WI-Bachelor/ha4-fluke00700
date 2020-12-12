package htw.berlin.domain;

import java.math.BigDecimal;

public class Sauce extends AbstractIngredient{
      String name;
      public Sauce(int id, BigDecimal bigDecimal,String name)
      {

            super(id,bigDecimal,name+" als Sauce");

      }


}

