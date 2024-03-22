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
public class ex5 {public static void main(String[] args) {
        int n = 5; 
        int factorielWhile = 1;
        int i = 1;
        while (i <= n) {
            factorielWhile *= i;
            i++;
        }
        
       
        System.out.println("Factoriel de " + n + " avec while : " + factorielWhile);
        
       
        int factorielFor = 1;
        for (int j = 1; j <= n; j++) {
            factorielFor *= j;
        }
        
        System.out.println("Factoriel de " + n + " avec for : " + factorielFor);
    }
}
    

