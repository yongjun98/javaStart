package programmersLv0;

import java.util.Arrays;

public class ex134 {
    public static void main(String[] args) {
        int[]array = {3,10,28};
        int n = 20;
        System.out.println(solution(array,n));
    }

    private static int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                int leftValue = n - array[(i - 1)];
                int rightValue = array[i] - n;
                return leftValue <= rightValue ? array[(i - 1)] : array[i];
            }
        }
        return array[array.length - 1];
    }
}
