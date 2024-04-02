package creational.builder;

import creational.builder.meal.before.FastFoodMeal;

public class Client {

    /*
     * Problemas:
     * 
     * - Criação de objetos complexos: O Builder é útil quando você precisa criar
     * objetos que requerem muitos parâmetros ou quando deseja que o processo de
     * criação de objetos seja mais flexível12.
     * 
     * - Evitar a passagem de parâmetros desnecessários: Para evitar a passagem de
     * vários parâmetros que não serão usados, o padrão Builder sugere que você
     * extraia o código de construção do objeto para fora de sua própria classe e
     * mova ele para objetos separados chamados builders3.
     * 
     * - Reutilização, flexibilidade e fácil manutenção: O Builder é focado em criar
     * objetos complexos de maneira reutilizável, flexível e de fácil manutenção
     */
    public static void main(String[] args) {

	FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
	System.out.println(burguerCombo);

	FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
	System.out.println(justFries);

	FastFoodMeal heartAtackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake",
		"2 Kilograms");
	System.out.println(heartAtackCombo);

    }
}
