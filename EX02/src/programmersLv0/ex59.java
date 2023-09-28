package programmersLv0;

import java.util.Arrays;

public class ex59 {
    public static void main(String[] args) {
        String [] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(Arrays.toString(solution(strArr)));
    }

    private static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
