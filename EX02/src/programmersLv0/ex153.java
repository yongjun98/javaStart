package programmersLv0;

import java.util.Arrays;

public class ex153 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }

    private static int[] solution(int[] arr, int[][] intervals) {
        int length = 0;

        for (int i = 0; i < intervals.length; i++) {
            int[] group = intervals[i];
            length += group[1] - group[0] + 1;
        }

        int[] answer = new int[length];
        int index = 0;

        for (int i = 0;i < intervals.length; i++) {
            int[] group = intervals[i];
            for (int j = group[0]; j <= group[1]; j++) {
                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}
