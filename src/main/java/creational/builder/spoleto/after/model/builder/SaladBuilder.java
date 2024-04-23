package creational.builder.spoleto.after.model.builder;

public class SaladBuilder extends MealBuilderOpt {

    public Salad getResult() {
	return new Salad(toppings, sauces, size, cheese, pepper);
    }
}
