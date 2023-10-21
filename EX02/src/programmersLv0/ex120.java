package programmersLv0;

import java.util.Arrays;

public class ex120 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    private static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");

        String[] arr = my_string.split("");
        int[]answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}
