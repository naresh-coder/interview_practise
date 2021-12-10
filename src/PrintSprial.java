package com.startup;

public class PrintSprial {

    public static void main(String[] args) {
        generateMatrix(5);
    }

    public static int[][] generateMatrix(int A) {

        if(A==1){
            int[][] a = new int[1][1];
            a[0][0] =1;
            return a;
        }

        int value = A * A;

        int[][] a = new int[A][A];

        int n = A;
        int m = A;
        int v = 1;
        int i =0;
        int j =0;
        while( n > 1 && m > 1 ){

            for(int k = 1; k <m; k++){
                a[i][j] = v++;
                j++;
            }
            for(int k =1; k < n; k++){
                a[i][j] = v++;
                i++;
            }
            for(int k =1; k < m; k++){
                a[i][j]= v++;
                j--;
            }
            for(int k =1; k < n; k++){
                a[i][j]=v++;
                i--;
            }

            n = n-2;
            m =m-2;
            i++;
            j++;

        }
        if(n ==0 || m == 0){
            return a;

        }

        if(n ==1 || m==1 ){

            if(n > 1){
                for(int k=1 ;k <= n ;k++){
                    a[i][j]=v++;
                    i++;
                }
            }
            else{
                for(int k=1 ;k <= m ;k++){
                    a[i][j]=v++;
                    j++;
                }
            }

        }

        return a;


    }
}
