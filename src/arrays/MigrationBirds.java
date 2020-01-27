package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MigrationBirds {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1 2 3 4 5 4 3 2 1 3 4
        list.add(1);
        list.add(2);
        list.add(3); list.add(4); list.add(5); list.add(4); list.add(3); list.add(2); list.add(1); list.add(3); list.add(4);
        int[] ar =new int[]{1, 4, 4, 4, 5, 3};
        //list = (List<Integer>) Arrays.stream(ar).collect(Collectors.toList());



        migratoryBirds(list);

    }

    static int migratoryBirds(List<Integer> arr) {
        int[] type = new int[7];

        for(int i = 0 ; i < arr.size(); i++){
            type[arr.get(i)]++;
        }

        int t = 0;
        for(int i = 1 ; i < type.length-1; i++){
            if(type[i] <= type[i+1]){
                t = i;
            }
        }

        return t;


    }
}
