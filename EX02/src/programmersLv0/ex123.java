package programmersLv0;

import java.util.Arrays;

public class ex123 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    private static int[] solution(int[] numbers, String direction) {
        if (direction.equals("right")) {
        int temp = numbers[numbers.length - 1];
        for (int i = numbers.length - 2; i >= 0; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[0] = temp;
        return numbers;
    } else {
            int temp = numbers[0];
            for (int i = 0; i <= numbers.length - 2; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
            return numbers;
        }
    }
}
