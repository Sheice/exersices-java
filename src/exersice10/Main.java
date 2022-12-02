package exersice10;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
    ArrayList files = new ArrayList<>();

        try {
            addFileToArray("/archivo", files);

            for (int i = 0; i < files.size(); i++){
                files.get(i);
            }
        } catch (FileNotFoundException e){
            System.out.println("Ocurrio un error: " + e.getLocalizedMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  static void addFileToArray (String fileIn,ArrayList arrayFiles) throws IOException {
        InputStream file = new FileInputStream(fileIn);

        byte[] datos = file.readAllBytes();

        PrintStream ficherFileOut = new PrintStream("/show");


        ficherFileOut.write(datos);

        arrayFiles.add(file);

        System.out.println("Se agregó el fichero");
    }
}



