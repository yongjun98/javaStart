package programmersLv0;

import java.util.Arrays;

public class ex94 {
    public static void main(String[] args) {
        String my_string = "i love you";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    private static String[] solution(String my_string) {

            return my_string.split(" ");

    }
}
