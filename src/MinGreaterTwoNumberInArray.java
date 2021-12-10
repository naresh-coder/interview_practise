package com.startup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinGreaterTwoNumberInArray {

    public static void main(String[] args) {

        int[] r = solve(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(r));

    }

    public static int[] solve(int[] A) {

        int[] d = new int[A.length];

        int i = 0;
        for (int a : A) {
            d[i] = a;
            i++;
        }
        Arrays.sort(d);

        List<Integer> lit = new ArrayList<>();

        for (int a : A) {

            int index = Arrays.binarySearch(d, a);

            int count = 2;
            while (count > 0 && index < d.length) {
                index++;
                if (index < d.length && a < d[index]) {
                    count--;
                }
                if (count ==0) {
                    lit.add(a);
                    break;
                }
            }
        }

        int[] r = new int[lit.size()];

        for (int ii = 0; ii < lit.size(); ii++) {
            r[ii] = lit.get(ii);
        }

        return r;

    }


}
