package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex91 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(solution(todo_list, finished));
    }

    private static List solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                answer.add(todo_list[i]);
            }
        }
        return answer;
    }
}
