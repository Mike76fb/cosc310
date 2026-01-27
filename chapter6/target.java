package chapter6;

import java.util.ArrayList;

abstract public class target {
    public static final int TRIALS = 5;

    protected int arr[];
    protected ArrayList<Integer> list;
    private String name; // must be in this format: array, randomw_access
    private int results[] = new int[TRIALS];

    public target(int arr[], ArrayList<Integer> list, String name) {
        this.name = name;
        this.arr = arr;
        this.list = list;
    }

    // method under tes
    // indicesOrnums is being used for two different tests
    abstract public int method(int[] indicesornums);

    // calls the method under test TRIALS number of 
    public double runTests(int indicesOrnums[]) {
       long total = 0;
        for (int i = 0; i < TRIALS; i++) {
            long start = System.nanoTime();
            int result = method(indicesOrnums);
            long finish = System.nanoTime();
            long elapsed = finish - start;
            results[i] = (int) elapsed;
            total += elapsed;
        }
        double avg = total / (double) TRIALS;
        return avg;
    }

    // calculates the average time across all results
    // as well as outputs the individual results to the output stream
    public double writeResults(PrintWriter out) {
        long total = 0;
        for (int i = 0; i < TRIALS; i++) {
            out.printf("%s, %d, %.2f,%d\n", i, results[i] / 1_000.0, results[i]);
        }
    }
}
