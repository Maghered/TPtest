
public class Ville {
	private String nomV;
	private int nbHabitants;
	private int superficie;
	private Pays sonPays;
	
	public Ville(){
		
	}
	
	public Ville(String nomV, int nbHabitants, int superficie, Pays sonPays){
		this.nomV = nomV;
		this.nbHabitants = nbHabitants;
		this.superficie = superficie;
		this.sonPays = sonPays;
		this.sonPays.ajoutVille(this);
	}
	
	public Ville(String nomV, int nbHabitants, int superficie){
		this.nomV = nomV;
		this.nbHabitants = nbHabitants;
		this.superficie = superficie;
	}
	
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public String getNomV() {
		return nomV;
	}
	public void setNom(String nomV) {
		this.nomV = nomV;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public Pays getSonPays() {
		return sonPays;
	}
	public void setSonPays(Pays sonPays) {
		this.sonPays = sonPays;
	}
	
	public String toStringV(){
		String chaine;
		chaine =  "----- LES VILLES -----\n" + nomV +" "+ nbHabitants +" "+ superficie + "\n";
		return chaine;
	}	
}
