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
public class ex6 {
    public class NombrePremier {
    public static void main(String[] args) {
        int nombre = 17; 
        boolean estPremier = true;

        if (nombre <= 1) {
            estPremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }

        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
}

public class NombresPremiers {
    public static void main(String[] args) {
        int N = 20;

        System.out.println("Nombres premiers entre 1 et " + N + ":");

        for (int nombre = 2; nombre <= N; nombre++) {
            boolean estPremier = true;

            if (nombre <= 1) {
                estPremier = false;
            } else {
                for (int i = 2; i <= Math.sqrt(nombre); i++) {
                    if (nombre % i == 0) {
                        estPremier = false;
                        break;
                    }
                }
            }

            if (estPremier) {
                System.out.println(nombre);
            }
        }
    }
}
}
