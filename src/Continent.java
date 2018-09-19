import java.util.ArrayList;


public class Continent {
	private String NomC;
	private ArrayList<Pays> mesPays;
	
	public Continent(){
		this.mesPays = new ArrayList<Pays>();
	}
	
	public Continent(String NomC){
		this.NomC = NomC;
		this.mesPays = new ArrayList<Pays>();
	}
	
	public void ajoutPays(Pays unPays){
		mesPays.add(unPays);
	}
	
	public String toStringC(){
		int i;
		String chaine = "----- LE CONTINENT -----\n"+ NomC;
		if (this.mesPays.size() == 0){
			chaine += "\n Pas de Pays.";
		}
		else{
			for (i=0; i<this.mesPays.size(); i++){
				chaine += "\n"+this.mesPays.get(i).toStringP();
			}
		}
		return chaine;
	}

}
