package programmersLv0;

import java.util.Arrays;

public class ex122 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString)));
    }

    private static int[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        int[] lengths = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            lengths[i] = parts[i].length();
        }

        return lengths;
    }
}
