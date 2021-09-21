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
 * @author Michelle
 */
public class MainSucesion {

    static Logger log = Logger.getLogger(MainSucesion.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        log.info("Ingrese el numero :");
        n = leer.nextInt();
        log.info(Sucesion.sucesion(n));
        Sucesion.mostrarContador();
    }
}
