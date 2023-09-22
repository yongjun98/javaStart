package programmersLv0;

import java.util.Arrays;

public class ex34 {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer = my_string;
        String[] str = {"a","e","i","o","u"};

        for(String s :str){
            answer = answer.replaceAll(s,"");
        }
        return answer;
    }
}
