package exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // exercise return reverse string
        System.out.println(reverse("Hola mundo"));
        System.out.println("\n----------------------------------------");

    }

    // return reverse string
    public static String reverse(String texto) {
        StringBuilder reverse = new StringBuilder();

        for(int i = texto.length() - 1; i >= 0; i-- ){
            reverse.append(texto.charAt(i));
        }

        return reverse.toString();
    }


}



