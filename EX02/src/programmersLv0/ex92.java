package programmersLv0;

import java.util.Arrays;

public class ex92 {
    public static void main(String[] args) {
        int [] numbers = {1,2,-3,4,-5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int num1 = numbers[0]*numbers[1];
        int num2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        if(num1<num2){
            return num2;
        }
        else{
            return num1;
        }
    }
}
