package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex159 {
    public static void main(String[] args) {
        String[]intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }

    private static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
