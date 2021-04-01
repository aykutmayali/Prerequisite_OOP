package com.pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gradingStudent {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> finalGrade= new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
            int temp = grades.get(i) %5;
            int diff = 5-temp;
            if( diff <3 && grades.get(i)>= 38){
                int upgrade = grades.get(i) + diff;
                finalGrade.add(upgrade);
            } else if( diff >= 3 && grades.get(i) >= 38){
                finalGrade.add(grades.get(i));
            } else {
                finalGrade.add(grades.get(i));
            }
        }

        return finalGrade;
    }

    public static void main(String[] args ) throws IOException{
        List<Integer> arr = Arrays.asList(73,67,38,33);
        // System.out.println(arr.get(0));
        List<Integer> a = gradingStudents(arr);
        for (int x:a
             ) {
            System.out.println(x);
        }
    }

}
