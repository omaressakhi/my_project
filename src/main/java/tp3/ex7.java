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
public class ex7 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taille;
        System.out.print("Entrez la taille du tableau : ");
        taille = scanner.nextInt();

        int[] tableau = new int[taille];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }

        int moyenne = somme / taille;

        System.out.println("La somme des éléments est : " + somme);
        System.out.println("La moyenne des éléments est : " + moyenne);

        int[] tableau2 = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableau2[i] = tableau[i];
        }

        System.out.println("Le deuxième tableau (T2) est :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau2[i] + " ");
        }
    }
}