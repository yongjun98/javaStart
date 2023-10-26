package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex142 {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        System.out.println(solution(my_string));
    }

    public static List solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] my_string_list = my_string.split(" ");
        for(int i = 0; i<my_string_list.length;i++){
            if(!my_string_list[i].equals("")){
                answer.add(my_string_list[i]);
            }
        }
        return answer;
    }
}
