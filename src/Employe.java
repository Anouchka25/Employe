import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Anouchka
 */
public class Employe {
    
    //Les attributs de la class
    private int Matricule;
    private String Nom;
    private String Prenom;
    private Date DateNaissance;
    private Date DateEmbauche;
    private double Salaire;
         
    
    //La m�thode qui retourne l'�ge de l'employ�
    public int Age()
    {
        Date today = new Date();
        return today.getYear() - DateNaissance.getYear();
    }
    
    //La m�thode pour retourner l'ancient� de l'employ� en nombre d'ann�es
    public int Anciente()
    {
        Date today = new Date();
        return today.getYear() - DateEmbauche.getYear();
    }
    
    //M�thode qui augmente le salaire en fonction de l'ancient�
    public void AugmentationDuSalaire()
    {
        if(Anciente() < 5)
        {
            Salaire = Salaire + (Salaire * 0.02);
        }
        else if(Anciente() > 5 && Anciente() < 10)
        {
            Salaire = Salaire + (Salaire * 0.05);
        }
        else
        {
            Salaire = Salaire + (Salaire * 0.1);
        }
    }
    
    //La m�thode qui affiche les d�tails de l'employ�
    public void AfficherEmploye()
    {
        System.out.println("Matricule : " + Matricule);
        
        //Mettre en majuscule la premi�re lettre du nom et prenom
        String output = Nom.substring(0, 1).toUpperCase() + Nom.substring(1);
        
        System.out.println("Nom complet : " + Prenom.toUpperCase() + " " + output);
        
        System.out.println("Age : " + Age());
        System.out.println("Ancient� : " + Anciente());
        System.out.println("Salaire : " + Salaire);
    }
    
    //Constructeur avec l'initialisation des param�tres
    Employe(int Matricule , String Nom , String Prenom , String DateNaissance , String DateEmbauche , double Salaire)
    {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        
        try 
        {
            this.DateNaissance = new SimpleDateFormat("dd/mm/yyyy").parse(DateNaissance);
            this.DateEmbauche = new SimpleDateFormat("dd/mm/yyyy").parse(DateEmbauche);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex.getMessage());
        }        
        this.Salaire = Salaire;
    }
 
    //SETTER METHODS FOR SETTING THE ATTRIBUTES OF THE CLASS
    public void setMatricule(int Matricule)
    {
        this.Matricule = Matricule;
    }
    public void setNom(String Nom)
    {
        this.Nom = Nom;
    }
    public void setPrenom(String Prenom)
    {
        this.Prenom = Prenom;
    }
    public void setDateNaissance(String DateNaissance)
    {
        try 
        {
            //Converti une chaine de caract�re de dd/mm/yyyy en format Date 
            this.DateNaissance = new SimpleDateFormat("dd/mm/yyyy").parse(DateNaissance);
        }
        catch (ParseException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    public void setDateEmbauche(String DateEmbauche)
    {
        try 
        {
            //Converti une chaine de caract�re de dd/mm/yyyy en format Date 
            this.DateNaissance = new SimpleDateFormat("dd/mm/yyyy").parse(DateEmbauche);
        }
        catch (ParseException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    public void setSalaire(double Salaire)
    {
        this.Salaire = Salaire;
    }
    
    //M�thodes getters pour obtenir les valeurs des attributs
    public int getMatricule()
    {
        return this.Matricule;
    }
    public String getNom()
    {
        return this.Nom;
    }
    public String getPrenom()
    {
        return this.Prenom;
    }
    public String getDateNaissance()
    {
        //Retourne une chaine de caract�re � partir d'une date
        return new SimpleDateFormat("dd/mm/yyyy").format(this.DateNaissance);
    }
    public String getDateEmbauche()
    {
        //Retourne une chaine de caract�re � partir d'une date
        return new SimpleDateFormat("dd/MM/yyyy").format(this.DateEmbauche);
    }
    public double getSalaire()
    {
        return this.Salaire;
    }
}
