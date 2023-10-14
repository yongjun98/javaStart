package programmersLv0;

import java.util.Arrays;

public class ex108 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer ="";
        String[] arr = my_string.toLowerCase().split("");

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            answer+=arr[i];
        }
        return answer;
    }

}
