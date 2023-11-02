package programmersLv0;

import java.util.Arrays;

public class ex161 {
    public static void main(String[] args) {
        int n = 3;
        int[]slicer = {1,5,2};
        int[]num_list = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }

    private static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int[] answer;

        if (n == 1) {
            answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            for (int i = a; i < num_list.length; i++) {
                answer[i - a] = num_list[i];
            }
        } else if (n == 3) {
            answer = new int[b - a + 1];
            for (int i = a; i <= b; i++) {
                answer[i - a] = num_list[i];
            }
        } else if (n == 4) {
            int count = (b - a + 1) / c;
            if ((b - a + 1) % c != 0) {
                count++;
            }
            answer = new int[count];

            int index = 0;
            for (int i = a; i <= b; i += c) {
                answer[index++] = num_list[i];
            }
        } else {

            answer = new int[0];
        }

        return answer;
    }
}
