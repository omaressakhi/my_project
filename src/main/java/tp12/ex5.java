/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp12;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class ex5 {  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] butsParJoueur = new int[22];

        
        
        for (int i = 0; i < butsParJoueur.length; i++) {
            System.out.print("Entrez le nombre de buts pour le joueur n° " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
        }

        
        System.out.println("Les buts ont été inscrits par les joueurs suivants :");
        for (int i = 0; i < butsParJoueur.length; i++) {
            if (butsParJoueur[i] > 0) {
                System.out.println("Joueur n° " + (i + 1) + " : " + butsParJoueur[i] + " but(s)");
            }
        }

      
        int totalButs = 0;
        for (int buts : butsParJoueur) {
            totalButs += buts;
        }
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);

  
        int joueursSansButs = 0;
        for (int buts : butsParJoueur) {
            if (buts == 0) {
                joueursSansButs++;
            }
        }
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);

     
        
        int joueur = 9 - 1; 
        int nouveauxButs = 2;
        butsParJoueur[joueur] += nouveauxButs;

      
        System.out.println("Après la mise à jour, les buts inscrits par chaque joueur sont :");
        for (int i = 0; i < butsParJoueur.length; i++) {
            System.out.println("Joueur n° " + (i + 1) + " : " + butsParJoueur[i] + " but(s)");
        }
    }
}
