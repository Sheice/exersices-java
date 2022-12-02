package exersice3;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //exercise 2
        int[][] numbers = {{1,2,4,5},{6,7, 8, 9}};

        for (int x=0; x < numbers.length; x++){
            for (int y=0; y < numbers[x].length; y++)
                System.out.print(" valur en la vuelta i: " + x + " y j: " + y + " es: " + numbers[x][y]);


        }
        System.out.println("\n----------------------------------------");


    }
}



