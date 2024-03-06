import java.util.List;

public class Etudiant {
	int cne;
	 String nom;
	 String prenom;
	 float note;
	 public List<Filiere> Filiere;
	public Etudiant(int cne, String nom, String prenom, float note, List<Filiere> filiere) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
		Filiere = filiere;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}