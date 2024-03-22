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
public class ex5 {  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taille;
        do {
            System.out.print("Entrez la taille du tableau : ");
            taille = scanner.nextInt();
        } while (taille <= 0);

        int[] tableau = new int[taille];

        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Le tableau initial est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Inversion des éléments du tableau sans utiliser de tableau d'aide
        int debut = 0;
        int fin = taille - 1;

        while (debut < fin) {
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;

            debut++;
            fin--;
        }

        System.out.println("Le tableau inversé est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}