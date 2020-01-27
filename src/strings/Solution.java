package strings;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the intervalSelection function below.
     */
    static int intervalSelection(int[][] intervals) {


        Arrays.sort(intervals,(int[] a, int[] b)->a[1]-b[1]);
      /*  int count=0, busy[][]=new int[2][2];

        for(int[] x: intv){
            if(x[0]>busy[1][1]){
                System.out.println("*******************");

                System.out.println(" busy[1]= "+Arrays.toString(busy[1]));
                System.out.println(" x  = "+ Arrays.toString(x));
                ++count;
                busy[1]=x;
                System.out.println(" busy[1] = x "+Arrays.toString(busy[1]));
                System.out.println(" --------------- ");

            }else if(x[0]>busy[0][1]){
                System.out.println("=====================");
                ++count;
                System.out.println(" x  = "+ Arrays.toString(x));
                busy[0]=x;
                System.out.println(" busy[0] = x "+Arrays.toString(busy[0]));

                if(x[1]>busy[1][1]){
                    System.out.println(" -----swap x[1] > busy[1][1]------ ");
                    System.out.println(" busy[0] = x "+Arrays.toString(busy[0]));
                    System.out.println(" busy[1] = x "+Arrays.toString(busy[1]));
                    int[] temp=busy[0];
                    busy[0]=busy[1];
                    busy[1]=temp;
                    System.out.println(" busy[0] = x "+Arrays.toString(busy[0]));
                    System.out.println(" busy[1] = x "+Arrays.toString(busy[1]));

                }
                System.out.println(" --------------- ");

            }
        }
        return count;
*/
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[0]);
            } else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else  {
                    count++;
                }

                heap.offer(itv[1]);
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = Integer.parseInt(scanner.nextLine().trim());

        for (int sItr = 0; sItr < s; sItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[][] intervals = new int[n][2];

            for (int intervalsRowItr = 0; intervalsRowItr < n; intervalsRowItr++) {
                String[] intervalsRowItems = scanner.nextLine().split(" ");

                for (int intervalsColumnItr = 0; intervalsColumnItr < 2; intervalsColumnItr++) {
                    int intervalsItem = Integer.parseInt(intervalsRowItems[intervalsColumnItr].trim());
                    intervals[intervalsRowItr][intervalsColumnItr] = intervalsItem;
                }
            }

            int result = intervalSelection(intervals);
            System.out.println(result);

           // bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

       // bufferedWriter.close();
    }
}
