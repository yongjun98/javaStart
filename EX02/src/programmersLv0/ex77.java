package programmersLv0;

import java.util.Arrays;

public class ex77 {
    public static void main(String[] args) {
        int [] num_list = {12,4,15,46,38,1,14};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i=0; i<5;i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
