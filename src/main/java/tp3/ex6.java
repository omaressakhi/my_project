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
public class ex6 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taille;
        System.out.print("Entrez la taille du tableau : ");
        taille = scanner.nextInt();

        int[] tableau = new int[taille];
        int[] tableauPositif = new int[taille];
        int[] tableauNegatif = new int[taille];

        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        int indexTP = 0;
        int indexTN = 0;

        for (int i = 0; i < taille; i++) {
            if (tableau[i] > 0) {
                tableauPositif[indexTP] = tableau[i];
                indexTP++;
            } else if (tableau[i] < 0) {
                tableauNegatif[indexTN] = tableau[i];
                indexTN++;
            }
        }

        System.out.println("\nLe tableau original est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }

        System.out.println("\nLe tableau des composantes strictement positives est :");
        for (int i = 0; i < indexTP; i++) {
            System.out.print(tableauPositif[i] + " ");
        }

        System.out.println("\nLe tableau des composantes strictement négatives est :");
        for (int i = 0; i < indexTN; i++) {
            System.out.print(tableauNegatif[i] + " ");
        }
    }
}