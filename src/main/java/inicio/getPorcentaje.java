/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author mcavero
 */
public class getPorcentaje {
    

public static void main(String[] args) {
        //Mensaje al usuario
        System.out.println("Escribe un texto y termina con un punto '.'");
        //recupera lo que introduce el usuario por teclado. Lo almacena en cadena
    	Scanner scanner = new Scanner(System.in);
        String cadena = scanner.next();
    	//declara variable texto para concatenar y fin para saber si ha acabado
        String texto = "";
    	String fin = ".";
        //mientras cadena no termine en punto sigue pidiendola
    	while (!cadena.endsWith(fin)) {
            System.out.println("Tu cadena no termina con un punto '.'"); 
            System.out.println("Intentalo de nuevo");
            cadena = scanner.next();
    	}
        //asigna a texto cadena sin el punto
    	texto += cadena.substring(0, cadena.length()-1);
        
        
    	HashMap<Character, Integer> percentage = new HashMap();
    	Integer total = 0;
    	for (Character c : texto.toCharArray()) {
            if (percentage.containsKey(c)) {
            	int i = percentage.get(c) + 1;
                //System.out.println("en el if --> i: " + i + " c: " + c);
            	percentage.replace(c, i);
            } else {
            	percentage.put(c, 1);
            }
            total++;
            //System.out.println(percentage);
    	}

    	for (HashMap.Entry<Character, Integer> entry : percentage.entrySet()) {
        System.out.println("El caracter " + entry.getKey() + " aparece un " + entry.getValue()*100.0/total + "% de las veces");
    	}

    }
}
