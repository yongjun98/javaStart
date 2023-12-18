package programmerslv1re;

import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        int[]arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    private static int[] solution(int[] arr, int divisor) {
        int count = 0;
        int number = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }

        if(count == 0){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}
