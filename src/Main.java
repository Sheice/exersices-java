import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // exercise return reverse string
        System.out.println(reverse("Hola mundo"));
        System.out.println("\n----------------------------------------");
        // exercise 1
        String[] data = {"Hola", "Chicos", "Como", "Andan"};

        for (String datum : data) {
            System.out.println(datum);
        }
        System.out.println("\n----------------------------------------");
        //exercise 2
        int[][] numbers = {{1,2,4,5},{6,7, 8, 9}};

        for (int x=0; x < numbers.length; x++){
            for (int y=0; y < numbers[x].length; y++)
                System.out.print(" valur en la vuelta i: " + x + " y j: " + y + " es: " + numbers[x][y]);


        }
        System.out.println("\n----------------------------------------");

        //exercise 3
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(1);

        System.out.println("Datos del vector: " + vector );
        System.out.println("\n----------------------------------------");


        //exercise 4
        // el problema de un vector es que si llenas la capacidad, el vector hace una copia,
        // copia todos los valores del vector que tienes y crear mas espacio para nuevos elementos
        // y esto es muy costoso a nivel rendimiento/memoria

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


        //exercise 6
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            integerArrayList.add(i);
            System.out.println(integerArrayList.get(i - 1));
        }
        System.out.println("\n----------------------------------------");

        // exercise 7
        dividePorCero(2, 2);

        System.out.println("\n----------------------------------------");

        // exercise 8




    }

    // return reverse string
    public static String reverse(String texto) {
        StringBuilder reverse = new StringBuilder();

        for(int i = texto.length() - 1; i >= 0; i-- ){
            reverse.append(texto.charAt(i));
        }

        return reverse.toString();
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



