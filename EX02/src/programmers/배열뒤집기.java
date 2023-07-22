package programmers;

import java.util.Arrays;

//parameter : num_list
// return 타입 : int[]
public class 배열뒤집기 {
    public static void main(String[] args) {
        int [] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i<num_list.length; i++){
            answer[i]=num_list[num_list.length-i-1];
        }
        return answer;
    }
}
