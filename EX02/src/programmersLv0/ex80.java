package programmersLv0;

import java.util.Arrays;

public class ex80 {
    public static void main(String[] args) {
        int [] array = {1,8,3};
        System.out.println(Arrays.toString(solution(array)));
    }

    private static int [] solution(int[] array) {
        int[] answer = new int [2];

        int max = 0;
        int index = 0;
        for(int i =0; i<array.length; i++) {
            if( max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;


        return answer;
    }
}
