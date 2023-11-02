package programmersLv0;

import java.util.Arrays;

public class ex162 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before,after));
    }

    private static int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        if (str1.equals(str2)){
            return 1;
        }
        else{
            return 0;
        }

    }
}
