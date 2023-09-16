package programmersLv0;

import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int [] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}
