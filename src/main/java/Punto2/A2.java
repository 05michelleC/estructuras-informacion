package Punto2;

import java.io.*;

/**
 *
 * @author Michelle
 */
public class A2 {

    public static void main(String args[]) {

        FileReader f = null;
        BufferedReader reader = null;
        String line = null;
        A2 stack = new A2();

        if (args.length < 1) {
            System.err.println("porfavor iniciar el programa:");
            System.err.println("\tLinkedStack file");
        }

        try {
            f = new FileReader(args[0]);
            reader = new BufferedReader(f);
            while ((line = reader.readLine()) != null) {
                stack.push(line);
            }
        } catch (Exception e) {
            System.err.println("No encontrado " + args[0]);
            return;
        }

        while ((line = (String) stack.pop())!= null) {
            System.out.println(line);
        }
    }

    private void push(String line) {
       
    }
}
