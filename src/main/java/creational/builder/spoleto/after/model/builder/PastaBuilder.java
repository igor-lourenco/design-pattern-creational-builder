package creational.builder.spoleto.after.model.builder;

import creational.builder.spoleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

    public Pasta getResult() {
	return new Pasta(toppings, sauces, size, cheese, pepper);
    }
}
