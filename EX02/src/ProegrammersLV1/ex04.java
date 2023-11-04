package ProegrammersLV1;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int x =2;
        int n =5;
        System.out.println(Arrays.toString(solution(x, n)));
    }

    private static long[] solution(int x, int n) {
        long [] answer = new long[n];
        long num = x;
        for(int i=0; i<answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
