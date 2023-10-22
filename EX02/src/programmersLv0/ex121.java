package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex121 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(solution(k, n));
    }

    private static List<Integer> solution(int k, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i=1; k*i<=n; i++) {
            answer.add(k*i);
        }
        return answer;
    }
}
