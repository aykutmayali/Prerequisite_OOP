package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class question1 {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> numbers2 = new ArrayList<Integer>();

      //  numbers = Arrays.asList(10,15,3,1,6,11);
        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(1);
        numbers.add(16);
        numbers.add(11);

        int targetSum =17;
        findTarget(numbers, targetSum);
        findTarget2(numbers,targetSum);

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);

        findMultipleCompilation(numbers2);


    }

    private static void findMultipleCompilation(List<Integer> numbers2) {
        ArrayList<Integer> newList = new ArrayList<>();
        int[] multiArray = {1,1,1,1};

        for(int j= 0; j<numbers2.size(); j++){
            for(int i=0; i<numbers2.size(); i++){
                if(i == j){
                    continue;
                } else{
                    multiArray[j] *=(numbers2.get(i));
                }
            }
        }

        for(int i=0; i<multiArray.length; i++){
            System.out.println(multiArray[i]);
        }
    }

    private static void findTarget(List<Integer> numbers, int target) {
        for(int j=0; j< numbers.size(); j++){
            int x =target - numbers.get(j);
            List<Integer> array = numbers;
            array.remove(j);
            for(int i=0; i<array.size();i++){
                if(x == array.get(i)) System.out.println(" This array elements can find target with summation");
            }
        }
    }

    private  static  void findTarget2(List<Integer> numbers, int target){
        HashSet<Integer> remains = new HashSet<>();

        for(int i=0; i< numbers.size(); i++){
            int x= target - numbers.get(i);
            remains.add(x);
        }

        for(int i=0; i< numbers.size(); i++){
            int x= target - numbers.get(i);
            if(remains.contains(x)){
                System.out.println(" Target can be supplied with this array");
            }
        }

    }
}
