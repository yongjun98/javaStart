package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex83 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    private static int[] solution(int[] arr, int[] delete_list) {
        int size = arr.length;
        boolean[] isDeleted = new boolean[size];
        int resultSize = size;
        for (int num : delete_list) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == num) {
                    isDeleted[i] = true;
                    resultSize--;
                    break;

                }
            }
        }
        int[] answer = new int[resultSize];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (!isDeleted[i]) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}

