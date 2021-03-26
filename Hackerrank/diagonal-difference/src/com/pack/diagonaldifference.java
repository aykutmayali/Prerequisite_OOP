package com.pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class diagonaldifference {


        public static void main(String[] args) throws IOException {
         //   List<List<Integer>> arr = new ArrayList<>();
            List<List<Integer>> arr = Arrays.asList(
                    Arrays.asList(11, 2, 4),
                    Arrays.asList(4, 5, 6),
                    Arrays.asList(10, 8, -12));
            printMatrix(arr);
         /* System.out.println(arr.get(0).get(0));
            System.out.println(arr.get(0).get(1));
            System.out.println(arr.get(0).get(2));
            System.out.println(arr.get(2).get(0));
            System.out.println(arr.get(2).get(1));
            System.out.println(arr.get(2).get(2)); */
           System.out.println( diagonalDifference(arr));

        }

        public static void printMatrix(List<List<Integer>> m) {

            for(List<Integer> el : m) {
                for(Integer i: el) {
                    System.out.print(i + ", ");
                } // end inner for loop
                System.out.println();
            } // end outer for loop

        } // end printMatrix method

        public static int diagonalDifference(List<List<Integer>> arr){
            int sum =0;
            int sum1 =0;
            int sum2 =0;
            int len = arr.size();

            for(int i=0; i<len; i++){
                sum1 += arr.get(i).get(i);
            }
            for(int i=0; i<len; i++){
                sum2 += arr.get(i).get(len-i-1);
            }
            sum = sum1 - sum2;
            if(sum<0) sum *= -1;

            return sum;
        }
    }

