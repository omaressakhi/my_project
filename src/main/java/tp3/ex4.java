/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class ex4 {   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taille;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();
        } while (taille < 10 || taille > 50);

        int[] tableau = new int[taille];

        System.out.println("Entrez les " + taille + " valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Le tableau initial est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        int nouvelleTaille = 0;
        for (int i = 0; i < taille; i++) {
            if (tableau[i] != 5) {
                tableau[nouvelleTaille] = tableau[i];
                nouvelleTaille++;
            }
        }

        System.out.println("Le tableau résultat après effacement des occurrences de 5 est :");
        for (int i = 0; i < nouvelleTaille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}