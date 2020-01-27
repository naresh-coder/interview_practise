package interview;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int numberOfIngredients = in.nextInt();
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        map.put("FIBER", new ArrayList<>());
        map.put("FAT", new ArrayList<>());
        map.put("CARB", new ArrayList<>());

        int[] indexs = new int[3];

        int min = 0;
        for (int i = 0; i < numberOfDays; i++) {
            String ingredientId = in.next();
            if (ingredientId.indexOf("FIBER") != 0) {
                map.get("FIBER").add(ingredientId);
                indexs[0]++;
            }  else if (ingredientId.indexOf("CARB") != 0) {
                map.get("CARB").add(ingredientId);
                indexs[1]++;
            }  else if (ingredientId.indexOf("FAT") != 0) {
                map.get("FAT").add(ingredientId);
                indexs[2]++;
            }
        }

        min = Math.max(indexs[2], Math.max(indexs[1], indexs[0]));
        int v = min = Math.min(indexs[2], Math.min(indexs[1], indexs[0]));
        min = v - min;
        LinkedHashSet<String> dish = new LinkedHashSet<>();

        int i = 0;
        int m = 3;
        if (min == 0) {
            min = 1;
        }
        int max = min * 3;
        while (numberOfIngredients > 0) {


            for (Map.Entry<String, List<String>> entry : map.entrySet()) {

                List<String> lg = entry.getValue();

                if (!lg.isEmpty() && numberOfIngredients != 0) {

                    if (!dish.contains(lg.get(i))) {
                        dish.add(lg.get(i));
                        lg.remove(i);
                        numberOfIngredients--;
                    }


                }


            }

        }
        StringBuffer br = new StringBuffer();
        br.append("---");

        for (String dis : dish) {
            br.append(dis);
            br.append(":");
        }
        br.append("--");

        System.out.println(br.toString());

        //return  c;


    }
}