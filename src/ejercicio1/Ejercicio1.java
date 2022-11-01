/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio propuesto 1.1: Crea un programa que pida al usuario el nombre de un
 * fichero de texto y muestre en pantalla la cantidad de líneas de texto que
 * contiene.
 *
 * @author Morad
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        FileReader fr = null;

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del fichero, por ejemplo txtprueba.txt");
            String fichero = sc.next();
            File f = new File(fichero);
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String cadena = br.readLine();
            int lineas = 0;
            while (cadena != null) {

                cadena = br.readLine();
                lineas++;

            }
            System.out.println("Lineas totales = " + lineas);
            br.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
