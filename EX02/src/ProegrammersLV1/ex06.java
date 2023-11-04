package ProegrammersLV1;

import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(long n) {
        String arrStr = Long.toString(n);
        int[]answer = new int[arrStr.length()];

        for(int i=arrStr.length()-1; i>=0; i--){
            answer[arrStr.length()-1-i] = arrStr.charAt(i) -'0';
        }
        return answer;
    }
}
