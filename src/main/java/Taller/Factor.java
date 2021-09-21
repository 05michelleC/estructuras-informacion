/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * 
 *
 * @author Michelle
 */
public class Factor {

    public static double Ingrese_Numero(double numero) {
        Scanner copiar = new Scanner(System.in);
        if (numero < 0) {
            do {
                System.out.println("El numero ingresado es incorrecto, ingrese uno valido");
                numero = copiar.nextDouble();
            } while (numero < 0);
            return numero;
        }
        return numero;
    }

    public static double factorial(double numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return (numero * factorial(numero - 1));
        }
    }

    static Logger log = Logger.getLogger(Factor.class.getName());

    public static void main(String[] args) {
        Scanner copiar = new Scanner(System.in);
       
       
        System.out.println("Factorial  ");
   
        System.out.println("digite el numero: ");
        double numero = copiar.nextDouble();
        System.out.println("el valor es: " + factorial(Ingrese_Numero(numero)));
    }

}
