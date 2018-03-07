
/**
 * Write a description of class RepertoireEtudiants here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 6 mars 2018
 */
public class RepertoireEtudiants
{
    // instance variables - replace the example below with your own
    private int nbMax;
    private int nbE;
    private String tabEtu[];
    private int i = 0;

    /**
     * Constructor for objects of class RepertoireEtudiants
     */
    public RepertoireEtudiants()
    {
        int nbMax = 50;
        int nbE = 0;
    }
    
    public RepertoireEtudiants(int nbMaxi)//, int nbEtu)
    {
        nbMax = nbMaxi;
        //nbE = nbEtu;     
    }

    /**
    METHODS
     */
    public boolean ajouteEtudiant(Etudiant e)
    {
         if (nbE < nbMax){
             
             i++;
             nbE++;
             return true;
         } else {
             
             return false;
         }
         
    }
    
    public int getNbEtudiant()
    {
        return nbE;
    }
 
    public String getNomEtudiant(int numeroEtu)
    {
        // boucle for avec if
    }
    
    public String getPrenomtudiant(int numeroEtu)
    {
        // boucle for avec if
    }
    
    public String getNumeroEtudiant(String nomEtu)
    {
        // boucle for avec if
    }
    
    public boolean supprimeEtudiant(Etudiant e){
        // Si etudiant est dans la liste alors on le supprime, on fait baisser l'indice si necessaire et on retourne vrai sinon on retourne message erreur + faux
    }
}
