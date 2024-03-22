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
public class ex1 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
    
        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Le nombre saisi n'est pas positif.");
            return;
        }
        
        System.out.println("Les diviseurs de " + n + " sont :");
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        
       
        System.out.println("\nNombre de diviseurs : " + count);
        System.out.println("Somme des diviseurs : " + sum);
        
        scanner.close();
    }
    
}
