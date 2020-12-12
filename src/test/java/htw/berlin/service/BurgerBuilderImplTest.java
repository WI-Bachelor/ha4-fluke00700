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
    List<Integer> ids = List.of(123,300,700,900,610);
    burgerBuilder.addIngredientsById(ids);
    Burger burger = burgerBuilder.build();
    BurgerImpl burgerImpl = new BurgerImpl(burger.getIngredients());



    assertEquals("7.45",burgerImpl.calculatePrice().toString() );

  }



  }



