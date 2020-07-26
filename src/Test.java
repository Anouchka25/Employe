import java.util.*;

/**
 *
 * @author Anouchka
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Prendre les entrées de l'utilisateur
        System.out.println("Entrez le numéro de matricule");
        int matricule = sc.nextInt();
        System.out.println("Entrez le nom");
        String nom = sc.next();
        System.out.println("Entrez le prenom");
        String prenom = sc.next();
        System.out.println("Entrez la date de naissance(dd/mm/yyyy)");
        String datenaissance = sc.next();
        System.out.println("Entrez la date d'embauche(dd/mm/yyyy)");
        String dateembauche = sc.next();
        System.out.println("Entrez le salaire");
        double salaire = sc.nextDouble();
        
        //Création d'un employé avec les détails saisaies
        Employe e = new Employe(matricule , nom , prenom , datenaissance , dateembauche , salaire);
        System.out.println("");
        
        e.AfficherEmploye();
        System.out.println("");
        
        //L'application de l'augmentation du salaire
        System.out.println("Après l'application de l'augmentation du salaire");
        e.AugmentationDuSalaire();
        
        System.out.println("");
        e.AfficherEmploye();
    }
    
}
