/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Michelle
 */
public class MainPruebaFunciones {

    
    public static void main(String[] args) {
        Funciones obj = new Funciones();
        Scanner text = new Scanner(System.in);
        boolean salir = false;
        int opcion; 

        
        while (!salir) {
            System.out.println("  MENU   ");
            System.out.println("1. Factorial");
            System.out.println("2. Exponencial");

            try 
           {

               
                System.out.println("Escribe una de las opciones");
                opcion = text.nextInt();

                switch (opcion) {
                    case 1:

                        
                        System.out.println("Factorial ");
                        
                        System.out.println("Ingrese el numero: ");
                        double numero = text.nextDouble();
                        System.out.println("El valor es: " + obj.factorial(obj.Ingresar_numero(numero)));
                        break;
                        
                        
                    case 2:
                        System.out.println("  POTENCIA  ");
                        System.out.println("Ingrese la base: ");
                        int base = text.nextInt();
                        System.out.println("Ingrese el exponente: ");
                        int exponente = text.nextInt();
                        System.out.println("El valor es: " + obj.Potencia(base, exponente));
                        break;
                        
                        
                    default:
                        System.out.println("Números entre 1 y 2");
                        
                        
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número");
                text.next();
            }
        }
    }
}
