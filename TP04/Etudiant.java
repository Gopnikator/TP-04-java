
/**
 * Write a description of class Etudiant here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 6 mars 2018
 */
public class Etudiant
{
    // instance variables - replace the example below with your own
    private String prenom;
    private String nom;
    private int numEtudiant;
    private static int cpt = 1;

    /**
     * Constructor for objects of class Etudiant
     */
    public Etudiant()
    {
        // initialise instance variables
        String prenom = "Rick";
        String nom = "Sanchez";
        int numEtudiant;
    }
    
    public Etudiant(String prenom, String nom)
    {
        // initialise instance variables
        numEtudiant = cpt;
        cpt++;
    }
    
    // SETTERS
    
    public void setNom (String nNom)
    {
        nom = nNom;   
    }
    
    public void setPrenom (String nPrenom)
    {
        prenom = nPrenom;      
    }
    
    // GETTERS
    
    public String getPrenom(){
        return prenom;
    }

    public String getNom(){
        return nom;
    }
    
    public int getNumEtudiant(){
        return numEtudiant;
    }
    
}   
    