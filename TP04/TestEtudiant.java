
/**
 * Write a description of class TestEtudiant here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 6 mars 2018
 */


import java.util.Scanner;


public class TestEtudiant
{
    public static void main(String[] args){
        String nomEtu;
        String prenomEtu;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir le nom de l'étudiant :");
        nomEtu = sc.nextLine();
        
        System.out.println("Veuillez saisir le prénom de l'étudiant :");
        prenomEtu = sc.nextLine();

        
        Etudiant x = new Etudiant (prenomEtu, nomEtu);      
        
        System.out.println("Le nom de l'étudiant est : " + x.getPrenom() + " " + x.getNom() + ". Son numéro d'étudiant est " + x.getNumEtudiant() + ".");
        
    }
   
}
