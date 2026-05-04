package chapter6;

import java.util.ArrayList;

public class ListInsert extends Target {

    public ListInsert(int[] arr, ArrayList<Integer> list, String label) {
        super(arr, list, label);
    }

   @Override
    public int method(int[] indicesOrnums) {
        for (int i = 0; i < indicesOrnums.length; i++) {
            list.add(0, indicesOrnums[i]);
        }
        return list.size();
    }
}