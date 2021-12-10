package com.startup;

import java.util.ArrayList;

public class SecondMaxNumber {
    public static void main(String[] args) {


    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A.get(i) > firstGreatest) {
                secondGreatest = firstGreatest;
                firstGreatest = A.get(i);
            } else if (A.get(i) > secondGreatest) {
                secondGreatest = A.get(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            if (A.get(i) != secondGreatest && A.get(i) != firstGreatest) {
                res.add(A.get(i));
            }
        }
        return res;
    }
}
/**
 *
 *
 *
 * import java.util.TreeSet;
 *
 * public class Solution {
 *     public int[] solve(int[] A) {
 *       int[] d = new int[A.length];
 *
 *         int i = 0;
 *         for (int a : A) {
 *             d[i] = a;
 *             i++;
 *         }
 *         Arrays.sort(d);
 *
 *         List<Integer> lit = new ArrayList<>();
 *
 *         for (int a : A) {
 *
 *             int index = Arrays.binarySearch(d, a);
 *
 *             int count = 2;
 *             while (count > 0 && index < d.length) {
 *                 index++;
 *                 if (index < d.length && a < d[index]) {
 *                     count--;
 *                 }
 *                 if (count ==0) {
 *                     lit.add(a);
 *                     break;
 *                 }
 *             }
 *         }
 *
 *         int[] r = new int[lit.size()];
 *
 *         for (int ii = 0; ii < lit.size(); ii++) {
 *             r[ii] = lit.get(ii);
 *         }
 *
 *         return r;
 *
 *
 *     }
 * }
 */