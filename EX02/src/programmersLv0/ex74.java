package programmersLv0;

import java.util.Arrays;

public class ex74 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,100,99,98};
        int k = 3;
        System.out.println(Arrays.toString(solution(arr, k)));
    }

    private static int[] solution(int[] arr, int k) {

        if(k%2 == 0){
            for(int i=0; i< arr.length; i++){
                arr[i]+= k;
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        }
            return arr;
    }
}
