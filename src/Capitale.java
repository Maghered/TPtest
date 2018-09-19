
public class Capitale extends Ville{
	
	
	public Capitale(){
		
	}
	
	public Capitale(String nom, int nbHabitants, int superficie, Pays sonPays){
		super(nom,nbHabitants,superficie,sonPays);
	}
	
	public Capitale(String nom, int nbHabitants, int superficie){
		super(nom,nbHabitants,superficie);
	}
	
}