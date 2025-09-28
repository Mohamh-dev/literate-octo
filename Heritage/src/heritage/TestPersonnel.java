package heritage;

public class TestPersonnel  {

	public static void main(String[] args) {
		Personne[] table = new Personne[4];
		table[0]=new Personne("Mohammed",(byte)19);
		table[1]=new Personnel("Hassan",(byte)26,"Anfa",20000);
		table[2]=new Enseignant("Ahmed",(byte)43,"Oulfa",25000,"Developement Web");
		
		for (int i = 0; i < table.length; i++) {
            System.out.println("Objet " + (i + 1) + ":");
            System.out.println(table[i].toString());
	}

		
}
}
