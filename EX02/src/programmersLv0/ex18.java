package programmersLv0;

import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        int money = 5500;
        System.out.println(Arrays.toString(solution(money)));
    }

    private static int[] solution(int money) {
        int [] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}
