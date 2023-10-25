package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex136 {
    public static void main(String[] args) {
        int[]arr = {5,1,4};
        System.out.println(solution(arr));
    }

    public static List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
