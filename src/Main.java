import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		Ville uneVille = new Ville("Paris", 0, 0);
		
		Pays unPays = new Pays("france", "francais", "euro", "Paris");
		
		Capitale uneCapitale = new Capitale("Paris", 0, 0);//pacman
		
		Continent unContinent = new Continent();
		
		unPays.ajoutVille(uneVille);
		
		unPays.ajoutVille(uneCapitale);
		
		unContinent.ajoutPays(unPays);
		
		System.out.println(unContinent.toStringC());
		
	}

}
