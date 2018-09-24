import java.util.ArrayList;

public class Pays {
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	private static int compteurPays;
	private ArrayList<Capitale> saCapitale;
	private ArrayList<Ville> mesVilles;
	private int nbVilles;
	
	/**
	 * 
	 */
	public Pays(){
		this.saCapitale = new ArrayList<Capitale>();
		this.nbVilles = 0;
		this.mesVilles = new ArrayList<Ville>();
	}
	/**
	 * 
	 * @param nom
	 * @param langue
	 * @param monnaie
	 * @param capitale
	 */
	public Pays(String nom, String langue, String monnaie, String capitale){
		this.nom = nom;
		this.langue = langue;
		this.monnaie = monnaie;
		this.capitale = capitale;
		compteurPays = compteurPays+1;
		this.saCapitale = new ArrayList<Capitale>();
		this.nbVilles = 0;
		this.mesVilles = new ArrayList<Ville>();
	}
	/**
	 * 
	 * @return compteurPays
	 */
	public int getcompteurPays() {
		return compteurPays;
	}
	/**
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return la chaine de tout
	 */
	public String toStringP(){
		int i;
		String chaine = "------ LES PAYS ------\n"+ firstMaj() +" "+ langue +" "+ monnaie +" "+ capitale +
					"\n----- LA CAPITALE -----\n" + saCapitale;
		if (this.mesVilles.size() == 0){
			chaine += "\n Pas de Ville.";
		}
		else{
			for (i=0; i<this.mesVilles.size(); i++){
				chaine += "\n"+this.mesVilles.get(i).toStringV();
			}
		}
		return chaine;
	}
	/**
	 * 
	 * @return le nom en full maj
	 */
	public String Maj(){
		return nom.toUpperCase();
	}
	/**
	 * 
	 * @return le nom avec premier caractère en maj dans le toString
	 */
	private String firstMaj(){
		int valeur = nom.length();
		return nom.substring(0,1).toUpperCase()+nom.substring(1,valeur).toLowerCase();
	}
	
	public void ajoutVille(Ville uneVille){
		this.mesVilles.add(uneVille);
	}
	
	public boolean rechercheVille(String uneVille){
		int i = 0;
		boolean verif = true;
		while(i < mesVilles.size() && !uneVille.equals(this.mesVilles.get(i))){
			i++;
		}
		if(i == mesVilles.size()){
			verif = false;
		}
		return verif;
	}
	
	public void supprimVille(Ville uneVille){
		this.mesVilles.remove(uneVille);
	}
}