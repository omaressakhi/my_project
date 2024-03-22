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
public class ex3 {  public static void main(String[] args) {
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

        System.out.println("Le tableau que vous avez entré est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}