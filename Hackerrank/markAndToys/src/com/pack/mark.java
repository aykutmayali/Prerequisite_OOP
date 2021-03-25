package com.pack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class mark {
    //static List canbuy = new ArrayList();
    static int maximumToys(int[] prices, int k) {
        int maxtoys =0;
        if(k==0 || prices.length==0) return maxtoys;

        bubbleSort(prices);

        for(int i=0; i< prices.length; i++){
            k -= prices[i];
            if(k<0) return maxtoys;
            maxtoys++;
        }

        return maxtoys;
    }

    static void bubbleSort(int[] arr){
        int temp;
        for(int i=0; i< arr.length; i++){
            for(int j=1; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }
        */
        int k = 10;
        int[] prices = {1,2,5,4,8,3,10,6};
        int result = maximumToys(prices, k);
        System.out.println(result);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();

       */
    }

}
