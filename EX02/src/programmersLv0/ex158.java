package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex158 {
    public static void main(String[] args) {
        int[]array = {3,10,28};
        int n =20;
        System.out.println(solution(array,n));
    }

    private static int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
        Arrays.sort(array);
        for (int i=0; i<array.length; i++) {
            a.add(Math.abs(array[i]-n));
        }
        int min = a.get(0); int idx = 0;
        for (int i=1; i<a.size(); i++) {
            if (a.get(i)<min) {
                min = a.get(i);
                idx = i;
            }
        }
        answer = array[idx];
        return answer;
    }
}
