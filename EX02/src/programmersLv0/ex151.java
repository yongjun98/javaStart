package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;

public class ex151 {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answerList.add(i);
                if (n / i != i) answerList.add(n / i);
            }
        }
        return answerList.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}
