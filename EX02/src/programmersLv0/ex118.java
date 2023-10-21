package programmersLv0;

import java.util.Arrays;

public class ex118 {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String[] answer = {};
        return Arrays.toString(my_string.split(" "));
    }
}
