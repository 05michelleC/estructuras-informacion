/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class Potencia3 {

    
    private static double potencia(int base, int exponente) {
        if (exponente == 0) {
            
            return 1;
            
        } else if (exponente < 0) {
            
            return potencia(base, exponente + 1) / base;
        
        } else {
            
            return base * potencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println(" POTENCIA ");
        System.out.println("Ingrese la base: ");
        int base = consola.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = consola.nextInt();
        System.out.println("El valor es: " + potencia(base, exponente));
    }
}
