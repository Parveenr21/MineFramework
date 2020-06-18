package p1;

import java.util.HashMap;

public class ArrayRotate {


    public static void main(String... ddd) {

        foo(new int[]{2, 5, 11, 10, 1, 14, 7, 3, 16, 9, 8, 6, 18, 12, 15, 17, 13, 4},2);

    }


//Rotate array by K
    static void foo(int arr[],int k) {


        for (int i=0;i<arr.length;i++)
        {
            if(i+k-arr.length <0)
            {
                System.out.println(arr[i+k]);

            }
            else

                System.out.println(arr[i+k-arr.length]);


        }







    }


}






