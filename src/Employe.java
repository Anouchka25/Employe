import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Employe {
	
	private String matricule, nom, prenom; 
	String dateNaissance, dateEmbauche; // jour/mois/annee
	double salaire;
	
	public Employe(String matricule, String nom, String prenom, String dateNaissance, String dateEmbauche,
			double salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}
	
	public int age() {
	
		int age = 0;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(dateNaissance, formatter);
		
		return age;
	}
	
	public int anciente() {
		int anciente = 0;
		return anciente;
	}
	
	public void augmentationDuSalaire( ) {
		
	}
	
	public void afficherEmploye() {
		System.out.println("Matricule: " +matricule);
		System.out.println("Nom: " +nom);
		System.out.println("Prénom: " +prenom);
		System.out.println("Date de naissance: " +dateNaissance);
		System.out.println("Date d'embauche: " +dateEmbauche);
		System.out.println("Salaire: " +salaire);
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
