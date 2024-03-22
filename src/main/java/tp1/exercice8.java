/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class exercice8 {
     public static void main(String[] args) {
        // Création du scanner
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer les deux entiers
        System.out.print("Entrez le premier entier : ");
        int entier1 = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int entier2 = scanner.nextInt();

        // Utilisation de l'algorithme d'Euclide pour calculer le PGCD
        while (entier2 != 0) {
            int temp = entier2;
            entier2 = entier1 % entier2;
            entier1 = temp;
        }

        // Affichage du résultat
        System.out.println("Le PGCD des deux entiers est : " + entier1);

        // Fermeture du scanner (pas nécessaire dans ce cas, mais possible)
        // scanner.close();
    }
}

