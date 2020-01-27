package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class triphletSumSets {


    // Naive recursive function to check if triplet exists in array
    // with given sum
    public static void tripletExists(int[] A, int n, int sum, int count, List<Integer> integerList) {
        // if triplet has desired sum, return true
        if (count == 3 && sum == 0) {
            System.out.println("integerList = " + integerList);
        }

        // return false if sum is not possible with current configuration
        if (count == 3 || n == 0 || sum < 0) {
            return;
        }

        // recur with
        // 1. including current element
        // 2. excluding current element
        integerList.add(A[n - 1]);
        tripletExists(A, n - 1, sum - A[n - 1], count + 1, integerList);
        integerList.remove(integerList.size() - 1);
        tripletExists(A, n - 1, sum, count, integerList);
    }

    // Find Triplet with given sum in an array
    public static void main(String[] args) {
        int[] A = {2, 2, 3, 0, 9, 5, 1, 3,1};
        int sum = 6;
        List<Integer> integers = new ArrayList<>();
        tripletExists(A, A.length, sum, 0, integers);
    }

}
