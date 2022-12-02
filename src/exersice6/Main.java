package exersice6;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //exercise 5
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        LinkedList<String> linkedList = new LinkedList<>();


        for (int i = 0; i < arrayList.size(); i++){
            linkedList.add(arrayList.get(i));
            System.out.println("ArrayList: " + arrayList.get(i));
            System.out.println("LinkeList: " + linkedList.get(i));
        }

        System.out.println("\n----------------------------------------");

    }



}



