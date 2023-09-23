package programmersLv0;

import java.util.Arrays;

public class ex37 {
    public static void main(String[] args) {
        int []array = {1,2,7,10,11};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
