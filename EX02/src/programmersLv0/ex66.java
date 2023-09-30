package programmersLv0;

import java.util.Arrays;

public class ex66 {
    public static void main(String[] args) {
        int[]num_list = {4,2,6,1,7,6};
        int n =2;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer ;
        int index = 0;
        if(num_list.length % n ==0){
            answer = new int[num_list.length/n];
        }
        else{
            answer = new int[num_list.length/n+1];
        }
        for(int i=0; i<num_list.length; i+=n){
            answer[index++] = num_list[i];
        }
        return answer;
    }
}
