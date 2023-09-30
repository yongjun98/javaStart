package programmersLv0;

import java.util.Arrays;

public class ex69 {
    public static void main(String[] args) {
        int start = 10;
        int end = 3;
        System.out.println(Arrays.toString(solution(start, end)));
    }

    private static int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for(int i=0; i< answer.length; i++){
            answer[i] = start--;
        }
        return answer;
    }
}
