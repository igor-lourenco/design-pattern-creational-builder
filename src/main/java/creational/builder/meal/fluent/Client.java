package creational.builder.meal.fluent;

import creational.builder.meal.fluent.model.FastFoodMeal;
import creational.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {

    public static void main(String[] args) {
	FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries") // combo simples
		.andMain("CheeseBurger")
		.forDrink("Code")
		.thatsAll();
	
	System.out.println(burguerCombo);

	FastFoodMeal justFries = new FastFoodMealBuilder("Fries") // apenas acompanhamento
		.thatsAll();
	
	System.out.println(justFries);

	FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries") // combo completo
		.andMain("Monster Burguer")
		.forDrink("Milk Shake")
		.andDessert("Fudge Cake")
		.andGift("2 Kilograms")
		.thatsAll();
	
	System.out.println(heartAtackCombo);
    }
}
