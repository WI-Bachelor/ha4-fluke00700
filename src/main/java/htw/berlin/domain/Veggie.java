package htw.berlin.domain;

import java.math.BigDecimal;

public class Veggie extends AbstractIngredient{
      String name;
    public Veggie(int id, BigDecimal bigDecimal, double cal, String name)
    {
        super(id,bigDecimal,cal,name+" als Gemuesebeilage");

    }
}

