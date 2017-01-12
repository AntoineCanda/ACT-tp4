package probleme;

import java.util.ArrayList;
import java.util.List;

import part.Part;

public class Probleme {
	
	private List<Part> listeToutePart;
	private String[][] pizza;

	public Probleme(String[][] pizza){
		this.pizza = pizza;
		this.listeToutePart = new ArrayList<Part>(106000);
	}
	
	public void getAllPart(){
		for(int i=0; i<180;i++){
			for(int j=0;j<60;j++){
				int k = 2;
				while((59-(j+k) >= 0) && (k < 12)){
					int nbJambon = 0;
					for(int l = j; l<(j+k+1); l++){
						if(this.pizza[i][l].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i;
					coordonnees2[1] = j+k;

					Part p = new Part(coordonnees1, coordonnees2, k+1, nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k++;
				}
				
				int k2 = 2;
				while((179-(i+k2) >= 0) && (k2 < 12)){
					int nbJambon = 0;
					for(int l = i; l<(i+k2+1); l++){
						if(this.pizza[l][j].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i+k2;
					coordonnees2[1] = j;

					Part p = new Part(coordonnees1, coordonnees2, k2+1, nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k2++;
				}
				
				int k3 = 1;
				while((179-(i+1) >= 0) && (59-(j+k3) >= 0) && (k3 < 6)){
					int nbJambon = 0;
					for(int l = j; l<(j+k3+1); l++){
						if(this.pizza[i][l].equals("H")){
							nbJambon++;
						}
						if(this.pizza[i+1][l].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i+1;
					coordonnees2[1] = j+k3;
					
					Part p = new Part(coordonnees1, coordonnees2, 2*(k3+1), nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k3++;
				}
				
				int k4 = 2;
				while((179-(i+ k4) >= 0) && (59-(j+1) >= 0) && (k4 < 6)){
					int nbJambon = 0;
					for(int l = i; l<(i+k4+1); l++){
						if(this.pizza[l][j].equals("H")){
							nbJambon++;
						}
						if(this.pizza[l][j+1].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i+k4;
					coordonnees2[1] = j+1;
					
					Part p = new Part(coordonnees1, coordonnees2, 2*(k4+1), nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k4++;
				}
				
				int k5 = 2;
				while((179-(i+2) >= 0) && (59-(j+k5) >= 0) && (k5 < 4)){
					int nbJambon = 0;
					for(int l = j; l<(j+k5+1); l++){
						if(this.pizza[i][l].equals("H")){
							nbJambon++;
						}
						if(this.pizza[i+1][l].equals("H")){
							nbJambon++;
						}
						if(this.pizza[i+2][l].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i+2;
					coordonnees2[1] = j+k5;
					
					Part p = new Part(coordonnees1, coordonnees2, 3*(k5+1), nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k5++;
				}
				
				int k6 = 3;
				while((179-(i+ k6) >= 0) && (59-(j+2) >= 0) && (k6 < 4)){
					int nbJambon = 0;
					for(int l = i; l<(i+k6+1); l++){
						if(this.pizza[l][j].equals("H")){
							nbJambon++;
						}
						if(this.pizza[l][j+1].equals("H")){
							nbJambon++;
						}
						if(this.pizza[l][j+2].equals("H")){
							nbJambon++;
						}
					}
					int[] coordonnees1 = new int[2];
					coordonnees1[0] = i;
					coordonnees1[1] = j;

					int[] coordonnees2 = new int[2];
					coordonnees2[0] = i+k6;
					coordonnees2[1] = j+2;
					
					Part p = new Part(coordonnees1, coordonnees2, 3*(k6+1), nbJambon);
					if(p.estValide()){
					//	System.out.println("Nb Jambon : " + nbJambon + " surface : "+ k);
						listeToutePart.add(p);
					}
					k6++;
				}
			}
		}
	}
	
	public List<Part> getListePart(){
		return this.listeToutePart;
	}
}
