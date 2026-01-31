package chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class ArrayVsArrayListLab {

    

    protected static int listRandomAccess(int indices[], ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < indices.length; i++) {
            result += list.get(indices[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try {
            int arr[] = DataLoader.loadArray("numbers.txt");
            ArrayList<Integer> list = DataLoader.loadArrayList("numbers.txt");
            Random r = new Random();
            int indices[] = new int[100_000];
            for (int i = 0; i < indices.length; i++) {
                indices[i] = r.nextInt(arr.length);
            }

        PrintWriter fileOut = new PrintWriter(new File("results.csv"));
        Target tests[] = new Target[8];
        double testAverages[] = new double[8];

        // need to compare the results of the array version of a test
        // with the arrayList version of the test, so you
        tests[0] = new ArrayRandom(arr, list, "array,random_access");
        tests[1] = new ListRandom(arr, list, "arraylist, random_access");
        tests[2] = new ArrayAppend(arr, list, "array,append");
        tests[3] = new ListAppend(arr, list, "list,append");
        tests[4] = new ArrayInsert(arr, list, "array,insert");
        tests[5] = new ListInsert(arr, list, "list,insert");
        tests[6] = new ArrayRemove(arr,list ,"array,remove");
        tests[7] = new ListRemove(arr, list, "list,remove");

        for (int i=0; i<tests.length; i++) {
            Target target = tests[i];
            if (target != null) {
                testAverages[i] = target.runTests(indices);
                target.writeResults(fileOut);
            }
        }

        if (testAverages[1] < testAverages[0]) {
            System.out.println("array wins!");
            
        }
        

        fileOut.close();
        System.out.println("Results written to results.csv. Press Enter to exit...");
        System.in.read();
    } catch (IOException e) {
        System.out.println("Problem loading data files");
        
    }
}
}
