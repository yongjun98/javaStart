package ProegrammersLV1;

import java.util.Arrays;

public class ex58 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(soluton(lottos, win_nums)));
    }

    private static int[] soluton(int[] lottos, int[] win_nums) {
        int[] score = {6, 6, 5, 4, 3, 2, 1};
        int same_nums = 0;
        int zero_count = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    same_nums++;
                }
            }
            if (lottos[i] == 0) {
                zero_count++;
            }
        }
        int[] answer = new int[] {score[same_nums + zero_count], score[same_nums]};
        return answer;

    }
}
