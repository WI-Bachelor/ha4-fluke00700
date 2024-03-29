package htw.berlin.domain;

import htw.berlin.service.BurgerBuilder;
import htw.berlin.service.BurgerBuilderImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BurgerImplTest {
    @Test
    @DisplayName("should build a burger from article ids")
    void testBuildBurger() {
        BurgerBuilder burgerBuilder = new BurgerBuilderImpl();
        List<Integer> ids = List.of(123,300,900);
        burgerBuilder.addIngredientsById(ids);
        Burger burger = burgerBuilder.build();

        assertEquals(3, burger.getIngredients().size());
    }


}