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
public class ex2 {  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();

    
        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();

        
        minutes++;
        if (minutes == 60) {
            heure++;
            minutes = 0;
        }
        if (heure == 24) {
            heure = 0;
        }

        // Afficher l'heure suivante
        System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

        
      
    }
}