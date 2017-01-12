package pizza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pizza {

	private String[][] pizza;
	private final int NB_JAMBON_MIN = 3;
	private final int TAILLE_MAX_PART = 12;
	
	
	public Pizza(String input){
		try{
			this.pizza = this.getPizza(input);
		} catch(Exception e) {
			System.out.println("Erreur dans le fichier");
		}
	}
	
	public String[][] getPizza(String input) throws IOException{
		String[][] pizza = new String[180][60];
		
		BufferedReader donnee = new BufferedReader (new FileReader(input));
		donnee.readLine();

		for(int i = 0; i < 180; i++){
			String line =  donnee.readLine();
			for(int j = 0; j < 60; j++){
				pizza[i][j] = line.substring(j,j+1);
			}
		}
		
		donnee.close();
		
		return pizza;
	}
	
	public String[][] getPizzaRepresentation(){
		return this.pizza;
	}

	public int getMinJambon(){
		return this.NB_JAMBON_MIN;
	}
	
	public int getTailleMaxPart(){
		return this.TAILLE_MAX_PART;
	}
	
	public void affichePizza(){
		for(String[] line : this.pizza){
			StringBuilder ligne = new StringBuilder("");
			for(String lettre : line){
				ligne.append(lettre);
			}
			System.out.println(ligne.toString());
		}
	}

}
