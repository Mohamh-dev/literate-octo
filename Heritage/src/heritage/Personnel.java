package heritage;

public class Personnel extends Personne {
	protected String adress;
	protected float salaire;
	
	public Personnel(){
	super();
	this.adress="@";
	this.salaire=0;
	}
	public Personnel(String nom , byte age,String adress, float salaire){
	super(nom,age);
	this.adress=adress;
	this.salaire=salaire;
	
	}
	public Personnel(Personnel p){
		super(p.nom,p.age);
		this.adress=p.adress;
		this.salaire=p.salaire;
	}
	public void setPersonnel(String nom, byte age, String adress, float salaire) {
	    this.setPersonne(nom,age); 
	    this.adress = adress;
	    this.salaire = salaire;
	}
	public String getAdress() {
		return this.adress;
	}
	public float getSalaire() {
		return this.salaire;
	}
	public String toString() {
	    return super.toString() +", Adresse: " + this.adress + ", Salaire: " + this.salaire;
	}
	
	
	
	
	
	
}
