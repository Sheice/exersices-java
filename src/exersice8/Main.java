package exersice8;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {



        // exercise 7
        dividePorCero(2, 2);





    }


    // exersice throws
    public static void dividePorCero (int num1, int num2) throws ArithmeticException {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }
    }
}



