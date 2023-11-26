package ProegrammersLV1;

import java.util.Arrays;

public class ex52 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[]score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k,m,score));
    }

    private static int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxnum = score.length / m;
        Arrays.sort(score);

        if(score.length % m == 0) {
            for(int i = 0; i < boxnum; i++) {
                answer += (score[i * m]) * m * 1;
            }
        } else {
            int r = score.length % m;
            for(int i = 0; i < boxnum; i++) {
                answer += (score[r + (i * m)]) * m * 1;
            }
        }

        return answer;
    }
}
