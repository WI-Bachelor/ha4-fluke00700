package htw.berlin.domain;

import java.math.BigDecimal;

public class Sauce extends AbstractIngredient{
      String name;
      public Sauce(int id, BigDecimal bigDecimal, double cal, String name)
      {

            super(id,bigDecimal,cal,name+" als Sauce");

      }


}

