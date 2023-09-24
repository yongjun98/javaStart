package programmersLv0;

import java.util.Arrays;

public class ex48 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n =1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    private static int[] solution(int[] num_list, int n) {
        int [] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
