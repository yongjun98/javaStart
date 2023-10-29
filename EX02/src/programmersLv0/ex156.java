package programmersLv0;

import java.util.Arrays;

public class ex156 {
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4};
        int[][]queries = {{0,1},{1,2},{2,3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int[]answer = Arrays.copyOf(arr,arr.length);

        for(int i=0; i< queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j=s; j<=e; j++){
                answer[j]++;
            }
        }
        return answer;
    }
}
