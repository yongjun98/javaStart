package ProegrammersLV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ex48 {
    public static void main(String[] args) {
        int k = 3;
        int[]score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(k, score)));
    }

    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<Integer>();
        for(int i=0;i<score.length;i++){
            rank.add(score[i]);
            Collections.sort(rank);
            if(i>=k) rank.remove(0);
            answer[i] = rank.get(0);
        }
        return answer;
    }
}
