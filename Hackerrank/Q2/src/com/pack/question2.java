package com.pack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class question2 {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int count=0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int x:sequence){
            if(array.contains(x)) {
                if(hashSet.contains(x)){
                    continue;
                } else {
                    hashSet.add(x);
                    count++;
                }
            }
        }
        if(count == sequence.size()  && sequence.size() <= array.size()){
            return true;
        } else{
            return false;
        }
    }
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int seqId =0;
        for(var value:array){
            if(seqId == sequence.size()){
                break;
            }
            if(sequence.get(seqId).equals(value)){
                seqId++;
            }
        }
        return seqId == sequence.size();

    }

    public static void main(String[] Args){
        List<Integer> array = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> sequnce = Arrays.asList(5,1,22,25,6,-1,8,10,10);

        System.out.print(isValidSubsequence(array,sequnce));
    }
}
