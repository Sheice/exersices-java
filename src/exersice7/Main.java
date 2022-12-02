package exersice7;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        //exercise 6
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            integerArrayList.add(i);
            System.out.println(integerArrayList.get(i - 1));
        }
        System.out.println("\n----------------------------------------");

    }


}



