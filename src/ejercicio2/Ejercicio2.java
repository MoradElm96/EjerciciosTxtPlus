/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio propuesto 1.2: Crea un programa que pida al usuario el nombre de un
 * fichero de texto, cuente cuántas líneas contiene, cree un array y guarde
 * todas ellas, para luego mostrarlas en pantalla en orden contrario (de la
 * última a la primera).
 *
 *
 * @author Morad
 */
public class Ejercicio2 {

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

            //String[] arrayLineas = null; 
            ArrayList<String> listaLineas = new ArrayList();

            while (cadena != null) {

                listaLineas.add(cadena);
                cadena = br.readLine();

                lineas++;

            }

            System.out.println("Lineas totales = " + lineas);

            //recorremos el arrayList y mostramos por pantalla
            for (String listaLinea : listaLineas) {
                System.out.println(listaLinea.toString());
            }

            br.close();
            fr.close();
            /* 
            for (int i = 0; i <= listaLineas.size(); i++) {
                System.out.println("\n"+listaLineas.get(i).toString());      
            }
             */

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
