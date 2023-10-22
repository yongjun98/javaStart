package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex125 {
    public static void main(String[] args) {
        String [] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution(names)));
    }

    private static String[] solution(String[] names) {
        List<String> answerList = new ArrayList<>();

        while (names.length > 0) {
            String[] group = Arrays.copyOfRange(names, 0, Math.min(5, names.length));
            answerList.add(group[0]);
            names = Arrays.copyOfRange(names, Math.min(5, names.length), names.length);
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
