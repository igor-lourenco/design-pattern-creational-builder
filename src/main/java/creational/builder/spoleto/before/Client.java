package creational.builder.spoleto.before;

import java.util.Arrays;

import creational.builder.spoleto.before.model.Pasta;
import creational.builder.spoleto.before.model.Size;

public class Client {

    public static void main(String[] args) {
	Pasta p1 = new Pasta(Size.LARGE);
	System.out.println(p1);

	//cria varios construtores de Pasta
	
	Pasta p2 = new Pasta(Arrays.asList("Bacon", "Broccoli"), Arrays.asList("Tomato"), Size.SMALL, true);
	System.out.println(p2);

	Pasta p3 = new Pasta(Arrays.asList("Garlic"), Arrays.asList("Funghi", "Cheese"), Size.STANDARD, false, true);
	System.out.println(p3);

    }
}
