package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class q3 {
    public static void main(String[] Args){
        var input = new int[] {4, 3, 2, 1, 6, 9, 7}; // var expected = new int[] {1, 4, 9, 25, 36, 64, 81};
        System.out.println(sortedSquaredArray(input));

        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        var actual = tournamentWinner(competitions, results);
        System.out.println("winner is "+ actual);
    }

    public static int sortedSquaredArray(int[] array) {
        int [] sortedSquared = new int[array.length];

        for(int x=0; x< array.length; x++){
            int val = array[x];
            sortedSquared[x] = val * val;
        }
        Arrays.sort(sortedSquared);
        return sortedSquared[6];
    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put(currentBestTeam,0);
        int HOME_TEAM_WON = 1;

        for(int idx= 0; idx<competitions.size(); idx++){
            int result = results.get(idx);
            ArrayList<String> competition = competitions.get(idx);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updateScores(winningTeam,3,scores);
            if(scores.get(winningTeam) > scores.get(currentBestTeam)){
                currentBestTeam = winningTeam;
            }
        }
        return  currentBestTeam;
    }

    public static void updateScores(String team, int points, HashMap<String,Integer> scores){
        if(!scores.containsKey(team)){
            scores.put(team,0);
        }

        scores.put(team, scores.get(team)+ points);
    }

}
