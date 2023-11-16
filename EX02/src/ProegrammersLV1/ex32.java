package ProegrammersLV1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex32 {
    public static void main(String[] args) {
        int[]arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int num = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != num){
                arrList.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
