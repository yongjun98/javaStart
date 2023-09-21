package programmersLv0;

import java.util.Arrays;

public class ex26 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer =0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
