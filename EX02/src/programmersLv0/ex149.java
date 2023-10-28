package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex149 {
    public static void main(String[] args) {
        String myString = "axbxcxdx";
        System.out.println(Arrays.toString(solution(myString)));
    }

    private static String[] solution(String myString) {
        String[] parts = myString.split("x");
        String[] answer = Arrays.stream(parts)
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
        return answer;
    }
}
