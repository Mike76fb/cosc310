package chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Lab1 {

    protected static int arrayRandomAccess(int indices[], int arr[]) {
        int result = 0;
        for (int i = 0; i < indices.length; i++) {
            result += arr[indices[i]];
        }
        return result;
    }

    

        
    public static void main(String[] args) throws IOException {
        /*long start = System.nanoTime();
        System.out.println("Hello, world");
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("println: " + elapsed + "ns");

        start = System.nanoTime();
        arrayTest(30_000);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("arrayTest: " + elapsed + "ns");


       //public static void main(String[] args) {
       //long start = System.nanoTime();
        //System.out.println("Hello, world");
        //long finish = System.nanoTime();
        //long elapsed = finish - start;
        //System.out.println("println: " + elapsed + "ns");
        //start = System.nanoTime();
        //arrayTest(30_000);
        //finish = System.nanoTime();
        //elapsed = finish - start;
        //System.out.println("arrayTest: " + elapsed + "ns"); */

        int arr[] = DataLoader.loadArray("numbers.txt");
        ArrayList<Integer> list = DataLoader.loadArrayList("numbers.txt");
        Random r = new Random();
        int indices[] = new int[100];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = r.nextInt(arr.length);

        }

        PrintWriter fileOut = new PrintWriter(new File("results.csv"));
        for (int i=0; i<5; i++) {
            long start = System.nanoTime();
            int result = arrayRandomAccess(indices, arr);
            long finish = System.nanoTime();
            long elapsed = finish - start;
            System.out.println("array: " + elapsed);
            fileOut.printf("array,random_access, %d, %.2f,%d\n", i, elapsed / 1_000.0, result);

         
    

            start = System.nanoTime();
            result = listRandomAccess(indices, list);
            finish = System.nanoTime();
            elapsed = finish - start;
            System.out.println("list: " + elapsed);
            fileOut.printf("arraylist,random_access, %d, %.2f,%d\n", i, elapsed / 1_000.0, result);


        }
        fileOut.close();


    }
}