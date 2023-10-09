package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex88 {
    public static void main(String[] args) {
        int [] num_list = {2,1,6};
        int n = 1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer>answer = new ArrayList<>();

        for(int i=n; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        for(int i=0; i<n; i++){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
