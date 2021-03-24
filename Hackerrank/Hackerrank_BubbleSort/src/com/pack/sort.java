package com.pack;

import java.util.Scanner;

public class sort {

    static int counter =0;

    static void countSwaps(int[] a) {
        int len = a.length;
        int i,j,tempo;
        // if left > right then swap
        for(i=0; i<len; i++){
            for(j=0; j<len-1; j++){
                if(a[j]>a[j+1]){
                    swap_it(a,j,j+1);
                    counter++;
                }
            }
        }
    }

    static void swap_it(int [] arr, int a, int b){
        int temp;
        if(arr[a]>arr[b]){
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       /* int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        */

        int[] a = {2,6,1,3,5,4};

        countSwaps(a);
     /*   System.out.printf("Array is sorted in %d swaps.\n", counter);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d\n", a[n-1]);    */

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        //scanner.close();
    }
}
