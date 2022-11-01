/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea un programa que pida al usuario el nombre de un fichero de texto, guarde
 * todas sus líneas en un array y las vuelque a un nuevo fichero llamado
 * "salida.txt", en orden contrario (de la última a la primera).
 *
 * @author Morad
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        FileReader fr = null;
        File f;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaLineas = null;
        System.out.println("Introduce el nombre del fichero, por ejemplo txtprueba2.txt");
        String fichero = sc.next();

        try {

            f = new File(fichero);
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String cadena = br.readLine();
            int lineas = 0;

            listaLineas = new ArrayList();

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

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {

            f = new File("salida.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = listaLineas.size() - 1; i >= 0; i--) {

                bw.write(listaLineas.get(i));
                // System.out.println(listaLineas.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {

        }

    }
}
