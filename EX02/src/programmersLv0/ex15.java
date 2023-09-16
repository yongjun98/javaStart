package programmersLv0;

import java.util.Arrays;

public class ex15 {
    public static void main(String[] args) {
        String strlist[] = {"We","are","the","world"};
        System.out.println(Arrays.toString(solution(strlist)));
    }

    private static int[] solution(String[] strlist) {
        int[]answer = new int[strlist.length];
        int length = strlist.length;
        for(int i=0; i<length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
