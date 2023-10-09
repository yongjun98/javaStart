package programmersLv0;

import java.util.Arrays;

public class ex87 {
    public static void main(String[] args) {
        int [] arr = {49,12,100,276,33};
        int n =27;
        System.out.println(Arrays.toString(solution(arr, n)));
    }

    private static int[] solution(int[] arr, int n) {
        for(int i=0; i<arr.length; i++){
            if(arr.length%2==1 && i%2==0){
                arr[i] += n;
            }
            if(arr.length%2==0 && i%2==1){
                arr[i] += n;
            }
        }
        return arr;
    }
}
