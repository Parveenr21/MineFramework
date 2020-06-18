package p1;

public class IncrementingMaxSubstring {


    public static void main(String... ddd) {

        foo(new int[]{2, 5, 11, 10, 1, 14, 7, 3, 16, 9, 8, 6, 18, 12, 15, 17, 13, 4,9,11,19,9},2);

    }


    //Rotate array by K
    static void foo(int arr[],int k) {


        int length=0;
        int findex=0,lindex=0;
        int counter=0;
        int f1=0,l1=0;



        for (int i=0;i<arr.length-1;i++)
        {

            if(arr[i]<arr[i+1])
            {
                l1=i+1;
                counter++;

            }

            else{

                if(counter>=length)
                {
                    lindex=l1;
                    findex=f1;
                    length=lindex-findex;
                }

                f1=i+1;
                counter=0;

            }





        }


        System.out.println(findex);
        System.out.println(lindex);





    }


}






