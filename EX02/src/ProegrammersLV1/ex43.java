package ProegrammersLV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex43 {
    public static void main(String[] args) {
        int[]array = {1, 5, 2, 6, 3, 7, 4};
        int[][]commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i =0; i<commands.length; i++) {
            List<Integer> arrInt = new ArrayList<Integer>();
            for(int j = commands[i][0]-1; j<commands[i][1]; j++) {
                arrInt.add(array[j]);
            }
            Collections.sort(arrInt);
            answer[i] =arrInt.get(commands[i][2]-1);

        }
        return answer;
    }
}
