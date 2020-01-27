package arrays;

import java.util.Arrays;

public class CheckTwoRotateArrayAreEqual {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{4,5,1,2,3};

       // leftRotatebyOne(a,a.length);
        rightRotatebyOne(a,a.length,b);

       // boolean same = compare(a,b);



    }

    public  static boolean compare(int a[],int[] b){

        if(Arrays.equals(a,b)) return  true;

        int[] copy = Arrays.copyOf(a,a.length);
        int l = a.length -1 ;

        int i, temp;
        temp = a[0];
        for (i = 0; i < l+1; i++){
            a[i] = a[i + 1];
        }

        a[i] = temp;
        if(Arrays.equals(a,b)) return  true;



        return  false;
    }

   static void  leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);

    }

    static  void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    static  void rightRotatebyOne(int arr[], int n,int[] b)
    {
        int i, temp;

        for( int j = 0 ; j < n-1; j++){
            temp = arr[n-1];
            for (i = n-1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[i] = temp;

            if(Arrays.equals(arr,b)){
                System.out.println(" :thums up::: ");
            }

        }

    }
}
