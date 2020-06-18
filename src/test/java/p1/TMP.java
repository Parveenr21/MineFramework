package p1;

public class TMP {

    public static void main(String... ddd) {

        foo(new int[]{2, 5, 11, 10, 1, 14, 7, 3, 16, 9, 8, 6, 18, 12, 15, 17, 13, 4});

    }


    static void foo(int arr[]) {

        int k[] = perm(arr);

        for (int i = 0; i < k.length; i++) {

            System.out.println(k[i]);
        }


    }


    static int[] perm(int[] p) {

        int arr[] = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            arr[i] = p[p[i] - 1];

        }

        return arr;
    }


}
