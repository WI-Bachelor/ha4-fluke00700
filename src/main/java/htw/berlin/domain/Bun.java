package htw.berlin.domain;

import java.math.BigDecimal;

public class Bun extends AbstractIngredient{
     String name;

    public Bun(int id, BigDecimal bigDecimal, double cal, String name)
    {
        super(id,bigDecimal,cal,name);

    }

}
