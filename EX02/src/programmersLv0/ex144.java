package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex144 {
    public static void main(String[] args) {
        String [] todo_list ={"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[]finished = {true, false, true, false};
        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
