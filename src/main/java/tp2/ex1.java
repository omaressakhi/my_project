/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class ex1 {
   public class CalculNombresWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre N : ");
        int n = scanner.nextInt();
        
        int somme = 0;
        int produit = 1;
        int nombre;
        int nombreDeNombres = 0;
        
        System.out.println("Entrez " + n + " nombres :");
        while (nombreDeNombres < n) {
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            nombreDeNombres++;
        }
        
        double moyenne = (double) somme / n;
        
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);
        
        scanner.close();
    }
}


public class CalculNombresDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre N : ");
        int n = scanner.nextInt();
        
        int somme = 0;
        int produit = 1;
        int nombre;
        int nombreDeNombres = 0;
        
        System.out.println("Entrez " + n + " nombres :");
        do {
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            nombreDeNombres++;
        } while (nombreDeNombres < n);
        
        double moyenne = (double) somme / n;
        
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);
        
        scanner.close();
    }
}

public class CalculNombresFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre N : ");
        int n = scanner.nextInt();
        
        int somme = 0;
        int produit = 1;
        double moyenne;
        
        System.out.println("Entrez " + n + " nombres :");
        for (int i = 0; i < n; i++) {
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
        }
        
        moyenne = (double) somme / n;
        
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);
        
        scanner.close();
    }
}
    
}
