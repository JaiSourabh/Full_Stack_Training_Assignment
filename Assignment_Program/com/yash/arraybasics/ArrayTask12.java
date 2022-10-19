package com.yash.arraybasics;
// WAP to sort array on the basis of unit place.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayTask12 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(404);
        values.add(908);
        values.add(142);
        values.add(156);
        values.add(639);
        values.add(265);
        values.add(414);
        Comparator<Integer> c = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else if (i % 10 < j % 10)
                    return -1;
                else return 0;
            }
        };
        values.sort(c);
        for (Integer o : values) {
            System.out.println(o);
        }
    }
}
