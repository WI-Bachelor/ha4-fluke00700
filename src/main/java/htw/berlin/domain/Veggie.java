package htw.berlin.domain;

import java.math.BigDecimal;

public class Veggie extends AbstractIngredient{
      String name;
    public Veggie(int id, BigDecimal bigDecimal,String name)
    {
        super(id,bigDecimal,name+" als Gemuesebeilage");

    }
}

