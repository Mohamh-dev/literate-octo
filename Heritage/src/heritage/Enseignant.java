package heritage;

public class Enseignant extends Personnel{
	private String matiereEnseignant;
	
	public Enseignant() {
		super();
		this.matiereEnseignant="Developement";
		}
	
	public Enseignant(String nom,byte age,String adress,float salaire,String matiereEnseignant) {
		super(nom,age,adress,salaire);
		this.matiereEnseignant=matiereEnseignant;
	}
	public Enseignant(Enseignant E) {
		super(E.nom,E.age,E.adress,E.salaire);
		this.matiereEnseignant=E.matiereEnseignant;
	}
	public void setEnseignant(String nom, byte age, String adress, float salaire, String matiereEnseignant ) {
		setPersonnel(nom,age,adress,salaire);
		this.matiereEnseignant=matiereEnseignant;
	}
	public String getMatièreEnseignant() {
		return "Matière Enseignant"+this.matiereEnseignant;
	}
	public String toString() {
		return super.toString() + "Matière Enseignant :"+this.matiereEnseignant; 
	} 
	
}
