package app;

import java.util.List;

import part.Part;
import pizza.Pizza;
import probleme.Probleme;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new Pizza(args[0]);
		pizza.affichePizza();
		
		Probleme pb = new Probleme(pizza.getPizzaRepresentation());
		pb.getAllPart();
		List<Part> liste = pb.getListePart();
		
		System.out.println(liste.size());

	}

}
