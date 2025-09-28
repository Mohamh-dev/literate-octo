package heritage;


public class Personne {
	protected String nom;
	protected byte age;
	public Personne(){
		this.nom="#####";
		this.age=0;
	}
	public Personne(String nom,byte age){
		this.nom=nom;
		if(age<=0) {
			System.out.println("l'age doit etre posetif ");
		}
		else {
			this.age=age;
		}
	}
	public Personne(Personne p) {
		this.nom=p.nom;
		this.age=p.age;
	}
	public void setPersonne(String nom,byte age) {
		this.nom=nom;
		this.age=age;
	}
	public String getnom() {
		return nom;
	}
	public void getage() {
		System.out.println("age ="+age);
	}
	public String toString() {
	    return "Nom: " + this.nom + ", age: " + this.age;
	}
	
	
	
}
