package ProegrammersLV1;

import java.util.Arrays;

public class ex28 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);

        for(int i = arr.length - 1 ; i >= 0; i--){
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}
