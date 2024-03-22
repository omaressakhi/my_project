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
public class ex7 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre sexe (F pour femme, M pour homme) : ");
        char sexe = scanner.next().charAt(0);

        if (sexe == 'M' && age > 20) {
            System.out.println("Vous êtes imposable.");
        } else if (sexe == 'F' && age >= 18 && age <= 35) {
            System.out.println("Vous êtes imposable.");
        } else {
            System.out.println("Vous n'êtes pas imposable.");
        }
}
    
}
