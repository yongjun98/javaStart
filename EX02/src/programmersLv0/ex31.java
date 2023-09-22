package programmersLv0;

import java.util.Arrays;

public class ex31 {
    public static void main(String[] args) {
        int [] sides = {1,2,3};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if( sides[2] < (sides[0] + sides[1]) ) {
            answer = 1;
        } else {
            answer = 2;
        }


        return answer;
    }
}
