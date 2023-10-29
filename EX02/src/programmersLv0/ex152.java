package programmersLv0;

import java.util.Arrays;

public class ex152 {
    public static void main(String[] args) {
        String my_string = "banana";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    private static String[] solution(String my_string) {
        int length = my_string.length();
        String[] n = new String[length];


        for (int i = 0; i < length; i++) {
            n[i] = my_string.substring(i);
        }


        Arrays.sort(n);

        return n;
    }
}
