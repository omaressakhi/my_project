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
public class ex6 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre poids en kg : ");
        double poids = scanner.nextDouble();

        System.out.print("Entrez votre taille en m : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrez votre sexe (F pour femme, M pour homme) : ");
        char sexe = scanner.next().charAt(0);

        double imc = poids / (taille * taille);

        String[] categoriesFemme = {"Maigreur", "Poids normal", "Surcharge pondérale", "Adiposité", "Obésité"};
        String[] categoriesHomme = {"Maigreur", "Poids normal", "Surcharge pondérale", "Adiposité", "Obésité"};

        int indiceCategorie;

        if (sexe == 'F') {
            if (imc < 19) {
                indiceCategorie = 0;
            } else if (imc >= 19 && imc <= 24) {
                indiceCategorie = 1;
            } else if (imc >= 24 && imc <= 30) {
                indiceCategorie = 2;
            } else if (imc >= 30 && imc <= 40) {
                indiceCategorie = 3;
            } else {
                indiceCategorie = 4;
            }
            System.out.println("Votre IMC est de : " + imc);
            System.out.println("Votre état de poids est : " + categoriesFemme[indiceCategorie]);
        } else if (sexe == 'M') {
            if (imc < 20) {
                indiceCategorie = 0;
            } else if (imc >= 20 && imc <= 25) {
                indiceCategorie = 1;
            } else if (imc >= 25 && imc <= 30) {
                indiceCategorie = 2;
            } else if (imc >= 30 && imc <= 40) {
                indiceCategorie = 3;
            } else {
                indiceCategorie = 4;
            }
            System.out.println("Votre IMC est de : " + imc);
            System.out.println("Votre état de poids est : " + categoriesHomme[indiceCategorie]);
        } else {
            System.out.println("Sexe non reconnu");
        }

      
    }

    
}
