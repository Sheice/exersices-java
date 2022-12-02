package exersice9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        // exercise 8

        returnFile("./src", "./desktop");


    }


    //exersice file

    public static void returnFile (String fileIn,String fileOut){
        try{
            InputStream ficherfileIn = new FileInputStream(fileIn);

            byte[] datos = ficherfileIn.readAllBytes();

            PrintStream ficherFileOut = new PrintStream(fileOut);

            ficherFileOut.write(datos);


        }catch (FileNotFoundException e){
            System.out.println("Hubo un error");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}



