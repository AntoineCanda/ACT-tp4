package part;

public class Part {
	
	int[] coordonnee1;
	int[] coordonnee2;
	int surface;
	int nbJambon;
	
	public Part(int[] coordonnees1, int[] coordonnees2, int surface, int nbJambon){
		this.coordonnee1 = coordonnees1;
		this.coordonnee2 = coordonnees2;
		this.surface = surface;
		this.nbJambon = nbJambon;
	}
	
	public int[] getCoordonnees1(){
		return this.coordonnee1;
	}
	
	public int[] getCoordonnees2(){
		return this.coordonnee2;
	}
	
	public int getSurface(){
		return this.surface;
	}
	
	public int getNbJambon(){
		return this.nbJambon;
	}
	
	public int getLine(int[] coordonnees){
		return coordonnees[0];
	}
	
	public int getColonne(int[] coordonnees){
		return coordonnees[1];
	}
	
	public boolean estValide(){
		if(this.getSurface() > 12){
			return false;
		}
		if(this.getNbJambon() < 3){
			return false;
		}
		
		return true;
	}
	
	public boolean seChevauche(Part part1, Part part2){
		boolean res = true;
		
		
		return res;
	}
}
