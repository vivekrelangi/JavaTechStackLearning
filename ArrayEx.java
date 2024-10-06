package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        /*int[] arr0 = new int[5];
        String[] arr1 = new String[5];
        String[] arr = {"Hello","Welcome","To","Arrays","."};

        for(int inc = 0; inc < 5 ; inc++){
            System.out.println(arr[inc]);
        }
        for(int inc = 0; inc < 5 ; inc++){
            System.out.println(arr0[inc]);
        }
        for(int inc = 0; inc < 5 ; inc++){
            System.out.println(arr1[inc]);
        }*/

        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }*/
//
//        for(int i = 0; i< n ; i++){
//            System.out.println(arr2[i]);
//        }
        /*for (int a:arr2){
         *//*System.out.println(a-2);*//*
            System.out.println(a);
        }*/
        //int[] arr3 = {2, 4, 3, 1, 6};
        //int[] arr4 = new int[5];//recommended way to create arrays
        int arr4[] = new int[5];
        //for loop
        /*for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }*/

        /*Arrays.sort(arr3);

        System.out.println("Index of 6:"+Arrays.binarySearch(arr3,6));*///for using binary search an array must be sorted

//BUBBLE SORT
/*        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length-1;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }

        System.out.println("After sorting");
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }*/

        //swap(arr3,1,3);
        Arrays.fill(arr4,7);
        for(int b:arr4){
            System.out.println(b);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
