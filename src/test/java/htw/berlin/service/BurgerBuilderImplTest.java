package htw.berlin.service;

import htw.berlin.domain.Burger;
import htw.berlin.domain.BurgerImpl;
import htw.berlin.domain.Ingredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BurgerBuilderImplTest {

  @Test
  @DisplayName("should calculate the total price of all the ingredients")
  void testBuildBurger() {
    BurgerBuilder burgerBuilder = new BurgerBuilderImpl();
    List<Integer> ids = List.of(100,300,700,900);
    burgerBuilder.addIngredientsById(ids);
    Burger burger = burgerBuilder.build();
    BurgerImpl burgerImpl = new BurgerImpl(burger.getIngredients());



    assertEquals("6.95",burgerImpl.calculatePrice().toString() );

  }

  @Test
  @DisplayName("should calculate the total amount of calories from all the ingredients")
  void testBuildBurger2() {
    BurgerBuilder burgerBuilder = new BurgerBuilderImpl();
    List<Integer> ids = List.of(100,300,700,900,1000);
    burgerBuilder.addIngredientsById(ids);
    Burger burger = burgerBuilder.build();
    BurgerImpl burgerImpl = new BurgerImpl(burger.getIngredients());



    assertEquals(585.0, burgerImpl.calculateCalories());

  }


}
