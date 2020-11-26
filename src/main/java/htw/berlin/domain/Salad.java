package htw.berlin.domain;

import java.math.BigDecimal;

public class Salad extends AbstractIngredient{
      String name;
    public Salad(int id, BigDecimal bigDecimal, double cal, String name)
    {

        super(id,bigDecimal,cal,name+" als Salatbeilage");

    }
    }

