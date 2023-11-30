package ProegrammersLV1;

import java.util.Arrays;
public class ex66 {
    public static void main(String[] args) {
        int n = 5;
        int[]stages = {2,1,2,6,2,4,3,3};
        System.out.println(Arrays.toString(solution(n, stages)));
    }

    private static int[] solution(int n, int[] stages) {
        int[] check = new int[n]; // 1단계의 값을 저장할 배열
        double[] rate = new double[n]; // 2단계의 실패율을 저장할 배열
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    check[i]++;
                }
            }
        }

        int denominator = stages.length;
        for (int i = 0; i < check.length; i++) {
            int numerator = check[i];
            if (denominator == 0) {
                rate[i] = 0;
            } else {
                rate[i] = (double) numerator / denominator;
            }
            denominator -= check[i];
        }
        double max = 0;
        int target = 1;
        for (int i = 0; i < rate.length; i++) {
            max = rate[0];
            target = 1;
            for (int j = 0; j < rate.length; j++) {
                if (rate[j] > max) {
                    max = rate[j];
                    target = j + 1;
                }
            }
            rate[target - 1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}
