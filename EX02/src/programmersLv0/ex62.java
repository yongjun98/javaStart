package programmersLv0;

import java.util.Arrays;

public class ex62 {
    public static void main(String[] args) {
        int [] num_list = {12,4,15,46,38,1,14,56,32,10};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int [] answer = new int[num_list.length-5];
        for(int i=5; i<num_list.length; i++){
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}
