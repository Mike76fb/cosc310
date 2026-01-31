package chapter6;

import java.util.ArrayList;

public class ListAppend extends Target {

    public ListAppend(int[] arr, ArrayList<Integer> list, String label) {
        super(arr, list, label);
    }

   @Override
    public int method(int[] indicesOrnums) {
        for (int i = 0; i < indicesOrnums.length; i++) {
            list.add(indicesOrnums[i]);
        }
        return list.size();
    }
}