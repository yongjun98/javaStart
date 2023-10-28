package programmersLv0;

import java.util.Arrays;

public class ex151 {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int[] answer;
        int j = 0;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        answer = new int[count];
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
            answer[j] = i;
            j++;
        }
    }
        return answer;
    }
}
