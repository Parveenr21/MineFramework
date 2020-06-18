package p1;

import java.util.HashMap;

public class TMp2 {


    public static void main(String... ddd) {

        foo(new int[]{2, 5, 11, 10, 1, 14, 7, 3, 16, 9, 8, 6, 18, 12, 15, 17, 13, 4});

    }



    static void foo(int arr[]) {

        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=1;i<=arr.length;i++)   mp.put(i,arr[i-1]);
        // for(int i=1;i<=arr.length;i++) System.out.println(mp.get(mp.get(i)));

        HashMap<Integer,Integer> mp2=new HashMap<Integer, Integer>();

        for(int i=1;i<=arr.length;i++)   mp2.put(i,mp.get(mp.get(i)));

        for(int i=1;i<=arr.length;i++) System.out.println(mp2.get(mp2.get(i)));
    }


}






