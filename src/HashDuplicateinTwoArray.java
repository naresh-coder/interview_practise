package com.startup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashDuplicateinTwoArray {

    public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(10);
        a.add(10);
        b.add(3);
        b.add(6);
        b.add(2);b.add(10);
        b.add(10);
        solve(a,b);

    }
    public  static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer a : A){
            Integer c = map.get(a);
            if(c !=null){
                map.put(a,c+1);
            }
            else{
                map.put(a,1) ;
            }
        }

        for(Integer a : B){
            Integer c = map.get(a);
            if(c !=null){
                c= c-1;
                if (c >= 0) {
                    result.add(a);
                    map.put(a,c);
                }
            }
            else{
                map.put(a,-1) ;
            }
        }

        return result;
    }




}
